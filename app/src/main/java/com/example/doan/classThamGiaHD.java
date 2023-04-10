package com.example.doan;

public class classThamGiaHD {
    String MACHIDOAN;
    String MASUKIEN;
    String MAHOATDONG;
    int SOLUONGDOANVIEN;

    public classThamGiaHD(  String MACHIDOAN, String MASUKIEN, String MAHOATDONG, int SOLUONGDOANVIEN)
    {
        this.MACHIDOAN=MACHIDOAN;
        this.MASUKIEN=MASUKIEN;
        this.MAHOATDONG=MAHOATDONG;
        this.SOLUONGDOANVIEN=SOLUONGDOANVIEN;

    }
    public String toString()
    {
        String msg="";
        msg+="Mã chi đoàn :"+this.MACHIDOAN+"|";
        msg+="Mã sự kiện : "+this.MASUKIEN+"|";
        msg+="Mã hoạt động :"+this.MAHOATDONG+"|";
        msg+="Số lượng đoàn viên :"+this.SOLUONGDOANVIEN;
        return msg;
    }
}
