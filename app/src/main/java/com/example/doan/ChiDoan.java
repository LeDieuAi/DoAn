package com.example.doan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class ChiDoan extends AppCompatActivity {
SQLiteDatabase database = null;
        String SKPT ="SKPT.db";
        EditText editMa_cd,edit_tencd,edit_SLDV,edit_tenBT,edit_madcs;
    //sửa    ArrayList listChiDoan,listDCS;
        ListView listShow;
        //sửa Spinner MADCS;
        
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_doan);

        EditText MACD=(EditText) findViewById(R.id.editMa_cd);
        EditText TENCD=(EditText) findViewById(R.id.edit_tencd);
        EditText SLDV=(EditText) findViewById(R.id.edit_SLDV);
        EditText TENBT=(EditText) findViewById(R.id.edit_tenBT);
        EditText MADCS=(EditText) findViewById(R.id.edit_madcs);
        Button THEM =(Button) findViewById(R.id.btnThem);
        Button XOA=(Button) findViewById(R.id.btnXoa);
        Button SUA=(Button) findViewById(R.id.btnSua);
        Button HIENTHI=(Button) findViewById(R.id.btnHienthi);
        Spinner MADCS=(Spinner) findViewById(R.id.spimadcs);
         
         listshow.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                    ClassChiDoan chidoan=(ClassChiDoan) listChiDoan.get(i);
                    editMaCD.setText(chidoan.maChiDoan);
                    editTenCD.setText(chidoan.tenChiDoan);
                    editSLDV.setText(chidoan.SDLV);
                    editTenBT.setText(chidoan.tenBT);
                    editMaDCS.setText(chidoan.MaDCS);
                    return false;
            }
});
            MADCS.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    ClassDCS dcs=(ClassDCS) ClassDCS.get(i);
                    maDCS=chude.maDCS;
               
}
                      public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(ChiDoanActivity.this, Toast.LENGTH_SHORT).show();
            }
        });
        THEM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Them();
            }
        });
        XOA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Xoa();

            }
        });
        SUA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Sua();
            }
        });
        HIENTHI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Hienthi();
            }
        });
    }
        
        public void Them()
        {
            String macd=editMa_cd.getText().toString();
            String tencd=edit_tencd.getText().toString();
            String sldv=edit_SLDV.getText().toString();
            String tenbt=edit_tenBT.getText().toString();
            String madcs=edit_madcs.getText().toString();
            
            String sql="INSERT INTO CHIDOAN VALUES('"+macd+"','"+tencd+"','"+sldv+"','"+tenbt+"'.'"+madcs+"')";
            if(doAction(sql)==true)
            {
                Toast.makeText(ChiDoanActivity.this,"Them thanh cong",Toast.LENGTH_SHORT).showw();
                editMa_cd.setText("");
                edit_tencd.setText("");
                edit_sldv.setText("");
                ediT_tenBT.setText("");
                edit_mdcs.setText("");
                editMa_cd.findFocus();
                    hienthiChiDoan();
                    doClear();
            }
            else
                Toast.makeText(ChiDoanActivity.this,"Them khong thanh cong",Toast.LENGTH_SHORT).show();
        }
    public void Xoa()
    {
         String macd=editMa_cd.getText().toString();
            String tencd=edit_tencd.getText().toString();
            String sldv=edit_SLDV.getText().toString();
            String tenbt=edit_tenBT.getText().toString();
            String madcs=edit_madcs.getText().toString();

        String sql ="DELETE FROM CHIDOAN WHERE MACD='"+macd+"','"+tencd+"','"+sldv+"','"+tenbt+"'.'"+madcs+"')";
        if(doAction(sql)==true)
        {
             Toast.makeText(ChiDoanActivity.this,"Xoa thanh cong",Toast.LENGTH_SHORT).showw();
             editMa_cd.setText("");
                edit_tencd.setText("");
                edit_sldv.setText("");
                ediT_tenBT.setText("");
                edit_mdcs.setText("");
                editMa_cd.findFocus();
                hienthiChiDoan();
                doClear();
        }
        else
             Toast.makeText(ChiDoanActivity.this,"Xoa [KHONG] thanh cong",Toast.LENGTH_SHORT).showw();
    }
    public void Sua()
    {
         String macd=editMa_cd.getText().toString();
            String tencd=edit_tencd.getText().toString();
            String sldv=edit_SLDV.getText().toString();
            String tenbt=edit_tenBT.getText().toString();
            String madcs=edit_madcs.getText().toString();
   
        String sql="UPDATE CHIDOAN SET TENCD='"+tencd+"',SLDV='"+sldv+"',HOTENBT='"+tenbt+"',MADCS='"+madcs+"'WHERE MACD='"+macd+"'";
             if(doAction(sql)==true)
        {
             Toast.makeText(ChiDoanActivity.this,"Sua thanh cong",Toast.LENGTH_SHORT).showw();
           hienthiChiDoan();
                     doClear();
        }
        else
             Toast.makeText(ChiDoanActivity.this,"Sua [KHONG] thanh cong",Toast.LENGTH_SHORT).showw();        
        }
        
 public void hienthiChidoan(){
                ClassChiDoan=new ArrayList();
            //sửa lại thành    String sql ="SELECT * FROM CHIDOAN";
                database=openOrCreateDatabase("SKPT.db",MODE_PRIVATE,null);
                Cursor cursor=database.rawQuery(sql,null);
    if(cursor.moveToFirst()){
        do{
listShow.add(new ClassChiDoan (cursor.getString(0),cursor.getString(1),cursor.getString(2)));
        }
            while (cursor.moveToNext());
    }
    database.close();
    //Gan du lieu cho ListView
    ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, listShow);
    lvsinhvien.setAdapter(adapter);
}
public boolean doAction(String sql){
    try {
            //Mo CSDL
            database=openOrCreateDatabase("SKPT.db",MODE_PRIVATE,null);
            //Thuc thi
            database.execSQL(sql);
            //Thuc thi thanh cong tra ve true
            return true;
    }
    catch (Exception exception){
        //Thuc thi khong thanh cong tra ve false
        return false;
    }
    finally {
        //Dong database
        database.close();
    }
}     
    //gan menu
    public boolean onCreateOptionsMenu(Menu menu)
    {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
      public void doClear()
      {
              editMaCD.setText("");
              editTenCD.setText("");
              editSLDV.setText("");
              editTenBT.setText("");
              editMaDCS.setText("");
      }
              
        
            public void hienthiSpinnerMaCDS()
            {
                    listDCS=new Arraylist();
                    String sql="SELECT* FROM DOANCOSO ORDER BY TENDCS";
                         database=openOrCreateDatabase(SKPT,MODE_PRIVATE,null);
        Cursor cursor=database.rawQuery(sql,null);
        if(cursor.moveToFirst()){
            do{
                listChiDoan.add(new ClassChiDoan(cursor.getString(0),cursor.getString(1)));
            }while (cursor.moveToNext());
        }
             database.close();
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_spinner_item,listDCS);
        adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        MADCS.setAdapter(adapter);
    }
                     
