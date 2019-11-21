package com.example.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static String countries[]={"Nepal","China","India","UK","US","Canada"};
    EditText etOne;
    Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSave=findViewById(R.id.btnSave);
        etOne=findViewById(R.id.etOne);
        if(TextUtils.isEmpty(etOne.getText()))
        {
            etOne.setError("Enter number");
            return;
        }
        ListView lstCountries=findViewById(R.id.lstCountries);

        ArrayAdapter countryadapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,countries);
        lstCountries.setAdapter(countryadapter);
    }
}
