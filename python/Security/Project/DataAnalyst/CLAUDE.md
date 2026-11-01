# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

# Phạm vi làm việc
- Thư mục phạm vi: D:\self_study\Git_push\Python\Security\Project\DataAnalyst
- Thư mục phạm vi: D:\self_study\Git_push\Python\GenerateData

# Mục đích
- Dự án học về hash, cryptography, symmetric, asymmetric, được xây dựng bằng cách viết các function nhỏ trong thư mục DataAnalyst.
- GenerateData là nơi sinh dữ liệu mẫu (dùng `faker`) cho hash/cryptography; kết quả sinh ra được dùng làm input cho các script trong DataAnalyst.

# Cách hoạt động
- Mỗi phạm vi thư mục đều chạy trong venv riêng; muốn cài package phải kích hoạt venv tương ứng rồi mới `pip install`.
- Venv GenerateData (`D:\self_study\Git_push\Python\GenerateData`):

```bash
.\fakerdata\Scripts\activate
```

- Venv DataAnalyst (`D:\self_study\Git_push\Python\Security\Project\DataAnalyst`):

```bash
.\venv\Scripts\activate
```

# Lệnh thường dùng
- Chạy script từ thư mục DataAnalyst (đường dẫn file là tương đối, nên phải chạy từ đây): `python hashingfile.py`
- Chưa có test, linter hay build; chưa có `requirements.txt`. Venv hiện chỉ có `faker` và `tzdata` (kèm `pip`); các thư viện crypto khác (nếu cần) phải cài vào venv.

# Kiến trúc
- Mỗi script là một pipeline file-vào/file-ra, đọc/ghi trong thư mục hiện hành, không có package hay module dùng chung.
- `hashingfile.py`: đọc `data.txt` (nhị phân) → SHA-256 → ghi hex digest vào `data_hashed.txt` (ghi đè mỗi lần chạy).
- `data.txt` là văn bản giả do Faker sinh ra; `data_hashed.txt` là output, có thể tái tạo.
- Ghi chú: file này được mở trong IDE là `Claude.md`, còn Claude Code đọc `CLAUDE.md` (cùng file trên Windows do không phân biệt hoa thường).
