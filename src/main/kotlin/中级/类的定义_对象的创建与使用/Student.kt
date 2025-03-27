package 中级.类的定义_对象的创建与使用

// 此处对应 中级：类的定义
// 主构造函数可以省略constructor关键字，如果主构造函数没有任何参数，可以省略括号
// 类属性可以声明为val或var，默认是val
/*
    class Student(val name: String, var age: Int = 18){

    }
*/

// 如若需要将其定义get和set函数，即可这么写
/*
    class Student(val name: String, var age: Int = 18){
        var name: String = name
            get() = field.toUpperCase()
            set(value) {
                field = value.toLowerCase()
            }
    }
*/

// 当我们一开始不需要初始值，可能在某一时间段给予他初始值，则可以这样写
/*
    class Student(){
        lateinit var name: String
        var age: Int = 18 // 此处基本类型不可使用懒加载
    }
*/

// 调用方式如下
// 此处对应 中级：对象的创建与使用

class Student(var name: String, var age: Int) {
    constructor(name: String): this(name, 18) // 调用主构造函数，并给予默认值
}