package com.ninja.architecturetypes.mvvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.ninja.architecturetypes.mvc.UserModel;
import com.ninja.architecturetypes.mvp.UserModels;

import java.util.List;

public class UserViewModel extends ViewModel {
    private MutableLiveData<List<String>> users;
    private UserModelss model;

    public UserViewModel() {
        model = new UserModelss();
        users = new MutableLiveData<>();
        loadUsers();
    }

    public LiveData<List<String>> getUsers(){
        return users;
    }

    private void loadUsers(){
        users.setValue(model.getUsers());
    }
}