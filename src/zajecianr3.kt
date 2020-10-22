import kotlin.math.exp

fun main(){
    val x:Int=53
    when(x.toInt()){
        //
        0 -> println("X wynosi 0")
        1,2,3,4,5,6 -> {
            println("X nalezy do zbioru {1,2,3,4,5,6}")
        }
        //jesli x zawiera sie w przedziale
        in(10..100)-> {
            println("X jest w przedziale 10 ..100")
        }
    else -> println("Errr")
    }
    val y:Int= 11
    var z = when(y){
        0 ->2
        in(10..100)->10
        else-> 0
    }
    println("z rowna sie ${z}")
     z = if (x>y) 5 else 10
    println("x zwraca  ${z}")
    val a = 5
    val b = 10
    if(a>b){
       println("a_${a} jest wieksze niz b_${b}")
        println("${a}>${b}")
    } else {
        println("B ${b} jest wieksze niz ${a}")
        println("${a}<${b}")
        println("${if (a>b) a else b}")
    }

example()
}
fun example(){
    //x-e^(-x) = 0
    //var x = 2.0;
    val equation:(Double)->Double = {x:Double -> x - exp(-x)} //funkcja lambda
   var x = -1.0
   println("Rownanie ${ equation(x)}")
    //funkcja lambada przyjmuje int string zwraca doubla lub unit
    //funkcje definiujemy w {}
    var lambda:(Int, String) ->Double = {a:Int , b:String ->10.0}
    val result1 = lambda(5, "Test")
   println("Funkcja lambda  ${result1}")
    var result = x- exp(-x)
    println("$x -e ^ (-${x})= ${result}")

    while (x<2){
        x = x +0.1;
       println(equation(x))
//1.10min
    }
}
