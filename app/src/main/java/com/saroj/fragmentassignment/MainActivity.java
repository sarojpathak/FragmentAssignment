package com.saroj.fragmentassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.saroj.fragmentassignment.fragments.AreaofCircleFragment;
import com.saroj.fragmentassignment.fragments.ArmstrongNumberFragment;
import com.saroj.fragmentassignment.fragments.AutomorphicFragment;
import com.saroj.fragmentassignment.fragments.PalindromeNumberFragment;
import com.saroj.fragmentassignment.fragments.SimpleInterestFragment;
import com.saroj.fragmentassignment.fragments.SwapNumberFragment;

public class MainActivity extends AppCompatActivity {

    private Button btnareaofcircle, btnarmstrong, btnautomorphic, btnpalindrome, btnsimpleinterest, btnswap;
    private Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnareaofcircle = findViewById(R.id.btnareaofcircle);
        btnarmstrong = findViewById(R.id.btnarmstrong);
        btnautomorphic = findViewById(R.id.btnautomorphic);
        btnpalindrome = findViewById(R.id.btnpalindrome);
        btnsimpleinterest = findViewById(R.id.btnsimpleinterest);
        btnswap = findViewById(R.id.btnswap);

        btnareaofcircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();

                AreaofCircleFragment areaofCircleFragment = new AreaofCircleFragment();
                fragmentTransaction.replace(R.id.fragView, areaofCircleFragment);
                fragmentTransaction.commit();

            }
        });
        btnarmstrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();

                ArmstrongNumberFragment armstrongNumberFragment= new ArmstrongNumberFragment();
                fragmentTransaction.replace(R.id.fragView, armstrongNumberFragment);
                fragmentTransaction.commit();
            }
        });

        btnautomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();

                AutomorphicFragment automorphicFragment= new AutomorphicFragment();
                fragmentTransaction.replace(R.id.fragView, automorphicFragment);
                fragmentTransaction.commit();
            }
        });

        btnpalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();

                PalindromeNumberFragment palindromeNumberFragment = new PalindromeNumberFragment();
                fragmentTransaction.replace(R.id.fragView,palindromeNumberFragment);
                fragmentTransaction.commit();

            }
        });
        btnsimpleinterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();

                SimpleInterestFragment simpleInterestFragment = new SimpleInterestFragment();
                fragmentTransaction.replace(R.id.fragView,simpleInterestFragment);
                fragmentTransaction.commit();
            }
        });

        btnswap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();

                SwapNumberFragment swapNumberFragment = new SwapNumberFragment();
                fragmentTransaction.replace(R.id.fragView,swapNumberFragment);
                fragmentTransaction.commit();


            }
        });

    }
}
