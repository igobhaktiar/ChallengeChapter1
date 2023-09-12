fun main(){
    val rows = 7 // mencetak jumlah baris

    for (i in rows downTo 1){ // Membalik susunan bintang
        for (j in 1 .. rows - i){
            print(" ") // mencetak spasi untuk membuat bentuk piramida
        }

        for (j in 1 .. 2 * i - 1){
            print("*") // mencetak bintang pada setiap baris
        }
        println() //Pindah ke baris berikutnya
    }
}