fun main(){
    val x:Int=53
    when(x.toInt()){
        //
        0 -> println("X wynosi 0")
        1,2,3,4,5,6 -> println("X nalezy do zbioru {1,2,3,4,5,6}")
        //jesli x zawiera sie w przedziale
        in(10..100)-> println("X jest w przedziale 10 ..100")
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
}
