package com.example.warlusnewsmotion.view_model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.warlusnewsmotion.model.NewsModel;
import com.example.warlusnewsmotion.repository.NewsRepository;

import java.util.List;

/**
 * Created by DieHard_04 on 26-03-2021.
 */
public class NewsViewModel extends ViewModel {

    private MutableLiveData<List<NewsModel>> mNewsList;
    private NewsRepository mRepo;
    private MutableLiveData<Boolean> mIsUpdating = new MutableLiveData<>();



    public void init() {
        if (mNewsList != null){
            return;
        }
        mRepo = NewsRepository.getInstance();
        mNewsList = mRepo.getNews();


    }


    public LiveData<List<NewsModel>>   getNewsList() {
        return mNewsList;
    }

    public LiveData<Boolean> isUpdating () {
        return mIsUpdating;
    }
}
