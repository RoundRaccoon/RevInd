package com.example.danizeul.revind;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DescopeririGazFragment extends Fragment {

    TextView ButonDescopeririGaz;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_descoperiri_gaz,container,false);

        ButonDescopeririGaz = (TextView) view.findViewById(R.id.ButonDescopeririGaz);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        if(globalProgressClass.getCorect()==2)
        {
            ButonDescopeririGaz.setVisibility(View.GONE);
        }

        if(globalProgressClass.getDescopeririGaz()==2)
        {
            ButonDescopeririGaz.setVisibility(View.GONE);
        }

        ButonDescopeririGaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalProgressClass.setDescopeririGaz(2);
                getFragmentManager().popBackStackImmediate();

            }
        });

        return view;
    }

}
