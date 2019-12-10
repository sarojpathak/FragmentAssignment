package com.saroj.fragmentassignment.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.saroj.fragmentassignment.R;

public class SwapNumberFragment extends Fragment implements View.OnClickListener{
    private Button btncalcswap;
    private EditText etnumber1, etnumber2;


    public SwapNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swap_number, container, false);
        etnumber1 = view.findViewById(R.id.etnumber1);
        etnumber2 = view.findViewById(R.id.etnumber2);
        btncalcswap = view.findViewById(R.id.btncalcswap);
        btncalcswap.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int num1 = Integer.parseInt(etnumber1.getText().toString());
        int num2 = Integer.parseInt(etnumber2.getText().toString());
        int a=10, b=20;
        num1=num1+num2;//a=30 (10+20)
        num2=num1-num2;//b=10 (30-20)
        num1=num1-num2;//a=20 (30-10)

        if (num1==num2){
            Toast.makeText(getActivity(),"The number is a Swap number", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getActivity(),"The number is not a Swap number", Toast.LENGTH_SHORT).show();
        }

    }
}