package com.example.doan;

import java.util.Date;

public class classDoanVien {
    String MADOANVIEN;
    String HOTENDOANVIEN;
    Date NGAYSINH;
    String PHAI;
    String DIACHI;

public classDoanVien( String MADOANVIEN, String HOTENDOANVIEN, Date NGAYSINH, String PHAI, String DIACHI )
{
    this.MADOANVIEN=MADOANVIEN;
    this.HOTENDOANVIEN=HOTENDOANVIEN;
    this.NGAYSINH=NGAYSINH;
    this.PHAI=PHAI;
    this.DIACHI=DIACHI;
}

    public String toString() {
        String msg=" ";
        msg+="Mã đoàn viên: "+this.MADOANVIEN+"\n";
        msg+="Họ tên đoàn viên  : "+this.HOTENDOANVIEN+"|";
        msg+="Ngày sinh : "+ this.NGAYSINH;
        msg+="Phái : "+this.PHAI+"\n";
        msg+="Địa chỉ : "+this.DIACHI+"|";
        return msg;
    }
}
