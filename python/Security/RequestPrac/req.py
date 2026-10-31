import requests

# 1. Gán kết quả trả về vào một biến (ví dụ: response)
response = requests.get('https://www.python.org', verify=False)

# 2. In ra mã trạng thái (Nếu ra 200 nghĩa là lấy thành công)
print("Trạng thái:", response.status_code)

# 3. In ra nội dung HTML của trang web (lấy 500 ký tự đầu tiên cho đỡ dài)
print("Nội dung web:\n", response.text[:500])