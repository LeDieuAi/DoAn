package com.example.doan;

public class classSuKien {

    String MASUKIEN;
    String TENSUKIEN;
    String DIADIEM;
    String NDSUKIEN;
    String HINHTHUC;
    String MUCTIEU;


    public classSuKien( String MASUKIEN, String TENSUKIEN, String DIADIEM, String NDSUKIEN, String HINHTHUC, String MUCTIEU)
    {
        this.MASUKIEN=MASUKIEN;
        this.TENSUKIEN=TENSUKIEN;
        this.DIADIEM=DIADIEM;
        this.NDSUKIEN=NDSUKIEN;
        this.HINHTHUC=HINHTHUC;
        this.MUCTIEU=MUCTIEU;

    }
    public String toString()
    {
        String msg=" ";
        msg+="Mã sự kiện : "+this.MASUKIEN+"|";
        msg+="Tên sự kiện : "+this.TENSUKIEN+"|";
        msg+="Địa điểm : "+this.DIADIEM+"|";
        msg+="Nội dung : "+this.NDSUKIEN+"|";
        msg+="Hình thức :"+this.HINHTHUC+"|";
        msg+="Mục tiêu : "+this.MUCTIEU;

        return msg;
    }


}
