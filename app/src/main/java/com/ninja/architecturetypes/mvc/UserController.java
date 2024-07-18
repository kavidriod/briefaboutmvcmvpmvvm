package com.ninja.architecturetypes.mvc;

import java.util.List;

public class UserController {

    private UserModel userModel;
    private UserViewActivity userViewActivity;

    public UserController(UserModel userModel, UserViewActivity userViewActivity){
        this.userModel = userModel;
        this.userViewActivity = userViewActivity;
    }

    public void displayUsers() {
        List<String> users = userModel.getUsers();
        userViewActivity.showUsers(users);
    }
}
