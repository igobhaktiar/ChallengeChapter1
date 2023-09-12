fun main (){
    val rows = 15

    for (i in 1..rows){
        for (j in 1 .. rows){
            if (i == j || i == rows - j + 1){
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}