package com.example.doan;

public class classHoatDong {
    String MAHOATDONG;
    String TENHOATDONG;

public classHoatDong(String MAHOATDONG,String TENHOATDONG) {

    this.MAHOATDONG=MAHOATDONG;
    this.TENHOATDONG=TENHOATDONG;


}
public String toString()
{
    String msg="";
    msg+="Mã hoạt động : "+this.MAHOATDONG+"|";
    msg+="Tên hoạt động :"+this.TENHOATDONG;
    return msg;
}
}
