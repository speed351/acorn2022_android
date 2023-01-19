package com.example.step08viewbinding;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.step08viewbinding.databinding.ActivityMainBinding;

/*
    view binding 사용하는 방법

    1. build.gradle 파일의 android 에 아래 문자열을 추가
    buildFeatures{
        viewBinding = true
    }

    2. build.gradle 파일의 우산단에 sync 버튼을 눌러서 실제 반영되게 한다.

    3. layout xml 문서의 이름을 확인해서 자동으로 만들어진 클래스명을 예측한다.

    예를들어 activity_main.xml 문서이면 ActivityMainBinding 클래스
    예를들어 activity_main.xml 문서이면 ActivitySubBinding 클래스
*/
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //필드  ActivityMainBinding 객체의 참조값 필드 선언
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //activity_main.xml 문서에 전개된 EditText, Button, TextView의 참조값을 얻어오는 방법 1
        /*
        EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);

         */

        //activity_main.xml 문서에 전개된 EditText, Button, TextView의 참조값을 얻어오는 방법 2
        /*
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        EditText editText = binding.editText;
        Button button = binding.button;
        TextView textView = binding.textView;
        *
        /*
            예를 들어 EditText 에 문자열을 입력하고 버튼을 누르면 입력한 문자열이
            TextView 로 이동하도록 프로그래밍 한다면아래와 같은 코딩이 된다
         */
        //바인딩 객체의 참조값을 얻어와서 필드에
        // 저장
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //버튼에 리스너 등록
        binding.button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        //EditText 객체에 입력한 문자열 읽어오기
        String msg = binding.editText.getText().toString();
        binding.textView.setText(msg);
    }
}