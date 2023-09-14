class LayangLayang : Shape(){

    override fun draw(bintang: Int) {
        for (i in 1..bintang ) {

            // Piramida Atas
            if (i <= (bintang + 1) / 2) {
                for (j in 1.. (bintang + 1) / 2 + 1 - i ) {
                    print(" ")
                }

                for (j in 1..2 * i - 1) {
                    print("*")
                }
            }

            // Piramida Bawah
            else {
                for (j in 1.. i - bintang /2) {
                    print(" ")
                }

                for (j in 1..2 * (bintang - i) + 1) {
                    print("*")
                }
            }
            println()
        }

    }

}