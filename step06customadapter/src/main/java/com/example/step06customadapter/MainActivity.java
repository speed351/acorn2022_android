package com.example.step06customadapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    List<CountryDto> countries;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //아답타에 연결할 모델 객체 생성
        countries=new ArrayList<>();
        //셈플데이터
        countries.add(new CountryDto(R.drawable.austria,
                "오스트리아", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.belgium,
                "벨기에", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.brazil,
                "브라질", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.france,
                "프랑스", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.germany,
                "독일", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.greece,
                "그리스", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.israel,
                "이스라엘", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.italy,
                "이탈리아", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.japan,
                "일본", "그지 같은 나라~"));
        countries.add(new CountryDto(R.drawable.korea,
                "대한민국", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.poland,
                "폴란드", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.spain,
                "스페인", "어쩌구.. 저쩌구.."));
        countries.add(new CountryDto(R.drawable.usa,
                "미국", "어쩌구.. 저쩌구.."));
        //ListView에 연결할 아답타
        CountryAdapter adapter = new CountryAdapter(this, R.layout.listview_cell, countries);

        //ListView의 참조값 얻어오기
        ListView listView = findViewById(R.id.listView);

        //아답타를 List View에 연결하기
        listView.setAdapter(adapter);
        
        //listView의 셀을 클릭했을 때 동작할 리스너 등록
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //DetailActivity로 이동
        Intent intent = new Intent(this, DetailActivity.class);
        /*
            Intent 객체에 어떤 정보를 담아서 다른 액티비티에 전달할 수 있다.

            여기서는 어떤 객체를 담아야 하는가?

            클릭한 cell의 index에 해당하는 CountryDto 객체를 담아야 한다.

         */
        //클릭한 셀의 index를 이용해 dto를 얻어낸다.
        CountryDto dto = countries.get(i);
        /*
            intent 에 담을 데이터를 Serializable type 으로 만들어놓고 담는다
            .putExtra(key, Serializable type value)
         */
        intent.putExtra("dto", dto);

        startActivity(intent);
    }
}
































