// Inheritance with Primary and Secondary Constructor in same code44_InConstructorheritance_with_Primary_and_Secondary_Constructor

open class Father3(car:String,money:Int){ // Iss constructor ko aargument Son class ka object dega
    // Properties
    var car : String 
    var money:Int

    
    init{
        this.car=car
        this.money=money
    }

    // Memeber functioon 
    fun disp(){
        println("Father car :- $car")
        println("Father money :- $money")
    }
}

// Niche Father3 ke bad () nhii dege
class Son3:Father3{
    // Properties
    var Bike :String

    // Constructor

    constructor(car:String,money:Int, Bike:String):super(car,money){
        this.Bike=Bike
    }

    // Member function
    fun show(){
        println("Son Bike :- $Bike ")
        println("Father car after Inheritance  :- $car") 
        println("Father money after Inheritance  :- $money") 
        
    }
}
    




fun main(){

    
    var s1 =Son3("mg 3000",501,"KS 100")
    s1.show()
  
    // Ressine v kr skte hai
    println("After ressaine")
    s1.car ="XUV"
    s1.money =500
    s1.show()
    s1.disp()
    
    
}