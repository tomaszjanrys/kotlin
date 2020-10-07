class Cars {
    var model = "";
    var color = ""
    var year:Int

    constructor(model: String, color: String, year:Int){
        this.model = model;
        this.color = color;
        this.year = year;
    }
    fun carPrint(){
        println(
                "Model samochodu ${model}" +
                        "Kolor samochu ${color}" +
                        "Rok produkcji ${year}"
        )
    }

}
