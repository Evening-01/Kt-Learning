package 中级.内联函数


// 关键字"inline"
// 内联函数主要是为了优化效率而存在
// "inline"内联函数代表当其被调用时，kotlin被调用后不再拥有函数的特征，而是将其替换为函数内的内容
fun main() {
    test()
    //  编译后：
    // println("这是一个内联函数")
    // println("这是一个内联函数")
    // println("这是一个内联函数")

    //  inline关键字在高阶函数中更加明显

    test2 { println("打印：$it") }
    // 编译后：
    // println("这是一个内联函数")
    // val it = "Hello World"
    // println("打印：$it")

    //此处两处示例表明：虽然内联后代码量变多，但是也带来了性能上的提升，不过仅对高阶函数有效果，普通函数完全没有必要
}

private inline fun test() {  // 这是普通函数，此处inline提出警示，因为其完全没有必要添加
    println("这是一个内联函数")
    println("这是一个内联函数")
    println("这是一个内联函数")
}

private inline fun test2(func: (String) -> Unit) {
    // 当然，内联后func将不能被变量接收，否则报错
    // 需要被变量接收请看test3
    // val a = func
    println("这是一个内联高阶函数")
    func("Hello World")
}

private inline fun test3(noinline func: (String) -> Unit) {
    val a = func  // 此处将不报错
    println("这是一个内联高阶函数")
    func("Hello World")
}