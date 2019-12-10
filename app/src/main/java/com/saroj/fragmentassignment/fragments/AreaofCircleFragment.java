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
 * {@link AreaofCircleFragment} interface
 * to handle interaction events.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class AreaofCircleFragment extends Fragment implements View.OnClickListener {
    private Button btnareaofcircle;
    private EditText etRadius;


    public AreaofCircleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_areaof_circle, container, false);

        etRadius = view.findViewById(R.id.etRadius);
        btnareaofcircle = view.findViewById(R.id.btnareaofcircle);

        btnareaofcircle.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {
        float radius = Float.parseFloat(etRadius.getText().toString());
        float area = 3.143f * radius * radius;

        Toast.makeText(getActivity(),"Area of Circle is : " + area, Toast.LENGTH_SHORT).show();

    }
}
