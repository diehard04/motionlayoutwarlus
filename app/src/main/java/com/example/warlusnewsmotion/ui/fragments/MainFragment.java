package com.example.warlusnewsmotion.ui.fragments;

import androidx.lifecycle.ViewModelProviders;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.warlusnewsmotion.R;
import com.example.warlusnewsmotion.ui.intefaces.FragTransactionInterface;
import com.example.warlusnewsmotion.view_model.MainViewModel;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;
    private TextView fMainTvNews;
    private FragTransactionInterface anInterface;

    public MainFragment (Activity activity) {
        this.anInterface = (FragTransactionInterface) activity;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        fMainTvNews = view.findViewById(R.id.f_main_tv_news);
        fMainTvNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getContext(), "Move TO news activity ", Toast.LENGTH_SHORT).show();
                anInterface.moveToOtherFragment();
            }
        });
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
    }

}