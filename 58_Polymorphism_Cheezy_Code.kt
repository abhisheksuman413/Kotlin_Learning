fun main(){

    val circle :circle = circle(4.0)
    val square :square = square(4.0)


    println(circle.area())
    println(square.area())

/* 
Polymorphism
>>> Isme ham reference parent calss ka use kr skte hai but jo object hoga wo child class ka hoga   
>>> Jo hamara reference hoga wo parent class ka bnayege but uske andr jo object hoga wo child class ka hoga 
>>> Parent can hold a reference to its child
>>> Parent can call method of child classes(which are common )

>>> Polymorphism reference jo hoga wo parent class ka hoga but usme jo object hoga 
    wo child class ka hoga or runtime pe decide hoga ki object kis type ka hai uske ansusar 
    uska method call kiya jayega 

>>> It helps in to write maintainable & Extensible code 
>>> It helps in interacting with object via common interface

>>> See Cheezy Code viedo 22 for more information 

>>> Agr function bna rhe hai hai wha child class ka use kiye hai to function call krte time parent class
    object nhi use kr skte hai
>>> But function bnate time parent class ka use kiye hai to function call krte time child class ka 
    object use kr skte hai 

>>> Method calling
    >>> Agr object child class ka hai to sbse phle method child class me cheack hoga agr method child
        class me nhi hai to parent class me cheack hoga agr method parent class me v nhi hai to fir 
        method any class me cheack hoga 
>>> Because any class eak super class hai kotlin me jo sb class ka parent class hai 
>>> Ham usi method ko kewal call kr skte hai jo hamre class me hai ya class ke hierarchy me hai nhi to error aayega

*/
    val circle1 :shape = circle(4.0)
    val square1 :shape = square(4.0)

    println(circle1.area()) // Yha 0.0 print nhi hoga because of Polymorphism
    println(square1.area())// Yha 0.0 print nhi hoga because of Polymorphism


// niche wala possible hai because of Polymorphism
    val abhi :Array<shape> = arrayOf(circle(16.0),circle(21.0), square(25.0));
    findAreaa(abhi)

    
}


fun findAreaa( abhi : Array<shape>)
{
    for(item in abhi)
    {
        println(item.area())
    }
}

open class shape
{
    open fun area(): Double
    {
        return 0.0
    }
}
class circle(val radius : Double) : shape()
{
    override fun area(): Double
    {
        return Math.PI *radius *radius
    }
}
class square(val side: Double) : shape()
{
    override fun area(): Double
    {
        return side*side
    }
}