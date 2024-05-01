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
    for (item in 1..5) println(item)
    for (item in 1..5) {
        print("Number :- ")
        println(item)
    }

    // forloop >>> step
    /*
    >>> step use krne se jitna time increament chahte hai utna hota hai
    >>> Yha har bar two times increament hoga
    */
    for (i in 1..10 step 2) {
        println(i)
    }

    // Untin in for loop 
    /*
    >>> until use krne se upper bound include nhi hota hai
    >>> Yha 1 to 9 tak hi kewal print hoga 
    */
    for( i in 1 until 10)
    {
        println(i)
    }

    // downTo in for loop 
    /*
    >>> Isme loop 5 to 1 tak ja rha hai
    >>> Jo cpp me i-- hota tha wahi hai ye 
    >>> Iske sath downTo ka v use kr skte hai
    */
    for (item in 5 downTo 1) {
        print("Number :- ")
        println(item)
    }

    //
}
