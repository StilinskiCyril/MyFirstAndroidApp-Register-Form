package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onRegisterBtnClick (View view) {
        TextView firstName = findViewById(R.id.txtFirstName);
        TextView lastName = findViewById(R.id.txtLastName);
        TextView email = findViewById(R.id.txtEmail);

        EditText firstNameEditText = findViewById(R.id.firstNameView);
        EditText lastNameEditText = findViewById(R.id.lastNameView);
        EditText emailEditText = findViewById(R.id.emailView);

        firstNameEditText.setText("First Name: " + firstName.getText().toString());
        lastNameEditText.setText("Last Name: " + lastName.getText().toString());
        emailEditText.setText("Email: " + email.getText().toString());
    }
}