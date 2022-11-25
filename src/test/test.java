package test;

import java.util.Scanner;
import module.danhSachSinhVien;
import module.sinhVien;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        danhSachSinhVien dssv = new danhSachSinhVien();
        int chon = 0;
        do {
            System.out.println("---------MENU----------");
            System.out.println("Vui lòng chọn chức năng");
            System.out.println(
                "1. thêm sinh viên vào danh sách.\n"
                + "2. In danh sách sinh viên ra màn hình.\n"
                + "3. Kiểm tra danh sách có rỗng hay không.\n"
                + "4. Lấy ra số lượng sinh viên trong danh sách.\n"
                + "5. Làm rỗng danh sách sinh viên.\n"
                + "6. kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
                + "7. Xóa 1 sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
                + "8. Tìm kiếm tất cả sinh viên dựa trên tên được nhập từ bàn phím\n"
                + "9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
                + "0. Thoát !");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    System.out.println("1. thêm sinh viên vào danh sách.");
                    System.out.println("Nhập mã sinh viên: ");
                    String maSinhVien = sc.nextLine();
                    System.out.println("Nhập họ và tên: ");
                    String hoVaTen = sc.nextLine();
                    System.out.println("Nhập năm sinh: ");
                    int namSinh = sc.nextInt();
                    System.out.println("Nhập điểm trung bình: ");
                    float diemTrungBinh = sc.nextFloat();
                    sinhVien sv = new sinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                    dssv.themSinhVien(sv);
                    break;
                case 2:
                    System.out.println("2. In danh sách sinh viên ra màn hình.");
                    dssv.inDanhSachSinhVien();
                    break;
                case 3:
                    System.out.println("3. kiểm tra danh sách rỗng");
                    System.out.println("Danh sách rỗng: " + dssv.kiemTraDanhSachRong());
                    break;
                case 4:
                    System.out.println("4. lấy ra số lượng sinh viên trong danh sách");
                    System.out.println("Số lượng danh sách sinh viên: " + dssv.laySoLuongSinhVien());
                    break;
                case 5:
                    System.out.println("5. Làm rỗng danh sách sinh viên");
                    dssv.lamRongDanhSach();
                    System.out.println("danh sách sinh viên của bạn đã được làm rỗng !");
                    break;
                case 6:
                    System.out.println("6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên");
                    System.out.println("Nhập mã sinh viên: ");
                    maSinhVien = sc.nextLine();
                    sv = new sinhVien(maSinhVien);
                    System.out.println("Kiểm tra sinh viên tồn tại trong danh sách: " + dssv.kiemTraTonTai(sv));
                    break;
                case 7:
                    System.out.println("Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.");
                    System.out.println("Nhập mã sinh viên: ");
                    maSinhVien = sc.nextLine();
                    sv = new sinhVien(maSinhVien);
                    System.out.println("Xóa sinh viên trong danh sách: " + dssv.xoaSinhVien(sv));
                    break;
                case 8:
                    System.out.println("8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.");
                    System.out.println("Nhập họ và tên: "); 
                    hoVaTen = sc.nextLine();
				    System.out.println("Kết quả tìm kiếm: ");
				    dssv.timSinhVien(hoVaTen);
                    break;
                case 9:
                System.out.println("9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp.");
                    dssv.sapXepSvgiamDanTheoDiem();
				    dssv.inDanhSachSinhVien();
                    break;
                default:
                    break;
            }
        } while (chon != 0);
    }
}
