//  Inheritance with Primary Constructor


open class Father1(car:String,money:Int){ // Iss constructor ko aargument Son class ka object dega
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

// Father class me jo constructor bnaye hai uske argument ko yha mention krna hoga
// Or Son class me constructor bnana chahte hai to uske argument ko v iske sath likhna hoga 
// Or fir niche Father me btna hoga ki Father calss ka argument kon kon sa hai 
class Son1(car:String,money:Int, Bike:String):Father1(car,money){
    // Properties
    var Bike :String

    init{
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

    
    var s1 =Son1("mg 3000",501,"KS 100")
    s1.show()
  
    // Ressine v kr skte hai
    println("After ressaine")
    s1.car ="XUV"
    s1.money =500
    s1.show()
    s1.disp()
    
    
}