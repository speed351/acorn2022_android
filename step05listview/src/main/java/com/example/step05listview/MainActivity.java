package com.example.step05listview;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener,
                    AdapterView.OnItemLongClickListener {
    //필드
    List<String> names;
    ArrayAdapter<String> adapter;
    int selectedIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListView에 출력할 sample data
        ListView listView = findViewById(R.id.listView);
        names = new ArrayList<>();
        names.add("kim");
        names.add("lee");
        names.add("park");

        for(int i=0; i<100; i++){
            names.add("아무개"+i);
        }
        //ListView에 연결한 어댑터
        // new ArrayAdapter<>(Context, layout resource, 모델)
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                names);
        //ListView에 어댑터 연결하기
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //int i 는 클릭한 아이템의 인덱스가 들어있다.
        String name = names.get(i);
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }
    //DialogInterface.OnClickListener type 필드
    DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            //눌러진 버튼이 Negative 버튼인지 Positive 버튼인지 구별할 숫자값이 매개변수에 전달된다.
            if(i == DialogInterface.BUTTON_POSITIVE){           //네 버튼
                //필드에 저장된 값을 이용해서 데이터를 삭제
                names.remove(selectedIndex);
                adapter.notifyDataSetChanged();
            }else if(i == DialogInterface.BUTTON_NEGATIVE){     //아니오 버튼

            }
        }
    };

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {


        String name = names.get(i);
        selectedIndex = i;

/*
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("알림");
        builder.setMessage(name+"을 삭제하시겠습니까?");
        builder.setNegativeButton("아니오",null);
        builder.setPositiveButton("예", null);
        AlertDialog dialog = builder.create();
        dialog.show();
*/

        new AlertDialog.Builder(this)
                .setTitle("알림")
                .setMessage("삭제하시겠습니까?")
                .setNegativeButton("아니요",null)
                .setPositiveButton("네", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        names.remove(selectedIndex);
                        adapter.notifyDataSetChanged();
                    }
                })
                .create()
                .show();

        return true;
    }
}




















