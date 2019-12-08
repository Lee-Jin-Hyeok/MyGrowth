package Tests

public class TestKotlin {
	public fun main(args : Array<String>) {
		val person1 : Person_ = Person_("Lee", 16)
		val person2 : Person_ = Person_("Kim")
		
		person1.ShowInfo()
		person2.ShowInfo()
	}
}

class Person_ constructor(name : String, age : Int) {
	private val name : String
	private val age : Int
	
	constructor(name : String) : this(name, 17)
	
	init {
		this.name = name
		this.age = age
	}
	
	public fun ShowInfo() {
		println("name : " + name)
		println("age : " + age)
	}
}