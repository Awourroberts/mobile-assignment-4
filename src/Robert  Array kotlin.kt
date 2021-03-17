import java.util.*

fun main() {
var x=months("sophy","mercy","daisy","bread")
    println(Arrays.toString(x))
    levels()
    numbers()
    var name=students("Beth", "kisumu", "brown")
    println(name)
}
fun months(name1:String,name2:String,name3:String,name4: String):Array<String>{
    var x= arrayOf(name1,name2, name3,name4)
    return x
}
fun levels(){
    var cities=arrayOf("harare","mumbai","dodoma","jakarta")
    println(cities[0].capitalize()+","+cities[1].capitalize()+","+cities[2].capitalize()+","+cities[3])
}
fun numbers(){
 var numbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
 var total=numbers.component2()+numbers.component5()
    println(total)

    var index=numbers.indexOf(158)
    println(index)

    var int=numbers.sortedArray()
    for (element in int){
      println(element)}
    }

    fun students(name:String,town:String,colour:String):String{
        var String=arrayOf(name,town,colour)
        return(Arrays.toString(String))
    }


