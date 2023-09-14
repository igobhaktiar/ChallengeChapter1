import java.util.Scanner

fun main() {

    println("Pilihan \n" +
            "1. Piramida \n" +
            "2. Piramida Terbalik \n" +
            "3. Layang - layang \n" +
            "4. X Bintang \n" +
            "5. Piramida Hollow Bintang ")

    val pilihan = Scanner(System.`in`)
    print("Masukkan Pilihan : ")
    var input:Int = pilihan.nextInt()
    println("Pilihan : $input")

    if (input == 1){

        val piramid = Piramida()
        piramid.draw(7)
    }
    else if (input == 2){
        val piramidTerbalik = TerballikPiramida()
        piramidTerbalik.draw(7)
    }
    else if (input == 3){
        val layangLayang = LayangLayang()
        layangLayang.draw(15)
    }
    else if (input == 4){
        val bintangCross = BintangCross()
        bintangCross.draw(15)
    }
    else if (input == 5){
        val segitiga = PiramidaHollow()
        segitiga.draw(6)
    }
}
