fun main(){
    val x:Int=55
    when(x.toInt()){
        //
        0 -> println("X wynosi 0")
        1,2,3,4,5,6 -> println("X nalezy do zbioru {1,2,3,4,5,6}")
    else -> println("Errr")
    }
}