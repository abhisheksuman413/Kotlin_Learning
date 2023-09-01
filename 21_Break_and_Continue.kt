fun main(){


    /* break >>> break ka use hamlog loop band krne ke liye krte hai 
             >>> break jha pe use krte hai hai wha se code execute hona 
                 band ho jata hai 
             >>> jis condation pe break use kiye hote hai uss condation se code
                 run hona band ho jata hai*/

    // Examole >>>>
    for(item in 1..19){
        if(item == 11){ // 11 se code break(band) ho jyega
            break
        }
        println("Step :- $item")
    }


    /* continue >>> continue ka use hamlog lopp me skip krne ke liye krte hai
                >>> continue jha pe use hoga wha ka code skip ho jyega 
                >>> jis condation ke liye continue ka use krege uss condation 
                    ka code loop me nhi chelga  */

    // Examole >>>>
    for(item in 1..19){
        if(item == 11){ // 11 pe code skip ho jyega 
            continue
        }
        println("Step :- $item")
    }
}