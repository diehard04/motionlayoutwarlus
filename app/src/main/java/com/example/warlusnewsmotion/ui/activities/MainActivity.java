package com.example.warlusnewsmotion.ui.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.warlusnewsmotion.R;
import com.example.warlusnewsmotion.ui.intefaces.FragTransactionInterface;
import com.example.warlusnewsmotion.ui.fragments.MainFragment;
import com.example.warlusnewsmotion.ui.fragments.NewsFragment;

public class MainActivity extends AppCompatActivity implements FragTransactionInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            setFragmentLayout(new MainFragment(this));
        }
    }

    @Override
    public void moveToOtherFragment() {
        setFragmentLayout(new NewsFragment());
    }

    private void setFragmentLayout(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.container, fragment);
        //ft.addToBackStack(null);
        ft.commit();
    }
}