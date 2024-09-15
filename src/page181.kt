//1A 1B - все ок
open class Monster {
    open fun frighten(): Boolean {
        println("Aargh!")
        return true
    }
}

class Vampire : Monster() {
    override fun frighten(): Boolean {
        println("Fancy a bite?")
        return false
    }
}

//2A 2B - функция в Monster непереопределяемая, поэтому не тот результат
/*
open class Monster {
    fun frighten(): Boolean {
        println("Aargh!")
        return true
    }
}

class Vampire : Monster() {
    override fun frighten(): Boolean {
        println("Fancy a bite?")
        return true
    }
}*/

//3A 3B - отсутствует override
/*
open class Monster {
    open fun frighten(): Boolean {
        println("Aargh!")
        return false
    }
}

class Vampire : Monster() {
    fun beScary(): Boolean {
        println("Fancy a bite?")
        return true
    }
}
*/

class Dragon : Monster() {
    override fun frighten(): Boolean {
        println("Fire!")
        return true
    }
}
fun main(args: Array<String>) {
    val m = arrayOf(Vampire(),
        Dragon(),
        Monster())
    for (item in m) {
        item.frighten()
    }
}
