fun main() {
    // Synatax
    /*
    // For single line code

        for(item in collection )  // code


    // For multiline code

        for(item in collection ){
            // code
        }

    */

    // Isme loop 1 to 5 tak ja rha hai 
    for(item in 1..5) println(item)
    for(item in 1..5 ){
        print("Number :- ")
        println(item)
    }
    // Isme loop 5 to 5 tak ja rha hai ♫
    for(item in 5 downTo 1 ){
        print("Number :- ")
        println(item)
    }
}
