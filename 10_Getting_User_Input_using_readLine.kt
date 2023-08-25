fun main(){
    print("Enter your name ")
    val name =readLine()// >>> Yha ham koi data type define nhi kiye hai 
    // ye hmesa inpute jo lega wo string me hi lega 
    // >>> Agr yha 123 v inpute lege wo string me hi lega 
    // >>> readLine() ham jb v use krte hai wo string me hi inpute lega 
    // >>> Agr ham chahte hai integer inpute le to hame Typecasting krna pdega
    println("Name :- $name")
    println(name!! :: class.simpleName) 
    
    
    // Typecasting readLine()
    print("Enter your roll no :-")
    val rollno = readLine()!!.toInt() /* >>> yha user jo inpute de rha hai wo string me aa
                                             rha hai usko ham yha integer me convert kr de 
                                             rhe hai
                                         >>> Yha ham typeconversion kr rhe hai */  
    println("Your roll no is :- $rollno")
    println(rollno :: class.simpleName)
    
    // Niche hamlog Float me typeconversion kr rhe hai 
    print("Enter your fee :-")
    val fee = readLine()!!.toFloat()   
    println("Your roll no is :- $fee")
    println(fee :: class.simpleName)




    
    // Specific data type inpute 
    print("Enter your collage name ")
    val collage:String?= readLine() // Yha ? kuy dale ye null safety me study krna hai 
    println("Your collage name :- $collage")
    println(collage!! :: class.simpleName) // Iss se collage ka kon sa data type hai ye print ho jyega 
    // !! Kuy use kiye ye v null safety ka point hai 



}