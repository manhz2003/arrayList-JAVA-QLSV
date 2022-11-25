package module;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class danhSachSinhVien{
    // tạo arrayList
 private ArrayList<sinhVien> danhSach;

// tạo contructor
 public danhSachSinhVien() {
    this.danhSach = new ArrayList<sinhVien>();
}

public danhSachSinhVien(ArrayList<sinhVien> danhSach) {
    this.danhSach = danhSach;
}

// 1. thêm sinh viên vào danh sách
public void themSinhVien (sinhVien sv){
    this.danhSach.add(sv);
}

// 2. in danh sách sinh viên
public void inDanhSachSinhVien (){
    for (sinhVien sv : danhSach) {
        System.out.println(sv);
    }
}

// 3. kiểm tra danh sách rỗng
public boolean kiemTraDanhSachRong (){
    return this.danhSach.isEmpty();
}

// 4. lấy ra số lượng sinh viên trong danh sách
public int laySoLuongSinhVien (){
    return this.danhSach.size();
}

// 5. Làm rỗng danh sách sinh viên
public void lamRongDanhSach(){
    this.danhSach.removeAll(danhSach);
}

// 6. kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên
public boolean kiemTraTonTai (sinhVien sv){
   return this.danhSach.contains(sv);
}

// 7. Xóa 1 sinh viên ra khỏi danh sách dựa trên mã sinh viên
public boolean xoaSinhVien (sinhVien sv){
    return this.danhSach.remove(sv);
 }

// 8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím
public void timSinhVien (String ten){
    for (sinhVien sinhVien : danhSach) {
        if(sinhVien.getHoVaTen().indexOf(ten)>=0){
            System.out.println(sinhVien);
        }
    }
 }

// 9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
 public void sapXepSvgiamDanTheoDiem(){
    Collections.sort(this.danhSach, new Comparator<sinhVien>() {

        @Override
        public int compare(sinhVien o1, sinhVien o2) {
            if(o1.getDiemTrungBinh()<o2.getDiemTrungBinh()){
                return -1;
            }else if(o1.getDiemTrungBinh()>o2.getDiemTrungBinh()){
                return 1;
            }else {
                return 0;
            }
        }        
    });
 }

}