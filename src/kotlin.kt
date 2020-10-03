fun main(){
    var a: Int = 10;
    var b = 20;
    //val stala
    val add = a+b;
    //do liczby int mozna dokladac rozne nakladki. Bez nakladki 10.3 = blad
    a = 40.9.toInt();
    print("Suma a" + a + " i b" + b + "rowna sie" + (a + b) );
    println("\n suma ${a} + ${b} rowna sie ${(a+b)}")


    //funkcja lambda{} a to element np. 1 -> dodaje a +a = 2
    //zamiast a za -> mozemy uzyc it+it
    println((1..10).map { a -> a + a }.map { it + it });
    println((1..10).map { c->c+c });
    println((1..10).map { it+it });
    println((1..10).map { it+it }.map { it*it }.average())
    //filtruje liczby < 100 i oblicza szecian
    println((1..10).map { it*it }.filter{it<100}.map { it * it });
    val  ave = (1..10).map { it*it }.filter{it<100}.map { it * it };
    println("srednia to: ${ave.average()}")

    val student = Student("Tomek", "Rys");
    student.printstu();
    val zam = Zamieszkanie("Polska", "Tychy");
    zam.living();
}