class Zamieszkanie {
    var kraj = "";
    var miasto = ""
    constructor(kraj:String, miasto:String){
        this.kraj = kraj;
        this.miasto = miasto
    }
    fun living(){
        println("Kraj ${kraj}");
        println("Miasto ${miasto}")
    }
}