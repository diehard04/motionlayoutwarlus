package com.example.warlusnewsmotion.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.example.warlusnewsmotion.R;
import com.example.warlusnewsmotion.view_model.NewsViewModel;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by DieHard_04 on 26-03-2021.
 */
public class NewsFragment extends Fragment {

    @BindView(R.id.f_news_tv_buzz)
    TextView fNewsTvBuzz;

    private NewsViewModel mNewsViewModel;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.news_fragment, container, false);
        ButterKnife.bind(this, view);
        mNewsViewModel = ViewModelProviders.of(this).get(NewsViewModel.class);
        return view;
    }
}
