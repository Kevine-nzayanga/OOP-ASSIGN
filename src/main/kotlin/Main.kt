fun main() {
  var body= Human("Karen",23,52)
body.eat(3)
println( body.weight)
body.speak("Hello")
    body.birthday()


 var details= User("Madra","Jameson","madrajameson@gmail.com","076464623","madra002")
println(details.email)
    println(details.password)
}
class Human(var name:String, var age:Int ,var weight:Int){
    fun eat(foodWeight:Int){
        weight +=foodWeight
      println("I am eating $foodWeight kgs of food ")
    }

fun speak(speech:String){
    println(speech)
}
   fun birthday(){
       age++
       println(age)
   }
}
data class User (var firstname:String, var lastname:String, var email:String, var phonenumber:String, var password:String){



}