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

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PalindromeNumberFragment} interface
 * to handle interaction events.
 * Use the {@link PalindromeNumberFragment#} factory method to
 * create an instance of this fragment.
 */
public class PalindromeNumberFragment extends Fragment implements View.OnClickListener {
    private Button btncalcpalindrome;
    private EditText etnumber;


    public PalindromeNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome_number, container, false);
        etnumber = view.findViewById(R.id.etnumber);
        btncalcpalindrome = view.findViewById(R.id.btncalcpalindrome);

        btncalcpalindrome.setOnClickListener(this);

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

        int i;
        int r = 0;

        int initialNum = num;

        for (i = 0; i <= num; i++) {
            r = r * 10;
            r = r + num % 10;
            num = num / 10;
            i = 0;
        }

        if (r == initialNum) {
            Toast.makeText(getActivity(),"The number is a Palindrome number", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(),"The number is not a Palindrome number", Toast.LENGTH_SHORT).show();
        }

    }
}
