fun main() {
    homework_1_5()
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
}

fun homework_2_1() {

}

fun homework_2_2() {

}

fun homework_2_3() {

}