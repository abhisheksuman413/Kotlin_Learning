fun main(){

    /* var:- var are those variables that can be reassigned */
    // Dynamic type 
    var roll = 10
    var mobilenumer = 7002344522L // Long ke liye last me L likh dege 
    var price = 7477.4f //Float ke liye last me f
    var totalcost=323232.323
    var gender='f'
    var name = "Sit Siliguri ";
    var isActive= true

    println(roll)
    println(mobilenumer)
    println(price)
    println(totalcost)
    println(gender)
    println(name)
    println(isActive)
    
    // Yha se value ko reassign kr rhe hai 
    // Uper me eak bar jb datatype define kr diye to usko 
    // reassign krte time chane nhi kr skte hai 
    roll = 45
    mobilenumer = 4388840848 // Long ke liye last me L likh dege 
    price = 74744f //Float ke liye last me f
    totalcost=327434.43
    gender='A'
    name = "Sit Siliguri Sukan ";
    isActive= false
    

    // Yha reassign krne ke bad print kr rhe hai
    println(" Printing value after reassign" )
    println(roll)
    println(mobilenumer)
    println(price)
    println(totalcost)
    println(gender)
    println(name)
    println(isActive)
    
    
    //   Specific Type
    
    var roll1:Int = 10
    var mobilenumer1:Long = 7002344522L // Long ke liye last me L likh dege 
    var price1 :Float= 7477.4f //Float ke liye last me f
    var totalcost1:Double=323232.323
    var gender1:Char='f'
    var name1:String= "Sit Siliguri ";
    var isActive1:Boolean= true
    
    println(" Printing value after after making spefic data type" )
    println(roll1)
    println(mobilenumer1)
    println(price1)
    println(totalcost1)
    println(gender1)
    println(name1)
    println(isActive1)
    
    
    
    
    /* >>> val:-read only local variables are defined using the 
    keyword val . 
    >>> They can be assigned a value only once   */
    
    //  Dynamic type
    
    val roll3 = 10
    val mobilenumer3 = 7002344522L 
    val price3 = 7477.4f 
    val totalcost3=323232.323
    val gender3='f'
    val name3 = "Sit Siliguri "
    val isActive3= true
    
    // Yha hamlog val keyword use kr ke jo variable bnaye the dynamic type usko print kr rhe hai 
    println(" Printing value useing val keyword after makeing dynamic type " )
    println(roll3)
    println(mobilenumer3)
    println(price3)
    println(totalcost3)
    println(gender3)
    println(name3)
    println(isActive3)
    
    // // Yha value ko reassign krna possible nhi hai  
    
    // roll3 = 10
    // mobilenumer3 = 7002344522L 
    // price3 = 7477.4f 
    // totalcost3=323232.323
    // gender3='f'
    // name3 = "Sit Siliguri "
    // isActive3= true
    
    
    //   Specific Type
    
    var roll4:Int = 10
    var mobilenumer4:Long = 7002344522L // Long ke liye last me L likh dege 
    var price4 :Float= 7477.4f //Float ke liye last me f
    var totalcost4:Double=323232.323
    var gender4:Char='f'
    var name4:String= "Sit Siliguri ";
    var isActive4:Boolean= true
    
    // Yha hamlog val keyword use kr ke jo variable bnaye the specific type usko print kr rhe hai 
    println(" Printing value useing val keyword and after making specific type" )
    println(roll4)
    println(mobilenumer4)
    println(price4)
    println(totalcost4)
    println(gender4)
    println(name4)
    println(isActive4)

    
    
}
