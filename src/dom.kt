class Dom {
    var pokoje : String
    var metraz : Number = 0
    constructor(pokoje:String, metraz: Number){
        this.pokoje = pokoje
        this.metraz = metraz
    }
    fun spis (){
        println(" przeznaczenie : ${pokoje}")
        println(" powieszchnia : ${metraz} mkw")
    }
}