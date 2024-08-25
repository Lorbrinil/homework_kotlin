fun main() {
    homework_1_1()
    sep()
    homework_1_2()
    sep()
    homework_1_3()
    sep()
    homework_1_4()
    sep()
    homework_1_5()
    sep()
    homework_2_1()
    sep()
    homework_2_2()
    sep()
    homework_2_3()
    sep()
    homework_2_4()
}

fun sep(){
    println("_________________________________")
}

fun homework_1_1(){
    var x = 1
    while (x < 3) {
        print(if (x == 1) "Yab" else "Dab")
        print("ba")
        x = x + 1
    }
    if (x == 3) println("Do")
}

//x не изменяется, поэтому выполнено не будет, надо как-то изменять х
fun homework_1_2() {
    var x = 1
    while (x < 10) {
        if (x > 3) {
            println("big x = $x")
        }
        x = x + 1
    }
}

//val для неизменяемых переменных, надо var
fun homework_1_3() {
    var x = 10
    while (x > 1) {
        x = x - 1
        if (x < 3) {
            println("small x = $x")
        }
    }
}

//не хватало else
fun homework_1_4() {
    var x = 10
    while (x > 1) {
        x = x - 1
        println(if (x < 3) "small $x" else "big $x")
    }
}

//смотреть папку page57homework
fun homework_1_5() {
    var x = 0
    var y = 0
    while (x < 5) {
        y = x - y
        print("$x$y ")
        x = x + 1
    }
    println("")
}

//в цикле изменить с 5 на 4, потому что массив из 4 элементов
fun homework_2_1() {
    val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
    var x = 0;
    while (x < 4) {
        println("${hobbits[x]} is a good Hobbit name")
        x = x + 1
    }
}

// не хватало фигурных скобок в конце вывода
fun homework_2_2() {
    val firemen = arrayOf("Pugh", "Pugh", "Barney McGrew", "Cuthbert", "Dibble", "Grub")
    var firemanNo = 0;
    while (firemanNo < 6) {
        println("Fireman number $firemanNo is ${firemen[firemanNo]}")
        firemanNo = firemanNo + 1
    }
}

fun homework_2_3() {
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    val index = arrayOf(1, 3, 4, 2)
    var y: Int
    var x = 0

    while (x < 4) {
        y = index[x]
        println("Fruit = ${fruit[y]}")
        x = x + 1
    }
}

fun homework_2_4() {
    val x = arrayOf(0, 1, 2, 3, 4)
    x[3] = x[2] //x[3] = 2
    x[4] = x[0] //x[4] = 0
    x[2] = x[1] //x[2] = 1
    x[1] = x[0] //x[1] = 0
    x[0] = x[1] //x[0] = 0
    x[4] = x[3] //x[4] = 2
    x[3] = x[2] //x[3] = 1
    x[2] = x[4] //x[2] = 2
    //ИТОГО: 0 0 2 1 2

    //проверяем:
    var y = 0
    while (y < 5){
        println("${x[y]}")
        y = y + 1
    }
//За работу
}