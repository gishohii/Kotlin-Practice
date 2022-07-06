fun main(){
    println("*******************************************")
    println("***********BASIC CALCULATOR****************")
    println("Enter First Value:")
    var v1= readLine()!!.toDouble()
    println("Enter Second Value:")
    var v2= readLine()!!.toDouble()
    println("Choose Function:\n1.+(add)\t2.-(subtract)\t3.*(multiply)\t4./(Divide)")
    var function =readLine()!!.toString()
    when(function){
        "1" -> print("sum of $v1 and $v2 is:" + (v1+v2) )
        "2" -> print("Difference of $v1 and $v2 is:" + (v1-v2))
        "3" -> print("Product of $v1 and $v2 is:" + (v1*v2))
        "4" -> print("Division of $v1 and $v2 is:" + (v1/v2))
        else ->println("Choose from options given")

    }
    //learn on exception handling
}
main()