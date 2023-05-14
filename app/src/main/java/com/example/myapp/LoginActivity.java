package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText mUsernameEditText;
    private EditText mPasswordEditText;
    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUsernameEditText = findViewById(R.id.usernameEditText);
        mPasswordEditText = findViewById(R.id.passwordEditText);
        mLoginButton = findViewById(R.id.loginButton);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the username and password from the EditText fields
                String username = mUsernameEditText.getText().toString();
                String password = mPasswordEditText.getText().toString();

                // Make the authentication request to the server
                // If the authentication is successful, start the main activity
                if (authenticate(username, password)) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Authentication failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean authenticate(String username, String password) {
        // TODO: Make the authentication request to the server
        // Check if the username and password are correct, return true if they are, otherwise false

        if (username.equals("user@example.com") && password.equals("password")) {
            return true;
        } else {
            return false;
        }
    }
}

