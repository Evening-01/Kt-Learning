package 中级.类的继承

class ArtStudent(name: String, age: Int) : Student(name, age) {

    init {
        println("子类初始化")
    }

    override fun hello() {
        println("子类重写父类方法")
    }

}