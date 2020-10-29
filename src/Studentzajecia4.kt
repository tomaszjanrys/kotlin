class Studentzajecia4 (var name:String, var surname:String) {
    fun printStudent() {
        println("Imie ${name}")
        println("Nazwisko ${surname}")
    }

   // override fun toString(): String {
    //    return "Studentzajecia4(name='${name}', surname='${surname}')"
    //}


        fun createStu(n: Int, name: String, surname: String,f:(Int)->String): ArrayList<Studentzajecia4>? {
            val array: ArrayList<Studentzajecia4> = arrayListOf()
            for (i in 1..n) {
                array.add(Studentzajecia4("${name} ${f(n)} ${surname}"))

            }
            return array
        }
    }
