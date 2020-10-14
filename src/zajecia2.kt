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
}