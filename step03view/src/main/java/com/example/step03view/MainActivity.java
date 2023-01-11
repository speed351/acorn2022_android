package com.example.step03view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //필드
    private EditText inputMsg;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // res/layout/activity_main.xml 문서를 전개해서 화면 구성하기
        setContentView(R.layout.activity_main);
        /*
            위의 xml 문서를 전개하면
            ConstraintLayout, EditText, Button 객체가 생성된다.

            만일 java code에서 해당 UI를 가지고 어떤 동작을 하려면 그 객체의 참조값이 필요하다.
            그 객체의 참조값을 어떻게 얻어오는지 학습하기
         */
        // findViewById : AppCompatActivity를 상속받았기에 사용 가능한 메소드
        // id를 이용해서 EditText 객체의 참조값 얻어오고, 다른 메소드에서 활용 가능하도록 필드값에 담기
        this.inputMsg = findViewById(R.id.inputMsg);
        // id를 이용해서 sendBtn 객체의 참조값 얻어오기
        Button sendBtn = findViewById(R.id.sendBtn);

        this.textView = findViewById(R.id.textView);
        // 버튼을 클릭했을때 호출될 메소드를 가지고 있는 View.OnClickListener type의 참조값 전달하기
        sendBtn.setOnClickListener(this);
    }

    //버튼을 클릭하면 호출되는 메소드
    @Override
    public void onClick(View view) {
        //EditText에 입력한 문자열을 읽어와서 지역변수에 담아서 받아온다.
        //getText()의 return type이 Editable이기 때문에 toString()으로 받아준다.
        String msg = this.inputMsg.getText().toString();
        textView.setText(msg);
        this.inputMsg.setText("");
    }
}