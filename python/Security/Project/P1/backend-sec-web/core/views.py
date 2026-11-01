from rest_framework.decorators import api_view
from rest_framework.response import Response
from .models import Users
from rest_framework import status
from .serializers import UsersSerializer

@api_view(['GET'])
def get_users(request):
    # Lấy toàn bộ user từ database
    danh_sach_user = Users.objects.all()
    # Chuyển đổi dữ liệu Python sang JSON
    serializer = UsersSerializer(danh_sach_user, many=True)
    return Response(serializer.data)

@api_view(['DELETE'])
def delete_user(request, user_id):
    try:
        user = Users.objects.get(id=user_id) # Tìm user theo ID
        user.delete() # Xóa khỏi MySQL
        return Response({"message": "Đã xóa thành công!"}, status=status.HTTP_200_OK)
    except Users.DoesNotExist:
        return Response({"error": "User không tồn tại!"}, status=status.HTTP_404_NOT_FOUND)