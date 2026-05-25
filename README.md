# LAB211 - Cô HueCMT

## Những lưu ý khi học LAB211 cô HueCMT

> Ưu tiên code theo **OOP**. Cô review dễ, miễn logic đúng là được.

---

## Quy tắc code

### 1. Khung chương trình (Main)
- **Trước khi code phải tạo khung chương trình**
- Khung chương trình nằm ở `main`, thể hiện logic của toàn bộ chương trình (ghi rõ các step)
- **Không code ở main** — Main chỉ sử dụng để khai báo biến, gọi hàm

### 2. Biến
- **Không được sử dụng biến toàn cục**
- Đặt tên biến phải **rõ ràng**, dễ hiểu

### 3. Comment
- Phải comment cho **Loop**, **Regex**, **Condition**

### 4. Đặt tên
- Tên hàm đặt theo kiểu `doSomething` — thể hiện được hàm dùng để làm gì
- Tên Class phải đại diện cho những hàm ở bên trong class

---

## Cấu trúc project
```
src/
├── array/      ← Entity class (xử lý dữ liệu, thuật toán)
├── utils/      ← Utility class (Validator - validate input)
└── main/       ← Main class (điều khiển flow chương trình)
```
