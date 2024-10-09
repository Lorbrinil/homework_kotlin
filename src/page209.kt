//Click <- наследует Clack
open class Click { }
class Clack : Click() { }

//(abstract)Top <- наследует Tip
abstract class Top {}
class Tip : Top() {}

//(abstract)Alpha <- наследует (abstract)Omega
abstract class Alpha {}
abstract class Omega : Alpha() {}

//Foo <- - - реализует Bar наследует <- Baz
interface Foo {}
open class Bar : Foo {}
class Baz : Bar() {}

//Fi <- - - реализует Fo наследует <- Fum
// Fee < - - - реализует Fum
interface Fi {}
interface  Fee {}
open class Fo : Fi {}
class Fum : Fo(), Fee {}