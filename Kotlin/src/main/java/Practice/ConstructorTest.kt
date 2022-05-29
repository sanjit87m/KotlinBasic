package Practice

class ConstructorTest(name: String, isAdmin: Boolean) {
   private var age = 0
    constructor(name: String, isAdmin: Boolean, age: Int):this(name, isAdmin){
        this.age = age

    }

}