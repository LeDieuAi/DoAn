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
        ArrayList listshow;
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
   
        
        
        
        
        
        
        }
        
        
        
        
        
        
        
        
    //gan menu
    public boolean onCreateOptionsMenu(Menu menu)
    {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
}
}
