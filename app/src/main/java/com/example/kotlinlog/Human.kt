package com.example.kotlinlog

import  android.util.Log

open class Human : Animal,thinkable{

    constructor(name:String, age:Int):super(name,age) {
    }
    override fun  say(){
        super.say()
        Log.d("kotkintest","私の名前は"+this.name+"です。"+"年は"+this.age+"歳です。"+"(～～はメンバ変数から取得)")
    }

    override fun think() {
        Log.d("kotlintest","「私は～～について考える。」"+"(～～はhobbyから取得)")

    }
}