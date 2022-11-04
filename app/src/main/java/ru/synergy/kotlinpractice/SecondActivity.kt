package ru.synergy.kotlinpractice

import android.app.job.JobServiceEngine
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayUser("Tom", 23)
        displayUser("Alex", 28)
        displayUser("Kate", 34)
        displayUser("John", 47)
        displayUser("Joe")
        displayUser(age = 20, name = "Andy")   // not recommended

        printStrings("Tom", "Bob", "Sam")
        printStrings("A+", "B#", "C-")

        sum(1,2,3,4,5,4,3,2,1,9,8,7,8,9)

        val nums = intArrayOf(1,2,3,4,5)
        changeNumbers(2, *nums)

        val a = sum(1,3, 7)

        var message: () -> Unit
        message = ::hello
        message()  // hello kotlin
        message = ::bye
        message()  // goodbye kotlin

        val operation: (Int, Int) -> Int = ::sum
        val result = operation(3,5)
        print(result) // 8

        displayMessage(::hello)()  // hello kotlin x2
        displayMessage(::bye)

        val b = fun(x: Int, y: Int): Int = x+y    // anonymous fun

        var sum = {x:Int, y:Int -> val result = x+y
        print("$x + $y = $result")
        }
        sum = {x:Int, y:Int -> x+y}

        doOperation(9, 5, fun(x: Int, y: Int):Int = x+y)
        doOperation(9, 5, fun(x: Int, y: Int):Int = x-y)
        doOperation(9, 5) { x: Int, y: Int -> x * y }  // trailing lambda

        val hello = { print("hello") }           // lambda
        hello()   // hello

        val printer = {message: String -> println(message) }
        printer("hello")
    }

    fun displayUser(name: String, age: Int = 18) {  // val here
        println("Name: $name, Age: $age")
    }

    fun double(n: Int){
        var a = n
    }

    fun printStrings(vararg args: String){
        for (str in args){
            println(str)
        }
    }

    fun sum(vararg numbers: Int){
        var result = 0
        for (n in numbers)
         result += n
        println(result)
    }

    fun sum(x: Int, y: Int): Int {       // (Int, Int) -> Int
        return x+y
    }

    fun sum(x: Int, y: Int, z: Int) {   // (Int, Int, Int) -> Unit
        print(x+y+z)
    }

    fun changeNumbers(koef: Int, vararg numbers: Int){
        for (number in numbers)
            println(number * koef)
    }

    fun square(x: Int): Int = x * x  // single expression fun

    fun compareAge(age1: Int, age2: Int){    // local fun
        fun ageIsValid(age: Int): Boolean{
            return (age > 0) and (age <111)
        }
        if (!ageIsValid(age1) or !ageIsValid(age2)){

        }
    }

    fun hello(){           // () -> Unit
        print("hello kotlin")
    }

    fun bye(){
        print("goodbye kotlin")
    }

    fun displayMessage(message1: () -> Unit): () -> Unit {    // high order fun
        message1()
        return message1
        //   return fun(){
        //            print("im anonymous function")
        //        }
    }

    fun doOperation(x: Int, y: Int, op: (Int, Int) -> Int){
        val result = op(x, y)
        println(result)
    }

    fun displayMessage2(message2: () -> Unit): () -> Unit {
        message2()
        return { -> println("hello") }      // lambda
    }

    val c = {_:Any, _:Any -> 0}
}