package com.ninja.architecturetypes.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ninja.architecturetypes.R;

import java.util.List;

public class UserViewMvpActivity extends AppCompatActivity implements  UserView {

    private TextView userTextView;
    private UserPresenter userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_view_mvp);

        userPresenter = new UserPresenter(new UserModels(),this);
        userPresenter.loadUsers();
    }

    @Override
    public void showUser(List<String> users) {
        StringBuilder userDisplay = new StringBuilder();
        for (String user : users) {
            userDisplay.append("Mvp User: ").append(user).append("\n");
        }
        userTextView.setText(userDisplay.toString());
    }
}