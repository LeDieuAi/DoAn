package com.example.doan;

public class classDoanCS {
    String MADCS;
    String TENDCS;
    String NGAYTL;

    public classDoanCS(String MADCS, String TENDCS, String NGAYTL) {
        this.MADCS = MADCS;
        this.TENDCS = TENDCS;
        this.NGAYTL = NGAYTL;
    }
    public String toString()
    {
        String msg=" ";
        msg+="Mã DCS : "+this.MADCS+"\n";
        msg+="Tên DCS : "+this.TENDCS+"|";
        msg+="Ngày TL : "+ this.NGAYTL;
        return msg;
    }
}
