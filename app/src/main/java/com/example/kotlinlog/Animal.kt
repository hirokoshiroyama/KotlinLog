package com.example.kotlinlog

import android.util.Log
import kotlin.contracts.contract

abstract class Animal {

    var name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
    abstract fun say()
}

