package com.example.myandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

//app을 실행했을때 처음 사용자를 대면하는 MainActivity
public class MainActivity extends AppCompatActivity {
    //Activity가 활성화 될 때 onCreate()메소드가 호출된다.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // res/layout/activity_main.xml 문서를 전개하면서 화면 구성하기
        setContentView(R.layout.activity_main);
        // activity가 활성화 되는 시점에 원하는 작업이 있으면 여기에 코딩한다.
    }
    /*
        activity_main.xml에 정의된 버튼을 눌렀을때 호출되는 메소드 정의하기
        메소드의 인자로 View type을 전달받도록 만들어야 한다.
    */
    public void sendCLicked(View v){

        //로그창에 문자열 출력하기(System.out.println()이 아님
        Log.d("나의 tag","전송 버튼이 눌러졌다");
        Toast.makeText(this, "전송 버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show();
    }
    /*
        Delete 버튼을 원하는 위치에 배치하고 해당 버튼을 눌렀을때 "삭제버튼을 눌렀네?"라는 토스트 메세지가 길게 출력되도록 해보세요

     */
    public void sendDeleted(View v){
        //로그창에 문자열 출력하기(System.out.println()이 아님
        Log.d("나의 tag","전송 버튼이 눌러졌다");
        Toast.makeText(this, "삭제 버튼을 눌렀습니다.", Toast.LENGTH_LONG).show();
    }
}