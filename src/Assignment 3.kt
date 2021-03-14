fun main(){
    institutionName()
    details("Irene" , 20)
    school("akiraChix")
    println(school(name = "akiraChix"))
    confirmation(message1 = "Irene Nyatichi")
}
fun institutionName(){
val text = "akirachix"
    print(text [0])
    print(text [2])
    println(text [3])
}

fun details(x:String , y:Int){
    println("Hi, my name is $x and I am $y years old.")
}

fun school(name:String):Int{
    var name="akiraChix"
    return(name.length)
}
fun confirmation(message1: String){
    message1 =="Irene Nyatichi"
    if (message1 =="Irene Nyatichi"){
        println("That's me!")
    }
    else{
        println("I don't know who that is")
    }
}