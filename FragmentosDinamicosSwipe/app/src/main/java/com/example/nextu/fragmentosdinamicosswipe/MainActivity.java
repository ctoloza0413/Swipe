package com.example.nextu.fragmentosdinamicosswipe;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    DiasNoticias diasNoticias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=(ViewPager)findViewById(R.id.paginas);
        diasNoticias=new DiasNoticias(getSupportFragmentManager());
        viewPager.setAdapter(diasNoticias);
    }
}
