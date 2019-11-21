package com.example.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public static String countries[]={"Nepal","Kathmandu","China","Beijing","India","New Delhi","UK","London","US","Washington D.C","Canada","Ottawa"};
    EditText etOne;
    Button btnSave;
    private Map<String,String> dictionary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSave=findViewById(R.id.btnSave);
        etOne=findViewById(R.id.etOne);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etOne.getText()))
                {
                    etOne.setError("Enter number");
                    return;
                }

            }
        });

        ListView lstCountries=findViewById(R.id.lstCountries);
        dictionary=new HashMap<>();
        for(int i=0;i<countries.length;i+=2)
        {
            dictionary.put(countries[i],countries[i+1]);
        }
        ArrayAdapter countryadapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,new ArrayList<String>(dictionary.keySet()));
        lstCountries.setAdapter(countryadapter);
    }
}
