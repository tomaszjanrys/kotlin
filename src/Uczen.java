public class Uczen {
    private  String name = "";
    private  String surname = "";
    private  Integer myID = 0;

    //Wspolne pole dla wszystkich obiektow okreslamy slowem staic
    static  Integer id = 0;


    Uczen(String name, String surname){
        myID = id;
        this.name = name + "_" + myID;
        this.surname = surname + "_" + myID;
        myID = id;
        id++;
    }

    @Override
    public String toString() {
        return "" + name + "" + surname;
    }
}
