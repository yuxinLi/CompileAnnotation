package com.example.compileannotation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.libannotation.BindView;
import com.example.libapi.InjectHelper;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InjectHelper.inject(this);

        tv.setText(" you are injected !");
    }
}
