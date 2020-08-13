fun main(){
    val kkm = 80
    val now = 40
    val nilaiuh = now > kkm

    if (now >90) {
        print("A")
    }else if (now >80 && now<=90 ){
        print("B")
    }else if (now >70 && now<=80){
        print("C")
    }else if (now >60 && now<=70){
        print("D")
    }else {
        print("E")
    }
}