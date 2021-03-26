package com.example.warlusnewsmotion.repository;

import androidx.lifecycle.MutableLiveData;

import com.example.warlusnewsmotion.model.NewsModel;

import java.util.ArrayList;
import java.util.List;

public class NewsRepository {

    private static NewsRepository mNewsRepository;

    private ArrayList<NewsModel> list = new ArrayList<>();

    public static NewsRepository getInstance() {

        if (mNewsRepository == null) {
            mNewsRepository = new NewsRepository();
        }
        return mNewsRepository;
    }


    public MutableLiveData<List<NewsModel>> getNews() {
        setNews();

        MutableLiveData<List<NewsModel>> data = new MutableLiveData<>();
        data.setValue(list);
        return data;
    }

    private void setNews() {

    }
}
