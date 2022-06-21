package com.joocoding.android.app.scopefunction

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import java.util.*
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
data class Person(val name:String, var age :Int = 0, var city :String = "paju")
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.joocoding.android.app.scopefunction", appContext.packageName)
    }
    @Test
    fun test1(){
        val adam = Person("Adam").apply {
            age = 20                       // same as this.age = 20 or adam.age = 20
            city = "London"
        }
        println(adam)
    }

    @Test
    fun test2(){
        fun writeToLog(error : String){
            println(error)
        }
        fun getRandomInt(): Int {
            return Random.nextInt(100).also {
                //it은 함수 호출 안의 obejct로 사용될때 더 좋다.
                writeToLog("getRandomInt() generated value $it")
            }
        }

        val i = getRandomInt()
        println(i)
    }

    @Test
    fun test3(){
        val numberList = mutableListOf<Double>()
        numberList.also { println("Populating the list") }
            .apply {
                add(2.71)
                add(3.14)
                add(1.0)
            }
            .also { println("Sorting the list") }
            .sort()
    }

    @Test
    fun test4(){
        fun writeToLog(error : String){
            println(error)
        }
        fun getRandomInt(): Int {
            return Random.nextInt(100).also {
                writeToLog("getRandomInt() generated value $it")
            }
        }

        val i = getRandomInt()
    }

    /*
    let run 과 widt은 람다식을 반환함 따라서
    변수에 결과를 할당할때 , 결과에 연산을 연결할때 사용
     */
    @Test
    fun test5(){
        val numbers = mutableListOf("one", "two", "three")
        val countEndsWithE = numbers.run {
            add("four")
            add("five")
            count { it.endsWith("e") }
        }
        println("There are $countEndsWithE elements that end with e.")
    }

    /*
    whit
    반환 값을 무시하고 객체로 임시 변수를 만들때 .변수를 위한 임시적인 스코프를 만들때 사용
     */
    @Test
    fun test6(){
        val numbers = mutableListOf("one", "two", "three")
        with(numbers) {
            val firstItem = first()
            val lastItem = last()
            println("First item: $firstItem, last item: $lastItem")
        }
    }

    @Test
    fun test7(){

    }

    @Test
    fun test8(){

    }

    @Test
    fun test9(){


    }
    @Test
    fun test10(){

    }
}