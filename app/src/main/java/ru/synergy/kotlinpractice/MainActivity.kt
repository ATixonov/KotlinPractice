package ru.synergy.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var age: Int = 23
        println(age)
        age = 17

        var example = 10f
                val address: Int = 0x0A1 //161
        val ding: Double = 23e3 // 23 000
        val bing: Boolean = false
        val kent: Char = 'A'
        val mine: String = "lorem \n ipsum 10"
        val vine: String = """lorem
            | ipsum 
            | 10""".trimMargin() // | - perenosy

        val firstName: String = "Tom"
        val secondName: String = "Smith"
        val welcome: String = "Hello, $firstName omglolwtf $secondName"
        println(welcome)

        var welcomeDuplicate = welcome;
        var duplicate: Any = 48L

        readLine()

        val a = true
        val b = false
        var c = a and b
        println(c)
        var d = a or b
        println(d)
        var e = a xor b
        println(e)
        c = !a
        d = b.not()

        val f = 5
        val g = f in 1..6

        if (a == b) f else g

        val isEnabled = true
        when (isEnabled){
            true -> println("is enabled on")
            false -> println("is enabled off")
        }

        val param = 10
        when (param){
            in 1..10 -> println("is enabled on")
            11, 12 -> println("is enabled off")
            else -> println("default")
        }

        val firstArg = 15
        val secondArg = 6
        val newArg = when{
            (firstArg > 10) -> println("First bigger")
            //(firstArg > 10) -> 10
            //(firstArg > 10) -> firstArg
            (secondArg > 10) -> println("Second bigger")
            else -> println("both lesser")
        }

        for (n in 1..9){
            print("arg: ${n*n} \t")
        }



    }
}