package com.saroj.fragmentassignment.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.saroj.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SimpleInterestFragment} interface
 * to handle interaction events.
 * Use the {@link SimpleInterestFragment#} factory method to
 * create an instance of this fragment.
 */
public class SimpleInterestFragment extends Fragment implements View.OnClickListener {
    private Button btncalcsimpleinterest;
    private EditText etprinciple, ettime, etrate;
    TextView res;


    public SimpleInterestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_interest, container, false);
        etprinciple = view.findViewById(R.id.etprinciple);
        ettime = view.findViewById(R.id.ettime);
        etrate = view.findViewById(R.id.etrate);
        btncalcsimpleinterest = view.findViewById(R.id.btncalcsimpleinterest);
        res = view.findViewById(R.id.Res);

        btncalcsimpleinterest.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etprinciple.getText())){
            etprinciple.setError("please enter Principal");
            Toast.makeText(getActivity(), "please enter Principal", Toast.LENGTH_SHORT).show();
            return;
        }else if (TextUtils.isEmpty(ettime.getText())) {
            ettime.setError("Please enter Time in year");
            Toast.makeText(getActivity(), "Please enter Time in year", Toast.LENGTH_SHORT).show();
            return;
        }else if(TextUtils.isEmpty(etrate.getText())){
            etrate.setError("Please enter Rate");
            Toast.makeText(getActivity(), "Please enter Rate", Toast.LENGTH_SHORT).show();
            return;
        }
        float P, T, R, Result;
        P = Float.parseFloat(etprinciple.getText().toString());
        T = Float.parseFloat(ettime.getText().toString());
        R = Float.parseFloat(etrate.getText().toString());
        Result = P * T * R / 100;
        res.setText(Result +"");

    }

}
