fun main(args : Array<String> ){
    var myStack2 = Stack<Int>()
    println(myStack2.isEmpty())
    myStack2.push(50)
    myStack2.push(16)
    myStack2.push(10)
    myStack2.push(5)
    println(myStack2.toString())
    println(myStack2.pop())
    println(myStack2.toString())
    println(myStack2.isEmpty())
}