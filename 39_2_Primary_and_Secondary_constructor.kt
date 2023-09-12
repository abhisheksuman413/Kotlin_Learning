// 39_1_Primary_and_Secondary_constructor ke code ko dusre trika se likhe hai 

// Project me ase variable name ka use krte hai iss se asan hota hai code ko read krne me 
// Same name ka varible name use krne se this keyword ka use krte hai 
// Stackoverflow me v ase hi code ka example diya hua hota hai 
class Registration2(_email:String,_password:String){
    // Properties

    var name:String=""
    var age:Int?=null 
    var email:String
    var password:String
    var gender:String="Male"
    
    
    constructor(name:String,age:Int,_email:String,_password:String):this(_email,_password){
        this.name=name // This ka use krne se ye smjega ye name jo hai properties wala hai 
        this.age=age
    }
    // Init block
    init{
        password=_password
        email= _email 
    }

    // Member Function 
    fun disp(){
        println("Name :- $name")
        println("Age :- $age")
        println("Email :- $email")
        println("Password :- $password")
        println("Gender :- $gender")
    }


}




fun main(){
    var user1 = Registration2("Darshan", 65, "sahkhs.com", "sdhjjdj1234")
    user1.disp()
    
    
    var user2 = Registration2("Devanand", 42, "djksghdkjghs@hfh.com", "12345")
    user2.disp()

}