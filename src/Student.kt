class Student {
    //zmienne musza byc zainicjanilozowane
    var name = "";
    var surname = ""
    constructor(name:String, surname:String){
        this.name = name;
        this.surname = surname;
    }
    fun printstu(){
        println("Imie :${name} " +
                " Nazwisko ${surname}")
    }
}