package com.example.dialer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var num1=0
    var num2=0
    var cal = calculate(num1,num2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun getValue(view:View){
        var a = findViewById<Button>(view.id)

        textView.text = textView.text as  CharSequence
        if (cal.symbol){
            num2 = Integer.parseInt(a as String)
        }else{
            num1 = Integer.parseInt(a as String)

        }


}
    fun setsymbol(view: View){
        cal.symbol = true
    }
    fun result(view: View){
        if (cal.whichSymbol == 1){
            textView.text = cal.add(num1, num2).toString()
        }else if(cal.whichSymbol == 2){
            textView.text = cal.sub(num1, num2).toString()
        }
    }
}
