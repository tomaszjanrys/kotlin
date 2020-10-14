class Server {
    var myID = 11
    //nie zainicjalizowany
   // val INSTANCE: Server ? = null;
   // val id: Double ? = null;

    //objekt towarzyszacy w tym obiekkcie wszytsko jest stayczne. Funkjce wykonyuwane sa na calej klasie
    companion object{
        private var INSTANCE: Server ? = null;
        private var id: Double ? = null;
//sprawdza czy serwer istnieje jesli nie istnieje utwozy server jesli istnieje zwaraca zawsze ten sam
        //z dowolnego miejsca w programie utworze nowe obiekty ale serwer bedize zawsze ten sam jeden
        fun getInstance():Server{
            if(INSTANCE == null) {
                INSTANCE = Server();
                id = 232.3;
            }
            return INSTANCE!! //lub ? w fun getInstance():Sever ?{}
        }


    }
    //Inicjalizuje obiekty .
    init{

    }
    fun printServer():String{
        return "Server my " + myID;
    }
}