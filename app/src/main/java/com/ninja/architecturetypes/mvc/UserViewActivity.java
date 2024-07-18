package com.ninja.architecturetypes.mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ninja.architecturetypes.R;

import java.util.List;

public class UserViewActivity extends AppCompatActivity {

    protected TextView userTextView;
    protected UserController userController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_view);

        userTextView = findViewById(R.id.userTextView);
        userController.displayUsers();
    }

    public void showUsers(List<String> users) {
        StringBuilder userDisplay = new StringBuilder();
        for (String user: users) {
            userDisplay.append("Mvc User: ").append(user).append("\n");
        }
        userTextView.setText(userDisplay.toString());
    }
}