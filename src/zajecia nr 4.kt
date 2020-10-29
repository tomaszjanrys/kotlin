import kotlin.math.PI

fun main(){
    println("test")
    val square = {a:Double -> a*a }
    val squre2:(Double)->Double = {a -> a*a}
    val add = {a:Int, b:Int -> a +b}
    //funkcja sub przyjmuje Int i zwraca int
    val sub:(Int,Int)->Int = {a:Int, b:Int -> a -b}
    println(square(3.3))
    println(squre2(3.33))
    println(add(2,2))
    println(sub(1,10))

    val numbers2 = IntArray(10){it*it}
    val numbers3 = IntArray(10){it*it*it}
    val numbers4 = IntArray(10){it*it*it*it}
    val numbers5 = IntArray(10){it*it*it*it*it}
    //numbers.asList() wyswietla jako liste
    println(numbers2.asList())
    println(numbers3.asList())
    println(numbers4.asList())
    println(numbers5.asList())
    val dx = PI/100
    val arrey1 = DoubleArray(10){dx*it}
    println(arrey1.asList())
    val mathSquare:(Int)->Int = {a:Int->a*a}
    //1 sposob
    math(20,mathSquare)
    //2 sposob
    math(5,{a -> a *a })
    //3 sposob
    math(55,{it*it})
    //4 sposob
    math(5){it*it}


    //druga fun
    math2(2,2){a,b->a*a+b*b}
}
//funkcja przyjmuje 2 patametry druga to funkcja ktora zwraca Itn
fun math(a:Int,fun1:(Int)->Int){
println("wynikiem dzialania jest ${fun1(a)}")
}
//dwu elementowa
fun math2(a: Int, b:Int, fun2:(Int, Int)->Int){
    println("Wynikiem dzialania drugiej fun jest : ${fun2(a,b)}")
}