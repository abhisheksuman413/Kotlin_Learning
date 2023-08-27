fun main() {
    /* >>> String are immutable
    >>> Once you initialize a string you can't change its value or assign
        a new value to it
    >>> All operations that transform String return their results in new String
        object, leaving the oringinal string unchanged */

    val sit = "hello"
    println(sit)
    println(sit[0])
    println(sit[1])
    println(sit[2])
    println(sit[3])
    println(sit[4])

    // " " >>> Iske andr ko hoga wo string hi mana jyega

    // String Concatenation  >>> Concatenation ka matlb hota hai add krna do string ko

    val sit1 = "hello"
    val sit2 = "kotlin"
    val sit3 = sit1+sit2

    println(sit3)
    println(sit1+sit2)

    // sitring ke sath Concate krna 

    println("sit cse "+sit3)

    // Concate string  with integer

    println("100 "+50) // Yha 50 string bn ja rha hai 
    // println(50+"1000") >>> This is not possible becouse integer ko string ke sath Concate nhu kr skte hai 



}
