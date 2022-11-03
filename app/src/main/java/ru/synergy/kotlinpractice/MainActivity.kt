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

        var range: Any = 1..5  // [1,2,3,4,5] //1+5
        range = 'a'..'z'

        range = 5 downTo 1 // [5,4,3,2,1]
        range = 5 downTo 1 step 2 // [5,3,1]
        range = 1 until 9 // [1-8]
        range = 1 until 9 step 2
        range = 2 in 1 until 9 step 2 //false
        range = 2 in 1 until 9 //true

        for (c in 1..9) print(c)

        val numbers: Array<Int> = arrayOf(1,2,3,4,5,6)
        val n = numbers[1]
        numbers[3] = 7
        print("numbers[2] = ${numbers[2]++}")

        val numbers2 = Array(3, {5}) //[5,5,5]

        var i = 1
        val numbers3 = Array(4, {i++ *2}) //[2,4,6,8]

        for (number in numbers) print("$number \t")

        val people = arrayOf("Tom", "Sam", "Bob")
        for (person in people)
            print("$person \t")

        while (i in people.indices){  // or (i !in people.indices)
            print("${people[i]} \t")
            i++          // true or false
        }

        for (i in people.indices){
            print("${people[i]} \t")
        }

        var integers: IntArray = intArrayOf(1,2,3,4,5,6)
        var doubles: DoubleArray = doubleArrayOf(1.3, 2.4, 3.56)

        integers = IntArray(3, {5})
        doubles = DoubleArray(5, {1.7})
    }
}