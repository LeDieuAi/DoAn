package com.example.doan;

public class classChiDoan {
    String maCD;
    String tenCD;
    int SLDV;
    String HotenBT;
    String MaDCS;


    public classChiDoan(String maCD,String tenCD, int SLDV, String HotenBT, String MaDCS)
    {
        this.maCD=maCD;
        this.tenCD=tenCD;
        this.SLDV=SLDV;
        this.HotenBT=HotenBT;
        this.MaDCS=MaDCS;

    }
    public  String toString()
    {
        String msg="";
        msg+="Mã chi đoàn: "+this.maCD+"|";
        msg+="Tên chi đoàn: "+this.tenCD+"|";
        msg+="Số lương đoàn viên: "+this.SLDV+"|";
        msg+="Tên Bí thư: "+this.HotenBT+"|";
        msg+="Mã đoàn cơ sở: "+this.MaDCS+"\n";
        return msg;
    }
}
