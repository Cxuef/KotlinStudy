package com.eirot.android.kotlin01


import android.graphics.Color
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast



class KotlinMainActivity : AppCompatActivity() {
    /*
     * val <常量标识符> : <类型> = <初始化值>
     * var <变量标识符> : <类型> = <初始化值>
     */
    val TAG : String = "KotlinMainActivity"
    var a : Int = 2
    var b : Int = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_main)
        var image = findViewById<ImageView>(R.id.image)
        image.setOnClickListener { view ->  toastMessage("( ⊙o⊙ ) You clicked me !")}
        //val text = findViewById<TextView>(R.id.text)
        Log.v(TAG, "a = $a b = $b a + b = ${sum(a, b)}")
        Log.v(TAG, sumLambda(5, 6).toString())
    }

    override fun onResume() {
        super.onResume()
    }

    /**
     * 函数定义
     * Int 参数，返回值 Int
     * @param a
     * @param b
     */
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    // lambda(匿名函数)
    val sumLambda: (Int, Int) -> Int = {a,b -> a+b}

    // 无返回值的函数, 默认返回类型Unit, 可省略
    fun toastMessage(msg: String) : Unit {
        Toast.makeText(baseContext, msg, Toast.LENGTH_LONG).show()
    }
}
