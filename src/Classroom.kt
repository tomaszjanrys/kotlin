class Classroom(private val no:Int) {
    val server = Server.getInstance()

    fun printClass(){
       println("Numer" + no + "Podlaczono do serwera" + server.printServer())
    }
}