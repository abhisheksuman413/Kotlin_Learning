
class human(_name:String,_email1:String, _age:Int){
    // var message:String >>> Agr iska value yha pe define nhi kr rhe hai to ye run time error dega 
                        // >>> koi v value agr hame bad me define krna hai to kotlin me runtime error aata hai 
                        // >>> Iss error ko remove krne ke liye hame koi initial value dena pdta hai 
                        // >>> Age initial value nhi diye to kotlin me hamlog eak keyword ko use krte hai 
                        // >>> Wo keyword hai lateinit
                        // >>> lateinit me ham hmesa var ko hi use krege becouse usko bad me define kr ske 
                        // >>> lateinit ke sath ham int boolen float nhi bna skte hai 
    // lateinit var message:Int >>> Asa v nhi kr skte hai 
    lateinit var message:String // ye valid hoga 

    /*
    >>> Agr ham class ke koi v properties ko niche main function me access kr rhe hai to 
        default Getters & Setters auto call ho jta hai dikhta nhi hai
    >>> Agr properties ke value ko access kr rhe hai to default getters call hoga
    >>> Agr properties ke value ko modify kr rhe hai to default setter call hoga
    */


    // Getters & Setters
    
    // Custom Setters
    var age=_age // Iska setter bnane ke liye hame iske niche set likhna hota hai 
    set(value){
        if(value>0){
            field=value // field yha kotlin ke trf se special varible hai jisko value assine krte hai 
        }
        else{
            println("Age can't be -ve ")
        }
    }
    // Custom Getters
    var name:String=_name
    get(){
        // Isme me field name ka eak special varible hota hai jo value deta hai     
        // Uss value ke sath ham kuch v kr skte hai koi v operation performe kr skte hai 
        println("Nmae getters is called ")
        return field.toUpperCase()

    }
/*
// Default getters & setters syntax

var email:String
get()=field
set(value){
    field=value
}
*/

// Example:-

var email=_email1

// get()=field
// set(value){
//     field=value
// }

}


fun main(){
    val p1 = human("ravi ","sjdgsg@gmail.com",21)
    println("Nmae :- ${p1.name}")
    println("Age :- ${p1.age}")
    p1.age=-65
    println("Age :- ${p1.age}") // Yha 21 hi print hoga becouse value -ve hone se update nhi ho rha hai 
    println("Email printed :- ${p1.email}")

}


/*
// Setters:- Settrs ka use hamlog class ke properties me koi 
             glat value nhi ja rha hai iska cheack krne ke liye 
             krte hai
        >>> Jase ki yha age ka value ham -ve me de diye hai 
            fir v age ka value print ho ja rha hai 
        >>> Isi ko cheack krne ke liye ham settrs ka use krte hai 


// Getters:- 

*/