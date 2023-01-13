package com.example.step05example;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //필요한 필드 선언
    EditText editText;
    List<String> names;
    ArrayAdapter<String> adapter;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.addBtn);
        button.setOnClickListener(this);
        listView = findViewById(R.id.listView);
        editText = findViewById(R.id.editText);
        names = new ArrayList<>();
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                names);
        listView.setAdapter(adapter);


    }

    @Override
    public void onClick(View view) {

        names.add(editText.getText().toString());
        adapter.notifyDataSetChanged();
        editText.setText("");
    }
}