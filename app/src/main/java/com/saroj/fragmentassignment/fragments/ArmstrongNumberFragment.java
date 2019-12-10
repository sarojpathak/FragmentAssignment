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

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ArmstrongNumberFragment interface
 * to handle interaction events.
 * Use the {@link ArmstrongNumberFragment#} factory method to
 * create an instance of this fragment.
 */
public class ArmstrongNumberFragment extends Fragment implements View.OnClickListener {
    private Button btncalcarmstrong;
    private EditText etnumber;


    public ArmstrongNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_armstrong_number, container, false);

        etnumber = view.findViewById(R.id.etnumber);
        btncalcarmstrong = view.findViewById(R.id.btncalcarmstrong);

        btncalcarmstrong.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int num = Integer.parseInt(etnumber.getText().toString());
        int temp=num;
        String t=temp+"";
        int length = t.length();
        int sum = 0;
        while (temp!=0){
            int digit=temp%10;
            sum = sum+(int)Math.pow(digit, length);
            temp=temp/10;
        }
        if (sum==num){
            Toast.makeText(getActivity(),"The number is a Armstrong number", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getActivity(),"The number is not a Armstrong number", Toast.LENGTH_SHORT).show();
        }


    }
}
