1, “<<”语法已经被启用了，现代写法是

task helloWorld {
doLast {
println 'Hello, World!'
}
}
doLast: doLast是Gradle任务的一个标准方法，它允许你定义一个闭包，这个闭包会在任务的所有其他动作都执行完毕后执行


