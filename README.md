# LAB211 - Cô HueCMT

## Những lưu ý khi học LAB211 cô HueCMT

> Ưu tiên code theo **OOP**. Cô review dễ, miễn logic đúng là được.

---

## Quy tắc code

### 1. OOP & Tính chất
- Đảm bảo **tính bao đóng** (Encapsulation) — che giấu thông tin
  - Thuộc tính: `private`
  - Phương thức cần thiết: `public`
- Đảm bảo **Cohesion cao** — mỗi class chỉ làm 1 việc
- Đảm bảo **Coupling thấp** — các class ít phụ thuộc nhau

### 2. Khung chương trình (Main)
- Trước khi code phải tạo khung chương trình
- Khung chương trình nằm ở `main`, thể hiện logic toàn bộ chương trình (ghi rõ các step)
- **Không code ở main** — Main chỉ dùng để khai báo biến, gọi hàm

### 3. Biến & Đặt tên
- **Không được sử dụng biến toàn cục**
- Đặt tên biến phải **rõ ràng**, dễ hiểu
- Tên hàm đặt theo kiểu `doSomething` — thể hiện được hàm dùng để làm gì
- Tên Class phải đại diện cho những hàm ở bên trong class

### 4. Comment
- Phải comment cho **Loop**, **Regex**, **Condition**

---

## Cách trình bày khi cô review code

> Khi cô xuống review, trình bày theo ý hiểu, lần lượt từng phần của dự án:

1. **Project có bao nhiêu lớp** — liệt kê tất cả các class
2. **Mỗi lớp trình bày lần lượt:**
   - Khai báo thuộc tính gì, kiểu dữ liệu gì (VD: `private int[] data`)
   - Constructor làm gì
   - Có những phương thức nào, mỗi phương thức dùng để làm gì
3. **Giải thích tính OOP:**
   - Cái nào `public`, cái nào `private` → tính bao đóng
   - Cohesion cao, Coupling thấp

---

## Cấu trúc project
```
src/
├── array/      ← Entity class (xử lý dữ liệu, thuật toán)
├── utils/      ← Utility class (Validator - validate input)
└── main/       ← Main class (điều khiển flow chương trình)
```
