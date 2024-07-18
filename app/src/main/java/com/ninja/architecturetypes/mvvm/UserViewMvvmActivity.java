package com.ninja.architecturetypes.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

import com.ninja.architecturetypes.R;

public class UserViewMvvmActivity extends AppCompatActivity {

    private TextView usermvvmTextView;
    private UserViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_view_mvvm);

        usermvvmTextView = findViewById(R.id.usermvvmTextView);
        viewModel = new ViewModelProvider(this).get(UserViewModel.class);

        viewModel.getUsers().observe(this, users -> {
            StringBuilder userDisplay = new StringBuilder();
            for (String user: users) {
                userDisplay.append("Mvvm User: ").append(user).append("\n");
            }
            usermvvmTextView.setText(userDisplay.toString());
        });

    }
}