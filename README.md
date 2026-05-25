# LAB211 - Cô HueCMT

## Những lưu ý khi học LAB211 cô HueCMT

> Ưu tiên code theo **OOP**. Cô review dễ, miễn logic đúng là được.
> Quan trọng nhất là **hiểu code** và **trình bày được** cho cô khi review.

---

## Quy tắc code chung

### 1. OOP & Tính chất
- Đảm bảo **tính bao đóng** (Encapsulation) — thuộc tính `private`, phương thức `public`
- Đảm bảo **Cohesion cao** — mỗi class chỉ làm 1 việc
- Đảm bảo **Coupling thấp** — các class ít phụ thuộc nhau

### 2. Khung chương trình (Main)
- **Không code logic ở main** — Main chỉ khai báo biến, gọi hàm
- `main` throws Exception

### 3. Null check & Exception
- Các method xử lý dữ liệu nên check null trước khi thao tác.
- Dùng `throws Exception` khi cần validate đầu vào.
- **Đặc biệt:** Phương thức hiển thị dữ liệu (`printArray()`) cũng nên `throw new Exception` thay vì chỉ in "null" hoặc return (Ví dụ: `throw new Exception("Can't be null")`).

---

## Cách trình bày khi cô review code

> Khi cô xuống review, trình bày **theo ý hiểu**, lần lượt từng phần:

1. **Project có bao nhiêu lớp** — liệt kê tất cả class
2. **Mỗi lớp trình bày lần lượt:**
   - Thuộc tính gì, kiểu dữ liệu gì (VD: `private int[] a`)
   - Constructor làm gì
   - Có những phương thức nào, mỗi phương thức dùng để làm gì
3. **Giải thích tính OOP:**
   - Cái nào `public`, cái nào `private` → tính bao đóng
   - Cohesion cao, Coupling thấp

---

## Cấu trúc project (BubbleSort)
```
src/
├── array/
│   └── MyArray.java    ← Entity class (thuộc tính, setSize, genRandom, sortArray, printArray)
├── utils/
│   └── Validator.java  ← Utility class (getInput - validate input từ user)
└── main/
    └── Main.java       ← Điều khiển flow (khai báo biến, gọi hàm)
```
