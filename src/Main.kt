//Из книги пример
fun main(args: Array<String>) {
    val options = arrayOf("Rock","Paper","Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam:Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String{
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice) {
        //Запросить у пользователя его выбор
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")
        //Прочитать пользовательский ввод
        val userInput = readLine()
        //Проверить пользовательский ввод
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        //Если выбран недопустимый вариант, сообщить пользователю
        if (!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice
}

/*ДОМАШНЕЕ ЗАДАНИЕ*/
/*-----------------------------------------*/
//Все ок
fun doSomething(msg: String, i: Int): Unit {
    if (i > 0) {
        var x = 0
        while (x < i) {
            println(msg)
            x = x + 1
        }
    }
}

//Нельзя изменять x, потому что как локальная переменная val
//Поэтому можно присвоить новой переменной значение
fun timesThree(x: Int): Int {
    var y = x
    y = y * 3
    return y
}

//Нет типа возвращаемого значения для функции
fun maxValue(args: Array<Int>): Int {
    var max = args[0]
    var x = 1
    while (x < args.size) {
        var item = args[x]
        max = if (max >= item) max else item
        x = x + 1
    }
    return max
}
/*-----------------------------------------*/

/*
x += 6          81 23

x--             18 23

y = x + y       27 131

y = 7           27 6

x = x + y       4286 4275
y = x - 7

x = y           35 32
y++
*/
fun page_109() {
    var x = 0
    var y = 20
    for(outer in 1..3) {
        for (inner in 4 downTo 2) {
            x = y
            y++
            y++
            x += 3

        }
        y -= 2
    }
    println("$x $y")
}
/*-----------------------------------------*/
fun printResult(userChoice: String, gameChoice: String) {
    val result: String
//Определить результат
    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")) result = "You win!"
    else result = "You lose!"
//Вывести результат
    println("You chose $userChoice. I chose $gameChoice. $result")
}