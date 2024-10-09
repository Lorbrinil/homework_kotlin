interface Flyable {
    val x: String
    fun fly() {
        println("$x is flying")
    }
}
class Bird : Flyable {
    override val x = "Bird"
}
class Plane : Flyable {
    override val x = "Plane"
}
class Superhero : Flyable {
    override val x = "Superhero"
}
fun main(args: Array<String>) {
    val f = arrayOf(Bird(), Plane(), Superhero())
    var x = 0
    while (x in 0..2) {

        //корректно
        when (f[x]) {
            is Bird -> {
                x++
                f[x].fly()
            }
            is Plane, is Superhero ->
                f[x].fly()
        }


        //х - int, поэтому не сработает
        /*
        if (x is Plane || x is Superhero) {
        f[x].fly()
        }*/


        //не хватает is перед  Plane, Superhero -> f[x].fly()
        /*
        when (f[x]) {
        Plane, Superhero -> f[x].fly()
        }
        */


        //корректно выведется
        /*
        val y = when (f[x]) {
            is Bird -> false
            else -> true
        }
        if (y) {f[x].fly()}
        */

        x++
    }
}