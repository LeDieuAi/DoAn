package com.example.doan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DoanVien extends AppCompatActivity {
SQLiteDatabase database = null;
        String SKPT ="SKPT.db";
    EditText editMaDV,editTenDv,editNgaySinh,editphai,editdchi;
         ListView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doan_vien);
            EditText MADV=(EditText) findViewById(R.id.editMaDV);
            EditText HOTENDV=(EditText) findViewById(R.id.editTenDV);
            EditText PHAi=(EditText) findViewById(R.id.editphai);
            EditText NGAYSNH=(EditText) findViewById(R.id.editNgaySinh);
            EditText DIACHI=(EditText) findViewById(R.id.editdchi);
            
         Button THEM =(Button) findViewById(R.id.btnThem);
        Button XOA=(Button) findViewById(R.id.btnXoa);
        Button SUA=(Button) findViewById(R.id.btnSua);
        Button HIENTHI=(Button) findViewById(R.id.btnHienthi);
        ListView show=(ListView) findViewById(R.id.lvdv);
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
        String madv=editMaDV.getText().toString();
        String tendv=editTenDV.getText().toString();
        String phai=editphai.getText().toString();
        String ngaysinh=editNgaySinh.getText().toString();
        String diachi=editdchi.getText().toString();
        String sql="INSERT INTO DOANVIEN VALUES('"+madv+"','"+tendv+"','"+phai+"','"+ngaysinh+"'.'"+diachi+"')";
            if(doAction(sql)==true)
            {
                Toast.makeText(ChiDoanActivity.this,"Them thanh cong",Toast.LENGTH_SHORT).showw();
                editMaDV.setText("");
                editTenDV.setText("");
                editphai.setText("");
                editNgaySinh.setText("");
                editdchi.setText("");
                editMaDV.findFocus();
            }
            else
                Toast.makeText(ChiDoanActivity.this,"Them khong thanh cong",Toast.LENGTH_SHORT).show();
        }
        
        
        
        
    
}
