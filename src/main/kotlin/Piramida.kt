class Piramida : Shape() {
    override fun draw(bintang: Int) {

        for (i in 1 .. bintang){
            for (j in 1 .. bintang - i){
                print(" ")
            }

            for (j in 1 .. 2 * i - 1){
                print("*")
            }
            println()
        }
    }

}