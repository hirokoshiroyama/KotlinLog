package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.util.Log
import java.lang.Exception
import java.security.acl.LastOwnerException
import java.time.temporal.ValueRange

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("～～",0)

        human.say()
        Log.d("kotlintest","私の名前は"+human.name+"です。")
        Log.d("kotlintest","私の年は"+human.age+"歳です。")

        val human1 = Human("イチ",1)

        human1.say()
        Log.d("kotlintest","私の名前は"+human1.name+"です。")
        Log.d("kotlintest","私の年は"+human1.age+"歳です。")


        human.think()
        Log.d("kotlintest","「私は～～について考える。」"+"(～～はhobbyから取得)")

        human1.think()
        Log.d("kotlintest","「私は～について考える。」"+"（～はhobbyから取得）")



        val  str1 = "Hello"
        val  str2 = "World"
        val  str3 = "Hello"

        if (str1.equals(str2)){
            Log.d("kotlintest","str1とstr2は一緒です")
        }else{
            Log.d("kotlontest","str1とstr2は異なります")
        }

        if (str1.equals(str3)) {
            Log.d("kotlintest", "str1とstr3は一緒です")
        }else{
            Log.d("kotlintest","str1とstr3は異なります")
        }

        val  i = 100
        val str = i.toString()+"*100 = ${i*100}"
        Log.d("kotlintest",str)
    }
}