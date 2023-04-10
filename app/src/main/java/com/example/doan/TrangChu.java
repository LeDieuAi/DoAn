package com.example.doan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class TrangChu extends AppCompatActivity {

    private Menu menu;
    private MenuItem item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);

    }
    public boolean onCreateOptionsMenu(Menu menu)
    {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item)
    {

        int id=item.getItemId();
        switch (id) {
            case R.id.DoanCS:
               Intent intent=new Intent(TrangChu.this,DoanCS.class);
               startActivity(intent);
                break;
            case R.id.ChiDoan:
                Intent Chidoan=new Intent(TrangChu.this,ChiDoan.class);
                startActivity(Chidoan);
                break;
            case R.id.Doanvien:
                Intent Doanvien=new Intent(TrangChu.this,DoanVien.class);
                startActivity(Doanvien);
                break;
            case R.id.Sukien:
                Intent Sukien=new Intent(TrangChu.this,Sukien.class);
                startActivity(Sukien);
                break;
            case R.id.Hoatdong:
                Intent Hd=new Intent(TrangChu.this,HoatDong.class);
                startActivity(Hd);
                break;
            case R.id.Thamgiahd:
                Intent thamgiahd=new Intent(TrangChu.this,Thamgia_HoatDong.class);
                startActivity(thamgiahd);
                break;
            case R.id.tochuchd:
                Intent tochuchd=new Intent(TrangChu.this,ToChuc_HoatDong.class);
                startActivity(tochuchd);
                break;
            case R.id.Xeploai:
                Intent xeploai=new Intent(TrangChu.this,XepLoai.class);
                startActivity(xeploai);
                break;
            case R.id.ketqua:
                Intent ketqua=new Intent(TrangChu.this,KetQua.class);
                startActivity(ketqua);
                break;
            default:
        }
        return super.onOptionsItemSelected(item);
    }
}
