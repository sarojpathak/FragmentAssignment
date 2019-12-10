package com.saroj.fragmentassignment.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.saroj.fragmentassignment.R;

public class AutomorphicFragment extends Fragment implements View.OnClickListener {
    private Button btncalcautomorphic;
    private EditText etnumber;


    public AutomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);
        etnumber = view.findViewById(R.id.etnumber);
        btncalcautomorphic = view.findViewById(R.id.btncalcautomorphic);

        btncalcautomorphic.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etnumber.getText())) {
            etnumber.setError("Please Enter Number");
            Toast.makeText(getActivity(), "Please Enter Number", Toast.LENGTH_SHORT).show();
            return;
        }
        int num = Integer.parseInt(etnumber.getText().toString());
        int div, c=0, sq, rem;
        c=0;
        for (div=num;div>0;div=div/10){
            c++;
        }
        div=(int)Math.pow(10,c);
        sq = num*num;
        rem = sq%div;

        if (rem==num){
            Toast.makeText(getActivity(),"The number is a Automorphic number", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(getActivity(),"The number is not a Automorphic number", Toast.LENGTH_LONG).show();
        }

    }
}
