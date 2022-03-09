fun main(){
    namesOfgirls("hussein","mellany","sofia","esther")

    city()
    Nums()
    rafi()


    }


fun namesOfgirls(name1:String,name2:String,name3:String,name4:String){
    var namesOfgirls= arrayOf(name1,name2,name3,name4)
    println(namesOfgirls.contentToString())



    }

    fun city() {
        var city= arrayOf("harare","mumbai","dodoma","jarkata")
        city.forEach() {city->
            println(city.capitalize())
        }
    }

fun Nums(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
  var sum= numbers[1].plus(numbers[4])
    println(sum)

    var index=numbers.indexOf(158)
    println(index)

    var sortedNum= numbers.sortedArray()
    println(sortedNum.contentToString())


}
fun rafi(){
    var rafiki = arrayOf("caro","esther","mercy")
    println(rafiki)
    return
}

























