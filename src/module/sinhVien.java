package module;

import java.util.Objects;

public class sinhVien implements Comparable<sinhVien>{
    private String maSinhVien;
    private String hoVaTen;
    private int namSinh;
    private float diemTrungBinh;

    
    
    public sinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public sinhVien(String maSinhVien, String hoVaTen, int namSinh, float diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    // ghi đè phương thức in ra chuỗi
    @Override
    public String toString() {
        return "sinhVien [Mã sinh viên = " + maSinhVien + ", Họ và tên = " + hoVaTen + ", năm sinh = " + namSinh
                + ", điểm trung bình = " + diemTrungBinh + "]";
    }

    @Override
	public int compareTo(sinhVien o) {
		return this.maSinhVien.compareTo(o.maSinhVien);
	}

    @Override
	public int hashCode() {
		return Objects.hash(diemTrungBinh, hoVaTen, maSinhVien, namSinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		sinhVien other = (sinhVien) obj;
		return Objects.equals(maSinhVien, other.maSinhVien);
	}
	
	

}
