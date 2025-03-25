package 中级

fun main() {
    // 接受一个参数为String，输出为Int的函数类型
    // 普通函数
    val func: (String) -> Int = {
        println(it)  // 此处it表示接收的参数string
        10  //此处代表的是返回值Int
    }

    // 多参函数
    val func2: (String, String) -> Int = { a, b ->
        println(a)
        println(b)
        20
    }

    // 当参数一（或其他参数）不调用时，添加下划线
    val func3: (String, String) -> Int = { _, b ->
        println(b)
        20
    }

    println(func("666"))
    println("---")
    println(func2("A", "B"))
    println("---")
    test(func3)  // 此处与下面的效果一致
    println("---")

    test{ _, b ->
        println(b)
        20
    }

    println("---")

    test2{
        println(it)
        30
    }
}

fun test(func: (String, String) -> Int) {
    println(func("Hello", "World"))
}

fun test2(func: (String) -> Int) {
    println(func("Hello World"))
}