fun main(){
    //Basic Input, !!(makes sure no null value is returned)
    println("**********Welcome to A new World*********")
    println("Enter Your Name:")
    var name = readLine()!!.toString()
    println("Enter age:")
    var age = readLine()!!.toInt()
    println("Enter Nationality:")
    var country = readLine()!!.toString()
    println("You are $name,of age $age and from $country.Thankyou for signing up")

    //if null value is needed,one can do this,? allows null value
    var newname:String?
    newname=null
    println(newname)
}
main()