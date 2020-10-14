fun main(){
    val uczniowie = mutableListOf<Uczen>()
    //gdy przypiszemy wartosc 100 to numeracja zacznie sie przypisanej wartosci
     Uczen.id = 100;
   for (i in 1..11) {
       uczniowie.add(Uczen("marek", "nowak"));
   }
    println(uczniowie);
    Uczen.id = 0;
    for(i in 1..11){
        uczniowie.add(Uczen("WetGoat", "Ninja"))
    }
    println("${uczniowie}")
    println(Uczen.id)

    /////////////////////////null///////////////////////
    // var x = 5.0;
    // x = 1.5;
    ///x = null;
    ////Aby przypisac  null/////////
    var x: Double ? = 5.0;
    x = null;
    ////////////////////////////////////
    val class32  = Classroom(22);
    println(class32)
}