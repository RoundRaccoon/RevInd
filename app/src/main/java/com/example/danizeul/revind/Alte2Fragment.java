package com.example.danizeul.revind;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.example.danizeul.revind.R.id.ButonAlte1;


public class Alte2Fragment extends Fragment {

    TextView ButonAlte2;

    GlobalProgressClass globalProgressClass;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alte2,container,false);

        ButonAlte2 = (TextView) view.findViewById(R.id.ButonAlte2);

        globalProgressClass = (GlobalProgressClass) getContext().getApplicationContext();

        if(globalProgressClass.getCorect()==2)
        {
            ButonAlte2.setVisibility(View.GONE);
        }

        if(globalProgressClass.getAltePart2()==2)
        {
            ButonAlte2.setVisibility(View.GONE);
        }

        ButonAlte2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                globalProgressClass.setAltePart2(2);
                getFragmentManager().popBackStackImmediate();

            }
        });

        return view;
    }
}
