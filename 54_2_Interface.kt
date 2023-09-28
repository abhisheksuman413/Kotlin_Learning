//   *** Interface resove conflict *****

// Name conflict in interface

interface A {
    fun callMe(){
        println("From interface A")
    }
    
}

interface B {
    fun callMe(){
        println("From interface B")
    }
    
} 

class C : A, B{
    override fun callMe(){
        // callMe() >>> Yha callMe ko ase use krege to name conflict aayega 
                    // Niche main() me jb object create kr ke callMe ko call krege 
                   // to error aayega
                  // Ye smj nhi payega kon se callMe ko use krna hai interface A ya interface B ka
        
        // Syntax to resolve name conflict 
        super<A>.callMe() // Jis interface ke callMe ko use krna hai usko <> ke andr likh dege 
                         // ab niche main() me object bna kr CallMe ko call krege to 
                        // interface A ka callMe call hoga 

    }
}


class D:A,B{
    override fun callMe(){
        super<B>.callMe()
    }
}

fun main(){
    val obj = C()
    obj.callMe() // >>> Yha name conflict ho rha hai kon sa callMe ko call krna hai smj me nhi aa rha hai iske 
                // >>> wjh se error aayega isko name conflict bolte hai 
    
    val obj1 = D()
    obj1.callMe()


}




/*
In Kotlin, an interface is a fundamental concept used to define 
a contract or a set of abstract methods and properties that classes 
can implement. Interfaces provide a way to define the structure of a 
class without providing a concrete implementation. Essentially, an 
interface specifies what a class should do without specifying how 
it should do it. This allows you to establish a common structure or 
behavior that multiple classes can adhere to.

Here are some key points about interfaces in Kotlin:

1) Abstract Methods: Interfaces can declare abstract methods (methods 
                    without a body) that implementing classes must 
                    provide concrete implementations for.

2) Abstract Properties: Interfaces can also declare abstract properties 
                        (properties without initial values) that implementing 
                        classes must provide getters or setters for.

3) Multiple Interfaces: A class can implement multiple interfaces, which means 
                        it can adhere to the contracts of multiple interfaces 
                        simultaneously.

4) Default Implementations: Starting from Kotlin 1.0, interfaces can provide 
                        default implementations for methods. These default implementations 
                        are inherited by implementing classes, but classes can choose 
                        to override them.

5) Interface Inheritance: Interfaces can extend other interfaces, inheriting their method 
                          and property declarations.

6) Usage as Types: Interfaces can be used as types for variables, function parameters, 
                   and return types. This allows for polymorphism, where objects of 
                   classes implementing the interface can be assigned to interface type 
                   variables.



>>> Interfaces in Kotlin are an important tool for defining contracts and promoting 
    code reuse and maintainability in object-oriented programming. They enable you 
    to create a consistent structure among classes while allowing for flexibility 
    in their actual implementations.



*/