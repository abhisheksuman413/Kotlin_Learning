fun main() {

    // Many ways to making/creating Array

    // 1)   arrayOf()
    // Synatx >>>
    // Array bnate hai becouse single datatype ka bhut data store krne ke liye
    // But yha ham datatype defijne nhi kiye hai to alg alg datatype v rakh skte hai

    var sit = arrayOf("ram", "cse", "khana", 'j', 45)
    println(sit) // Iss se hame ye array jha store hua hai uska location mil jta hai

    println(sit[0])
    println(sit[1])
    println(sit[2])
    println(sit[3])
    println(sit[4])

    for (item in sit) {
        println(item)
    }
    
    // Spefic data type array
    
    val sit1 = arrayOf<String>("cse","it","ece","ai","ml")
    println(sit1[0])
    println(sit1[1])
    println(sit1[2])
    println(sit1[3])
    println(sit1[4])
    
    for (item in sit1) {
        println(item)
    }
    
    // Reassign the value 
    sit1[3]="math"
    
    for (item in sit1) {
        println(item)
    }
    
    // Reassign value useing set function
    
    sit1.set(3,"science") // Set function me 2 parameter hota hai first index and 2nd value

    
    for (item in sit1) {
        println(item)
    }
    
    // Get value from array
    
    val a = sit1[3]
    println(a)
    
    // get value from array useing get function
    
    val  a1= sit1.get(3) // // get function me 1 parameter index
    println(a1)
    
    
    
    // >>> Value ko ham update kr skte hai but koi new value(index) add nhi kr skte hai 
    
    // sit1[5]="ece" >>> Yha ase new value nhi aad hoga ye exception error dega output me 
    // Becouse jb ham array bnate hai to usi time uska size fix ho jta hai
    // Bad me ham uska size increase nhi kr skte hai 
    // This is the diffrence between list and array 
    // list me eak add function hota hai wo array me use nhi hota hai 
    
    // for (item in sit1) { 
    //     println(item)
    // }
    
    // Taking user inpute in array 

    // Loop Array and their Index

    println("Loop Array and their Index")

    for(i in sit1){
        println(i)
    }

    // >>> Printing index in array
    for(i in sit1.indices){ //Array name.indices likhne se index milta hai hamko
        println(i)
    }

    // >>> Agr index of value dono ea sath chiye to 

    for(i in sit1.indices){
        println("On index $i value is ${sit1[i]} ")
    }

    // Printing size of array

    println("Printing size of array sit1 ${sit1.size}")

    // Looping useing array size

    for (i in 0..sit1.size-1){
        println("On index $i value is ${sit1[i]} ")
    }
    

    // For each loop

    sit1.forEach {i -> println(i) }


}
 