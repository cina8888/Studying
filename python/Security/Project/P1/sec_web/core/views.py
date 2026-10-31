from django.shortcuts import render
from .models import Users

def home(request):
    danh_sach_user = Users.objects.all()
    
    return render(request, 'index.html', {'users': danh_sach_user})