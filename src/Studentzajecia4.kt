class Studentzajecia4 (var name:String, var surname:String){
fun printStudent(){
    println("Imie ${name}")
    println("Nazwisko ${surname}")
}

    override fun toString(): String {
        return "Studentzajecia4(name='${name}', surname='${surname}')"
    }
    fun createStu():List<Studentzajecia4>?{
        return null
    }
}