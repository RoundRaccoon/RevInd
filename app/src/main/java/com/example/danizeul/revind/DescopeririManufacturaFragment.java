package com.example.danizeul.revind;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DescopeririManufacturaFragment extends Fragment {

    TextView ButonDescopeririManufactura;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_descoperiri_manufactura,container,false);

        ButonDescopeririManufactura = (TextView) view.findViewById(R.id.ButonDescopeririManufactura);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        if(globalProgressClass.getCorect()==2)
        {
            ButonDescopeririManufactura.setVisibility(View.GONE);
        }

        if(globalProgressClass.getDescopeririManufactura()==2)
        {
            ButonDescopeririManufactura.setVisibility(View.GONE);
        }

        ButonDescopeririManufactura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalProgressClass.setDescopeririManufactura(2);
                getFragmentManager().popBackStackImmediate();

            }
        });

        return view;
    }
}
