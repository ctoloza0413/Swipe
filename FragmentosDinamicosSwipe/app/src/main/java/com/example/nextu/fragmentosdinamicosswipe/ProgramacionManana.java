package com.example.nextu.fragmentosdinamicosswipe;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by LABORATORIOS on 10/11/2017.
 */

public class ProgramacionManana extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.programacion_manana,container,false);
        String [] programacion_manana= new String[]{"Noticias Sport","Arsenal vs Chelsea"};

        ArrayAdapter arrayAdapter= new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,programacion_manana);

        ListView listView=(ListView)view.findViewById(R.id.list_progrmacion_manana);
        listView.setAdapter(arrayAdapter);
        return view;
    }
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser)
        {
            getActivity().setTitle("Programacion Mañana");

        }
    }
}
