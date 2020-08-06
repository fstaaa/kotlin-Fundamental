fun main(){
    val openhours = 75
    val now = 80
    val kata = "Nilai km"
    val school : String
    school = if (now <70){
        "silakan ikt remidila"
    } else if (now == openhours ){
        "tuntas"
    } else {
        "slamat ya!!"
    }
    print(kata+now+school)
}


