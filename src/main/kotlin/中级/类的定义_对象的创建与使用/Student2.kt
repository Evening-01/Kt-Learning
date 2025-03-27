package 中级.类的定义_对象的创建与使用

// 此处定义了主构造函数和次构造函数，主要证明他的执行顺序
// 由Main.kt中的执行来看，优先执行主构造函数，然后执行次构造函数
class Student2(var name: String, var age: Int) {
    init {
        println("我是主构造函数的打印")
    }

    constructor(name: String) : this(name, 0) {
        println("我是次构造函数的打印")
    }

}