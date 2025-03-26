package 中级

fun main() {
    // 接受一个参数为String，输出为Int的函数类型
    // 单参函数
    val func: (String) -> Int = {
        println(it)  // 此处it表示接收的参数string
        1  //此处代表的是返回值Int
    }

    // 多参函数
    val func2: (String, String) -> Int = { a, b ->
        println(a)
        println(b)
        2
    }

    // 当参数一（或其他参数）不调用时，添加下划线（多参）
    val func3: (String, String) -> Int = { _, b ->
        println(b)
        3
    }

    println(func("666"))
    println("---")
    println(func2("A", "B"))
    println("---")
    test(func3)  // 此处与下面的效果一致
    println("---")

    // 高阶函数（内含多参function）
    test{ _, b ->
        println(b)
        4
    }

    println("---")

    //  高阶函数（内含单参function）
    test2{
        println(it)
        5
    }

    println("---")

    //  高阶函数（内含String + 单参function）
    test3("Kotlin") {
        println(it)
        6
    }  // 此处与安卓compose声明式UI结构一致

    println("---")

    // 在lambda表达式中，无法使用return语句，如果使用，需添加魔法标签，例：
    val func4: (Int) -> String = test@{
        // 判断it是否大于10提前返回结果
        if (it > 10) return@test "我是提前返回的结果"
        println("我是正常情况")
        "收到的参数为$it"
    }

    println(func4(9))
    println("---")
    println(func4(12))

    println("---")

    // 如果是函数调用的尾随lambda表达式，默认标签名字就是标签名字，例：
    test4 {
        if (it > 10) return@test4 "我是提前返回的结果"
        println("我是正常情况")
        "收到的参数为$it"
    }  // 不要觉得眼花，其效果是和上面一致的
}

private fun test(func: (String, String) -> Int) {
    println(func("Hello", "World"))
}

private fun test2(func: (String) -> Int) {
    println(func("Hello World"))
}

private fun test3(a: String, func: (String) -> Int) {
    println(func(a + "Hello World"))
}

private fun test4(func: (Int) -> String) {
    println(func(9))
    println("---")
    println(func(12))
}

