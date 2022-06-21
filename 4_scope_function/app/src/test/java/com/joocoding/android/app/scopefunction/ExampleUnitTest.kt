package com.joocoding.android.app.scopefunction


import org.junit.Test
import kotlin.random.Random

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {


    // it
    @Test
    fun test1() {
        data class Apple(var weight: Int)
        class AppleTree(val appleTree: List<Apple>) {
            fun pick(): Apple {
                return appleTree[0]
            }
        }

        class FruitBasket {
            private var weight = 0

            fun addFrom(appleTree: AppleTree) {
                val apple = appleTree.pick().let { it ->
                    this.weight += it.weight
                    add(it)
                }

            }

            fun add(apple: Apple) {

            }
        }

    }



    @Test
    fun test2() {
        fun writeToLog(error: String) {
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
    fun test16(){
        val numbers = mutableListOf("one", "two", "three")
        val countEndsWithE = numbers.run {
            add("four")
            add("five")
            count { it.endsWith("e") }
        }
        println("There are $countEndsWithE elements that end with e.")


    }

    @Test
    fun test3() {
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
    fun test4() {
        fun writeToLog(error: String) {
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
    fun test5() {
        val numbers = mutableListOf("one", "two", "three")
        val countEndsWithE = numbers.run {
            add("four")
            add("five")
            count { it.endsWith("e") }
        }
        println("There are $countEndsWithE elements that end with e.")
    }

    /*
    with
    반환 값을 무시하고 객체로 임시 변수를 만들때 .변수를 위한 임시적인 스코프를 만들때 사용
     */
    @Test
    fun test6() {
        val numbers = mutableListOf("one", "two", "three")
        with(numbers) {
            val firstItem = first()
            val lastItem = last()
            println("First item: $firstItem, last item: $lastItem")
        }
    }

    @Test
    fun test7() {
        val numbers = mutableListOf("one", "two", "three", "four", "five")
        numbers.map { it.length }.filter { it > 3 }.let {
            println(it)

            // and more function calls if needed
        }
    }

    @Test
    fun test8() {
        val numbers = mutableListOf("one", "two", "three", "four", "five")
        val resultList = numbers.map { it.length }.filter { it > 3 }
        println(resultList)

    }

    @Test
    fun test9() {
        val numbers = mutableListOf("one", "two", "three", "four", "five")
        numbers.map { it.length }.filter { it > 3 }.let(::println)

    }

    @Test
    fun test10() {
        val str: String? = "Hello"
        //processNonNullString(str)       // compilation error: str can be null
        val length = str?.let {
            println("let() called on $it")
            // processNonNullString(it)      // OK: 'it' is not null inside '?.let { }'
            it.length
        }
    }

    @Test
    fun test11() {

    }

    @Test
    fun test12() {

    }

    @Test
    fun test13() {

    }

    @Test
    fun test14() {

    }

    @Test
    fun test15() {

    }
}

