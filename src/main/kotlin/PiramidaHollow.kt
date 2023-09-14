class PiramidaHollow : Shape() {
    override fun draw(bintang: Int) {

        for (i in 1..bintang) {
            for (j in 1..bintang - i) {
                print(" ")
            }

            for (j in 1..2 * i - 1) {
                if (j == 1 || j == 2 * i - 1 || i == bintang){
                    print("*")
                } else {
                    print(" ")
                }
            }

            println() // Pindah ke baris berikutnya
        }
    }
}