class TerballikPiramida : Shape() {

    override fun draw(bintang: Int) {

        for (i in bintang downTo 1){
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