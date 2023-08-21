fun main(){

    // Yeha se sara same line me print hoga
    print(" Hello Kotlin ")// Yha message print kr rhe hai 
    print(10)// Yha direct varible print kr rhe hai
    print(10+20) // Print function me calculation v kr skte hai
    val a =10
    print(a) // Varible ka value print ho rha hai 

    // Niche hamlog calculation ka use kr ke string ko variable ke sath print kr rhe hai
    print(" Value is :- "+ a) // String or variable eak sath print kr rhe hai
    
    // Niche hamlog bina calculation ka use kr ke string ko variable ke sath print kr rhe hai▬
    print(" Value is  :-  $a  ")
    val b =20
    print(" Numbers are $a and $b") // String ke sath eak sath do variable print kr rhe hai

    // Niche hamlog expression ko evaluate krhe hai
    print(a+b)
    print("value is :- ${a+b}")
    print("value is :- ${a+b+30}") // Evaluate with custom integer inpute 
    
    
    
    // Yeha se sara different line print hoga 
    println(" Hello Kotlin ")
    println(10)
    println(10+20) 
    val a1 =10
    println(a) 

    // Niche hamlog calculation ka use kr ke string ko variable ke sath print kr rhe hai
    println(" Value is :- "+ a) 
    
    // Niche hamlog bina calculation ka use kr ke string ko variable ke sath print kr rhe hai▬
    println(" Value is  :-  $a1  ")
    val b1 =20
    println(" Numbers are $a1 and $b1") 

    // Niche hamlog expression ko evaluate krhe hai
    println(a+b)
    println("value is :- ${a1+b1}")
    println("value is :- ${a1+b1+30}") 
}