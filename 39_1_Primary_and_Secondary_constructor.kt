
// Use Primary and Seconday constructor eak sath 


class Registration(email:String,password:String){
    // Properties

    var hName:String=""
    var hAge:Int?=null // ? null ke liye use kiye hai 
    var hEmail:String
    var hPassword:String
    var gender:String="Male"
    
    // Secondary constructor
    /*
    >>> Primary constructor me jo parameter likhte hai wo secondary 
        constructor ke parameter  me likhna hi pdta hai 
    >>> Fir () ke bad : dena hai or this keyword ka use krna hai 
        or uske () me primary constructor ka parameter bina datatype 
        ke likhna hai 
    >>> Yhi iska syntax hai niche bnaye hai 

    */
    constructor(name:String,age:Int,email:String,password:String):this(email,password){
        hName=name // this ka use nhi kiye because dono parameterke name same nhi hai 
        hAge=age
    }
    // Init block
    init{
        hPassword=password
        hEmail= email // Isko uper me me initlize kr skte the 
    }

    // Member Function 
    fun disp(){
        println("Name :- $hName")
        println("Age :- $hAge")
        println("Email :- $hEmail")
        println("Password :- $hPassword")
        println("Gender :- $gender")
    }


}


fun main(){

    var user1 = Registration("Darshan", 65, "sahkhs.com", "sdhjjdj1234")
    user1.disp()
    
    
    var user2 = Registration("Devanand", 42, "djksghdkjghs@hfh.com", "12345")
    user2.disp()

}