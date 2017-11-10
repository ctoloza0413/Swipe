package com.example.nextu.fragmentosdinamicosswipe;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by LABORATORIOS on 10/11/2017.
 */

public class DiasNoticias extends FragmentPagerAdapter {

    static final int CAT_PAG=3;

    public DiasNoticias(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if(position ==0){
            return new ProgramacionHoy();
        }
        if(position == 1){
            return new ProgramacionAyer();
        }
        else{
            return new ProgramacionManana();
        }

    }

    @Override
    public int getCount() {
        return CAT_PAG;
    }
}
