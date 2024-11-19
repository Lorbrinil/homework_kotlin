//Все ок, результат
//Misty: Meow!
//Socks: Meow!
/*class Cat(var name: String? = "") {
    fun Meow() { println("Meow!") }
}
fun main(args: Array<String>) {
    var myCats = arrayOf(Cat("Misty"),
        null,
        Cat("Socks"))
    for (cat in myCats) {
        if (cat != null) {
            print("${cat.name}: ")
            cat.Meow()
        }
    }
}*/

//Запустится, но потому что нет проверки на null, как в предыдущем, выдаст
// Misty: Meow!
//null: Meow!
//Socks: Meow!
/*class Cat(var name: String? = null) {
    fun Meow() { println("Meow!") }
}
fun main(args: Array<String>) {
    var myCats = arrayOf(Cat("Misty"),
        Cat(null),
        Cat("Socks"))
    for (cat in myCats) {
        print("${cat.name}: ")
        cat.Meow()
    }
}*/


//Нет проверки, что объект не равен null.
// Есть проверки только на имя и функцию
// Выдаст:
// Misty: Meow!
//null: Socks: Meow!
/*class Cat(var name: String? = null) {
    fun Meow() { println("Meow!") }
}
fun main(args: Array<String>) {
    var myCats = arrayOf(Cat("Misty"),
        null,
        Cat("Socks"))
    for (cat in myCats) {
        print("${cat?.name}: ")
        cat?.Meow()
    }
}*/


//name без "?", поэтому не можем присвоить null, ошибка
/*class Cat(var name: String = "") {
    fun Meow() { println("Meow!") }
}
fun main(args: Array<String>) {
    var myCats = arrayOf(Cat("Misty"),
        Cat(null),
        Cat("Socks"))
    for (cat in myCats) {
        if (cat != null) {
            print("${cat?.name}: ")
            cat?.Meow()
        }
    }
}*/