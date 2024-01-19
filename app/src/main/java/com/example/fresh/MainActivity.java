package com.example.fresh;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.check.MyTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyTest myTest = new MyTest();
        String platform = myTest.getPlatform();
        System.out.println("The platform is: " + platform);
    }
}