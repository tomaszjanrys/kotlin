fun main() {
    var tab = mutableListOf<Int>(1, 1, 4, 1, 1, 1, 1, 1);
    tab.add(0,1)
    println(tab)
    println(tab.map { it + it }.average());
    var tab2 = mutableListOf("d",3)
    tab2 = mutableListOf("x",22)
    println(tab2)
}