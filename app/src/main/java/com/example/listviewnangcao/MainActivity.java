package com.example.listviewnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<TraiCay> traiCayList ;
    ListView listviewTraiCay ;
    // test git
    // aaaaaavvvv
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapping();

        traiCayList = new ArrayList<>() ;
        traiCayList.add ( new TraiCay("Dau Tay " ,"mau do - nho nhan - xinh xan", R.drawable.strawberry)) ;
        traiCayList.add ( new TraiCay("Chuoi " ,"mau vang - to va dai", R.drawable.banana)) ;
        traiCayList.add ( new TraiCay("Dua " ,"mau xanh la cay - to va tron ", R.drawable.coconut)) ;
        traiCayList.add ( new TraiCay("Cam " ,"mau cam - vua van - tron ", R.drawable.orange)) ;
        traiCayList.add ( new TraiCay("Sau Rieng " ,"mau xanh vang - to va gai goc - thom", R.drawable.durian)) ;

        TraiCayAdapter traiCayAdapter = new TraiCayAdapter(MainActivity.this , R.layout.dong_trai_cay , traiCayList);
        listviewTraiCay.setAdapter(traiCayAdapter);
    }

    private void mapping() {
        listviewTraiCay = (ListView) findViewById(R.id.listviewTraiCay);
    }
}
