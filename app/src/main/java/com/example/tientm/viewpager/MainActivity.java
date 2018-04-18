package com.example.tientm.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager vpSmile;
    private ArrayList<Face> listFace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        listFace = new ArrayList<>();
        listFace.add(new Face("#03A9F4",R.drawable.ic_1,"Icon 1"));
        listFace.add(new Face("#212121",R.drawable.ic_2,"Icon 2"));
        listFace.add(new Face("#1DE9B6",R.drawable.ic_3,"Icon 3"));
        listFace.add(new Face("#1A237E",R.drawable.ic_4,"Icon 4"));
    }

    private void initView() {
        vpSmile = (ViewPager) findViewById(R.id.vp_smile);

        MyAdapter myAdapter =new MyAdapter(this,listFace);
        vpSmile.setAdapter(myAdapter);
    }
}
