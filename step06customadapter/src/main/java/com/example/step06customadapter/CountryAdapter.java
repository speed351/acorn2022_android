package com.example.step06customadapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/*
    ListView에 연결할 어댑터 클래스 정의하기
    -BaseAdapter 추상 클래스를 상속받아서 만든다.

 */
public class CountryAdapter extends BaseAdapter {
    //필드
    Context context;
    int layoutRes;
    List<CountryDto> list;


    //생성자
    public CountryAdapter(Context context , int layoutRes, List<CountryDto> list){
        this.context = context;
        this.layoutRes = layoutRes;
        this.list = list;
    }
    /*
        아래 4개의 메소드는 ListView가 필요 시 호출하는 메소드이다.
        따라서 적절한 값을 리턴하도록 프로그래밍 해야한다.
     */
    @Override
    public int getCount() {
        //모델의 갯수
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        // i번째 인덱스에 해당하는 모델을 리턴해야 한다
        // CountryDto를 return
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        // i번째 인덱스에 해당하는 모델이 id(primary key 값) 리턴하기
        return i;
    }
    //인자로 전달된 position에 해당하는 cell view를 만들어서 리턴하거나 이미 만들어진 cell view의 내용만 만들어서 리턴한다.
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Log.e("CountryAdapter", "getView() 호출됨 i : "+i);
        // 1. res/layout/listview_cell.xml 문서를 전개해서 View 객체를 만든다.
        if(view==null){
            Log.e("CountryAdapter", "view가 null 입니다.");
            //LayoutInflater : layout 전개자 객체
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(layoutRes, viewGroup, false);
        }
        // 2. i에 해당하는 CountryDto의 객체의 참조값을 얻어온다.
        CountryDto dto = list.get(i);
        // 3. 만든 View 객체 안에 있는 ImageView, TextView의 참조값을 얻어온다.
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textView = view.findViewById(R.id.textView);
        // 4. ImageView, TextView에 정보를 출력한다
        imageView.setImageResource(dto.getResId());
        textView.setText(dto.getName());
        // 5. i번째 인덱스에 해당하는 View를 리턴해준다.
        return view;
    }
}



























