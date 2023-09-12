fun main() {
    val rows = 7 // mencetak jumlah baris

    for (i in 1..rows) {
        for (j in 1..rows - i) {
            print(" ") // Mencetak spasi untuk membuat bentuk piramida
        }

        for (j in 1..2 * i - 1) {
            print("*") // Mencetak bintang pada setiap baris
        }

        println() // Pindah ke baris berikutnya
    }
}