package com.example.student.casestudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AdminPortal extends AppCompatActivity {

    //Global variable to store login state
    public boolean hasAuth = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_portal);

        //Disable logged in state on first launch
        hasAuth = false;

    }
}
