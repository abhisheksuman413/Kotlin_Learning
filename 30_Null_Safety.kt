fun main() {

    var name1:String = "SIT" // Iss trh ka varible kv null nhi ho skta hai 
                            // Jb v usme value eak bar deside kr diye to wo kv null nhi hoga
    // name1 = null >>> Ye possible nhi hai (Becouse ise eak default value hai SIT) 
    
    

    var name2:String?= "SIT" // Ager name2 ko null point krna hai to hame data type 
                            // define krte time ? lgana hoga(String? >>> like this)
    
    name2=null

    var name1length = name1.length
    println(name1length)
    
    // var name2length = name2.length >>> Jo variable future me null v ho skta hai 
                                   // >>> usme ase function ko nhi use kr skte hai
    
    
    //  Uper wale condation ko achive krne ke liye 3 option hai 

    // Option1 :- Cheack Null in condation

    val name2length = if(name2 !=null)name2.length else -1
    println(name2length)


    // Option2 :- Safe call {Iska use cheaning me hota hai aage study krege  }

    val name2length1 = name2?.length // Agr wo null hoga to null print kr dega
    println(name2length1)
    
    var name3:String?="SitCSE"
    val name3length = name3?.length // Agr wo Null nhi hua to jo value hai wo print kr dega 
    println(name3length)

    // Option3 :- The !! Operator
    // The not-null assertion operator(!!) coverts any value to a non-null type and
    // throws an exception if the value is null.
    // >>> Jb v koi value null hoga to exception throws kr dega

    // Syntax >>>
    
    val name4:String?= "SITCSEa"
    val name4length =name4!!.length // Yha ham not-null type me covert kr diye
    println(name4length)
    
    

 












}
