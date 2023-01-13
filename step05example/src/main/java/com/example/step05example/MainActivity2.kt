package com.example.step05example

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

/*
    JAVA -> kotiln
    extends AppCompatActivity => : AppCompatActivity
    implements View.OnClickListener 인터페이스 구현 => View.OnClickListener
 */
class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    //null로 초기화하기 위해서는 ?가 필요하다.
    var editText:EditText? = null
    var names:MutableList<String>? = null
    var adapter:ArrayAdapter<String>? = null
    //위의 선언이 불편하다면 아래와 같이 뒤늦은 초기화도 가능
    lateinit var listView:ListView //참조값을 나중에 넣고 싶으면 lateinit 예약어를 사용하면 된다.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        listView = findViewById(R.id.listView)
        editText = findViewById(R.id.editText)
        //findViewById <UI의 type>
        val addBtn = findViewById<Button>(R.id.addBtn)
        addBtn.setOnClickListener(this)
        names = mutableListOf()
        adapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                names!!)
        /*
            [java]
            .setXXX(value)
            [kotlin]
            .set = value 형태로 바뀌는 경우가 많다
        */
        listView.adapter = adapter
    }

    override fun onClick(p0: View?) {
        //editText?.text 는 editText 안에 값이 null이 아니면 .text를 참조하겠다는 의미
        val inputName:String = editText?.text.toString()
        names?.add(inputName)
        adapter?.notifyDataSetChanged()
        editText?.setText("")
    }
}