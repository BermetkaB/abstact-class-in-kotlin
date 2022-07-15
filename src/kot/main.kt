package kot

fun main() {

    val listOfNumbers= mutableListOf<Int>()
    for (i in 0..99){
        listOfNumbers.add(i)
    }
    val listOfEvenNumbers:List<Int> =listOfNumbers.filter { it %2==0 }
    for (i in listOfEvenNumbers)
        println(i)
    //val calc=Calc()
   // println(Calc.square(5))
  //  println(Calc.lengthOfCircle(1.2F))
}