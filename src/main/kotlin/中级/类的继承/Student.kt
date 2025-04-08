package 中级.类的继承

// kotlin中类的属性为终态,所以必须加open关键字才可被继承

open class Student(var name: String, var age: Int) {
    init {
        println("父类初始化")
    }

    open fun hello() {
        println("父类你好")
    }
}