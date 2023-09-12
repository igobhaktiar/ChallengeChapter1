fun main() {
    val rows = 10

    for (i in 1..rows) {
        for (j in 1..rows - i) {
            print(" ") // Mencetak spasi untuk membuat bentuk piramida
        }

        for (j in 1..2 * i - 1) {
            print("*") // Mencetak bintang pada setiap baris
        }

        println() // Pindah ke baris berikutnya
    }
    val rows2 = 9
    for (i in rows2 downTo 1) {
        for (j in 1..rows - i) {
            print(" ") // Mencetak spasi untuk membuat bentuk piramida
        }

        for (j in 1..2 * i - 1) {
            print("*") // Mencetak bintang pada setiap baris
        }

        println() // Pindah ke baris berikutnya
    }

}