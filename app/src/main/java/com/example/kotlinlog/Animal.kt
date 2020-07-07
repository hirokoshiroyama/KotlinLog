package com.example.kotlinlog

import android.util.Log
import kotlin.contracts.contract

open class Animal {

    var  name : String
    var  age : Int

    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }

    open fun say(){
        Log.d("kotlintest","私の名前は"+this.name+"です。"+"年は"+this.age+"歳です。"+"(～～はメンバ変数から取得)")

    var hobby:String


    }


}