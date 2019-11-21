package com.example.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        TextView tvText=findViewById(R.id.tvText);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String message=bundle.getString("myMessage");
            tvText.setText(message);
        }
        else
        {
            Toast.makeText(this, "No Message", Toast.LENGTH_SHORT).show();
        }
    }
}
