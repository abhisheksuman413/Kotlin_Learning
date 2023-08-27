fun main(){
    val sit = "kotlin"
    println("this is "+sit)


    // Uper wale ko String Templates use kr ke Concate kr skte hai

    println("this is $sit") // Recommended way to Concate (with $ krna hai )

    val sit1 = 10 
    println("sit = $sit")
    
    val sit3= "hello"
    println("$sit3 $sit")
    println("this is $sit3 $sit")

    val a = 10
    val b = 20

    println("Addition = $a + $b ") // Yha addition nhi hoga 
    println("Addition = ${a + b }") // Yha addition hoga
    println("Addition = ${a + b + 50 }") //Yha addition hoga or use 50 v add hoga 


    val sit4 = "sit cse"

    println("collage name is $sit4")
    println("collage name is ${sit4.toUpperCase()}") // String me function ko ase use krte hai 
    



}
