fun main(args: Array<String>) {
    val stala = "test";
    println("Val to stala niezmienna :" + stala);
    var zmienna = "Polska";
    zmienna  = "USA"
    println("Zmienna Polska zostala zmieniona na zmienna ${zmienna}");

    //zmiennna : typ = wartosc lub typ zostanie utomatycznie rozpoznamy
    var x : Double = 10.1
    var z : Double = 10.5
    var y : Number = 2
    // do x nie mozemy przypisac np.1 musi byc 1.0 lub po 1 .to (radzaj typu)
    y = 10.toDouble()
    val add = x +y
    val sub = x - y
    val sub2 = z - y
    val newF = add(1.2,3.3)

    println("Suma ${x} + ${y} = ${add}")
    println("Roznica 1 ${x} - ${y} = ${sub}")
    println("Roznica 2 ${z} - ${y} = ${sub2}")
    println(newF)
    var tab = mutableListOf<Number>(1,2,3,4,45);
    println("Tablica 1" + tab)
    //tablica typ double
    var tab2 = mutableListOf<Double>(1.0,2.0,3.0,4.0,5.0,6.0)
    println(" Tablica 2 z map "+tab2.map { 2+ it /2  })


}
fun add (x:Double, y:Double):Double {
    return x + y
}
