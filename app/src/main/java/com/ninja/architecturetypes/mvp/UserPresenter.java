package com.ninja.architecturetypes.mvp;

import com.ninja.architecturetypes.mvc.UserModel;

import java.util.List;

public class UserPresenter {

    private UserModels model;
    private UserView userView;

    public UserPresenter(UserModels userModels, UserView userView) {
        this.model = model;
        this.userView = userView;
    }


    public void loadUsers() {
        List<String> users = model.getUsers();
        userView.showUser(users);

    }

}
