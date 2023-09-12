fun main() {
    val rows = 15

    for (i in 1..rows) {

        // Piramida Atas
        if (i <= (rows + 1) / 2) {
            for (j in 1.. (rows + 1) / 2 + 1 - i ) {
                print(" ") //membuat spasi untuk bentuk piramida
            }

            for (j in 1..2 * i - 1) {
                print("*") // mencetak bintang pada setiap baris
            }
        }
        // Piramida Bawah
        else {
            for (j in 1.. i - rows /2) {
                print(" ") //membuat spasi untuk bentuk piramida
            }

            for (j in 1..2 * (rows - i) + 1) {
                print("*") // mencetak bintang pada setiap baris
            }
        }
        println()
    }
}