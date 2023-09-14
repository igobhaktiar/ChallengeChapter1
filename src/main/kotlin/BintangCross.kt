class BintangCross : Shape() {
    override fun draw(bintang: Int) {

        for (i in 1..bintang){
            for (j in 1 .. bintang ){
                if (i == j || i == bintang - j + 1){
                    print("*")
                } else {
                    print(" ")
                }
            }
            println()
        }

    }
}