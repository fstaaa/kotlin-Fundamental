fun main(){
    val name = "kotlin"
    val age =  4
    val version = "1.3.70"

    val text ="""
        Nama saya $name 
        Saya berusia $age tahun
        saat ini saya sudah mencapai versi $version
    """.trimIndent()

    print(text)
}