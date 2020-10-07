fun main(){
println("Napisz cos :")
    //readline() mozliwosc wpisania wartosci
val enterString = readLine()
    println(" Twoj tekst : ${enterString}")
    //convertuje string na integer w inpucie
val numberConv1 = Integer.valueOf(readLine());
val numberConv2 = Integer.valueOf(readLine());
    //przekazuje do fun dowolne licbzy
    fun add(x:Int,y:Int):Int {
        if(x is Int && y is Int) {
            print("OK jest int")
        }
        return x + y

    }
println(add(numberConv1, numberConv2))

    fun say(){
        print("""Hej
            |Tomek
        """.trimMargin())
    }
    fun say2(){
        say()
    }
   say2()
}
