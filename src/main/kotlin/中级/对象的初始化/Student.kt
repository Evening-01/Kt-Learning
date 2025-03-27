package 中级.对象的初始化

class Student(name: String, var age: Int) { // 由于主构造函数中无法写入函数体
    // 因此我们可以在init块中进行初始化
    // 注意此时形参已经被赋值，因此可以直接使用
    init {
        println("我是初始化操作")
        if (age < 18) age = 18  // 一定要注意主构造函数要定义为var，否则无法修改age的值
        println("初始化操作结束")
    }

    init {
        println("我是另一个初始化操作")  // 从上往下的顺序进行初始化操作
    }
}