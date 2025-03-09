import java.util.Scanner
import javax.swing.JFrame

//for 7
const val pi = 3.14

fun main() {



    //1) println and print
//    ("I'm print not println.")
//    println("Hello")
//    println("How are you.")




    //2)VARIABLES
//    var name:String = "Rene"
//    name = "tom"
//
//    var age:Int = 24
//
//    println("I'm $name,$age years old.")




    //3)DATA TYPES
//    var age:Int = 19
//    var l:Long = 1931123321L
//    var d:Double = 1.2
//    var f:Float = 2.232131F
//    var b:Boolean = true
//    var st:String = "some string"
//    var c:Char = 'A'




    //4)ANY
//    val num:Any = 10
//    val name:Any = "Rene"
//
//    println("My age is $num,and name is $name")




    //5)TYPE INFERENCE
//
//    var n = 19
//    var l = 1931123321L
//    var d = 1.2
//    var f = 2.232131F
//    var b = true
//    var s = "some string"
//    var c = 'A'



    //6)VAR VS VAL

//    var brand = "Nike"
//    brand = "Rolex"
//
//    //val is constant cant rewrite
//    val b2 = "Adidas"



    //7) CONST KEYWORD
//    val name = "Rene"
//    //name = ""
//
//    var i = 0
//    //i = 5



    //8)NULL SAFETY
//    var name = "Rene"
//    println(name.uppercase())
//
//    var brand:String? = "porno"
//    brand = null
//    println(brand)



    //9)STRING
//    val name = "Rene"
//    println(name)
//    println(name.uppercase())
//    println(name.lowercase())
//    println(name.length)
//    println(name.isEmpty())
//    println(name[2])




    //10)STRING TEMPLATE
//    val name = "Rene"
//    val age = 20
//    val msg = "Name:$name Age:$age"
//
//    println(msg)


    //11)MULTILINE STRINGS
//    val  email = """
//        Hello %s
//        how
//        are you
//    """.trimIndent()
//
//    println(email.format("Eney"))



    //12)STRING COMPARSION
//    val name1 = "Rene"
//    val name2 = "Eney"
//    val name3 = "Bob"
//
//    println(name1.equals(name3))




    //13)ARYTHMETIC OPERATIONS
//    val num1 = 10
//    val num2 = 20
//
//    println("* ${num1 * num2}")
//    println("/ ${num1 / num2}")
//    println("+ ${num1 + num2}")
//    println("- ${num1 - num2}")
//    println("% ${num1 % num2}")



    //14)AND OPERATORS
//    var num = 10
//    println(++num)
//    println(num)
//    println(--num)
//    println(num)




    //15)PLUSE OPERATOR
//    val sum = 10+10
//    val sumString = "10" + "10" //concatenation
//    println(sum)
//    println(sumString)



    //16)CONVER FROM ONE DATATYPE TO ANOTHER
//    val num = "10"
//    println(10 + num.toInt())
//    println(10.toString() + num)



    //17)BOOLEANS
//    val isAdult = false
//    val isMale = true
//
//    println(isAdult)
//    println(isMale)
//    val orderCompleted:Boolean? = null
//    println(orderCompleted)



    //18)NAMING BOOLEANS
//    val isAdult = false
//    val isMale = true
//
//    println(isAdult)
//    println(isMale)
//    val isOrderCompleted:Boolean? = null
//    println(isOrderCompleted)





    //19)LOGICAL OPERATORS
//    val isAdult = true
//    val isFemale = false
//    println(isAdult || isFemale)
//    println(isAdult && isFemale)
//    println(isAdult && !isFemale)




    //20)COMPARSION OPERATORS
//    val n1 = 10
//    val n2 = 20
//    println(n1 > n2)
//    println(n1 < n2)
//    println(n1 == n2)
//    println(n1 <= n2)
//    println(n1 >= n2)



    //21)IF ELSE STATEMANT

//    val n1 = 30
//    val n2 = 30
//
//    if(n1>n2)
//    {
//        println(n1)
//    }else if(n1<n2)
//    {
//        println(n2)
//    }else println("Equals")





    //22)IF EXPRESION
//    val n1 = 40
//    val n2 = 30
//
//    val res =  if(n1>= n2 || n1<= 30)
//    {
//        //println(":)")
//        ":)"
//    }else
//    {
//        //println(":(")
//        ":("
//    }
//
//    println(res)




    //23)IFS LIKE TERNANRY IN JAVA?
//    val n1 =10
//    val n2 = 30
//
//    val res = if(n1>n2) ":)" else ":("
//
//    val res2 =
//    if(n1>n2) ":)"
//    else if (n1 == 200) ":|"
//    else ":("
//
//    println(res)





    //24)WHEN EXPRESION
    //p1
//    val gender = "F"
//
//    val g = when(gender)
//    {
//        "F"-> "Female"
//        "M"-> "MALE"
//        else ->
//        {
//            "Unknown"
//        }
//    }
//
//    println(g)

    //p2
//    val n1 = 20
//    val n2 = 30
//
//    when
//    {
//        (n1 >= n2 || n1 <= 30) -> println(":)")
//        (n1 == 200) -> println("pff")
//        else ->
//        {
//            println(":(")
//        }
//
//    }

    //p3
//    val age = 20
//    when (age)
//    {
//        in 13..19 -> println("Teenager")
//        in 0..13 -> println("Jgvintli")
//        else -> println("BIG")
//    }



    //25)WHEN BOOLEAN IS NULL
//    val isAdult:Boolean? = null
//
//    if(isAdult == true)
//    {
//        println("not null")
//    }else println("false or null")





    //26)ARRAYS
    //val name:String = "Rene, Phoden"
//    val names = arrayOf<String>("Rene","James","John")
//    println(names[2])
//    names[0] = "Pro chi"
//    println(names.size)
//    println(names.contentToString())
//
//    var i = 0
//    while(i<names.size)
//    {
//        println(names[i])
//        ++i
//    }
//
//    if("Pro chi" in names)
//    {
//        println("Yes")
//    }else println("No")
//
//    if(names[1].equals("James"))
//    {
//        println("of course")
//    }else println("Hell na")


//
//    val arrayOfNull = arrayOfNulls<String>(5)
//    arrayOfNull.fill("*")
//    arrayOfNull[0] = "Ren"
//    println(arrayOfNull.contentToString())



    //27)LIST
//    val names:List<String> = listOf("Rene","James","John")
//    println(names)
//    println(names[1])



    //28)MUTABLE LIST
//    val names = mutableListOf<String>("Rene","James","John")
//    names.add("George")
//    println(names)



    //29)DESTRUCTURING
//    val names = listOf("Rene","James","John")
//
//    val(one,_,three) = names
//    println("$one $three")



    //30)FOR LOOP
//    val names = listOf("rene","john","pill")
//    val numbers = intArrayOf(1,2,3,4,5)
//
//    for(i in names)
//    {
//        val f = i.replaceFirstChar {
//            it.uppercase()
//        }
//        println(f)
//    }
//
//    for(i in numbers) println(i)



   //31)INDICES-index
//
//    val letters = charArrayOf('A','B','C','D','E')
//    for (i in letters.indices)
//    {
//        println("$i - ${letters[i]}")
//    }
//
//    for (i in letters.indices.reversed())
//    {
//        println("$i - ${letters[i]}")
//    }



    //32)RANGE DOWN TO AND STEP

//    val numbers = arrayOf<Int>(1,2,3,4,5)
//
//    for (i in 1..numbers.size) println(i)
//    for (i in numbers.size downTo 1) println(i)
//    for(i in 1 .. numbers.size step 3) println(i)
//    for(i in numbers.size downTo 1) println(i)



    //33)LOOP THROUGH STRING
//
//    val brand = "Adidas"
//    for(l in brand)
//    {
//        println(l)
//    }


    //34)FOREACH
//
//    val names = listOf("Rene","John","Mike","Thom")
//
//    names.forEach{
//        println(it)
//    }




    //35)WHILE LOOP
//    var number = 1;
//
//    while( number <= 5 )
//    {
//        println(number)
//        ++number
//    }
//
//    var brand = "Adidas"
//    var i = brand.length-1
//
//    while(i >= 0 )
//    {
//        println(brand[i])
//        --i
//    }




    //36)DO WHILE
//    do{
//        println("hi")
//    }while (false)



    //37)BREAK AND COUNTIONE
//
//    val nums = intArrayOf(1,2,3,4,5,6,7,8)
//
//    for (n in nums)
//    {
//        if(n % 2 != 0) continue //skips
//        if(n > 6) break
//        println(n)
//    }



    //38)FUNCTION
//    sayHello()



    //39)PARAMETERS AND ARGUMENTS
//    greet("Rene",24)




    //40)NAMED ARGUMENTS
//    greet(age=24, name = "Rene")



    //41)DEFAULT ARGUMENTS
//    nameAndAge("Rene")
//    nameAndAge(age = 12)
//    nameAndAge("Rene",25)




    //42)FUNCTIONS AS ARGUMENTS
//
//    foo (bar = {
//        println("Boom Boom")
//    })
//
//    foo {
//        println("Bar as function 2 ")
//    }
//
//    foo()



    //43)RETURN VALUE FROM FUN
//    println(sqr(5))




    //44)SINGLE EXPRESSION FUNCTIONS
    








}

fun sqr(num:Int):Int
{
    return num*num
}



fun foo(name:String = "",bar: () -> Unit = {})
{
    println("Bar function")
    bar()
}




fun nameAndAge(name:String = "",age:Int = -1)
{
    if(age == -1)
    {
        println("Age is not provided.")
        return
    }
    if (name == "")
    {
        println("Name is not provided")
        return
    }
    else println("Hello $name,You are $age years old.")
}



fun greet(name:String,age:Int)
{
    println("Hello my name is $name,Im $age years old.")
}



fun sayHello():Unit
{
    println("hello")
}







