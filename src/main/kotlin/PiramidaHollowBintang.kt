fun main(){
    val rows = 6

    for (i in 1..rows) {
        for (j in 1..rows - i) {
            print(" ") // Mencetak spasi untuk membuat bentuk piramida
        }

        for (j in 1..2 * i - 1) {
            if (j == 1 || j == 2 * i - 1 || i == rows){
                print("*") // Mencetak bintang pada setiap baris
            } else {
                print(" ")
            }
        }

        println() // Pindah ke baris berikutnya
    }
}