package Tests

class KotlinClass {
	fun main(args : Array<String>) {
		println("Hello World")
		val person = Person("Lee", 17)
		person.ShowInfo()
	}
}

class Person(name : String, age : Int){
	private val name : String
	private val age : Int
	
	constructor(name : String) : this(name, 0) {}
	
	init {
		this.name = name
		this.age = age
	}
	
	public fun ShowInfo() {
		println("name : " + this.name)
		println("age : " + this.age)
	}
}