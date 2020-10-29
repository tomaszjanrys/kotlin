fun main(){
    println("test")
    val square = {a:Double -> a*a }
    val add = {a:Int, b:Int -> a +b}
    //funkcja sub przyjmuje Int i zwraca int
    val sub:(Int,Int)->Int = {a:Int, b:Int -> a -b}
    println(square(3.3))
    println(add(2,2))
    println(sub(1,10))
}