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

        val human = Human("イチ",1,"～～")

        human.say()
        Log.d("kotlintest","私の名前は"+human.name+"です。")
        Log.d("kotlintest","私の年は"+human.age+"歳です。")

        val human1 = Human("ニ",2,"～～")

        human1.say()
        Log.d("kotlintest","私の名前は"+human1.name+"です。")
        Log.d("kotlintest","私の年は"+human1.age+"歳です。")

        human.think()
        Log.d("kotlintest","私は"+human.hobby+"について考える。")

        human1.think()
        Log.d("kotlintest","私は"+human1.hobby+"について考える。")

    }
}
