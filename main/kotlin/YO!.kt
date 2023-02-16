import java.util.*



//fun main(args: Array<String>)
//{
//    println("Yo ${args[0]}")
//}

fun main()
{
//    val isUnity = println("Joewari Da")
//    val isUnit = "Joewari Da"
//    println(isUnit)
//
//    val temp = 21
//    val SuperHot = if (temp < 50) true else false
//    println(SuperHot)
//
//    val Message = "The temp is ${if (temp < 50) "aight" else "Ay yo Chill"}"
//    println(Message)


    TargetInt()
    TargetInt()
    TargetInt()
}

fun randomLane(): String
{
    val loc = arrayOf("Top","Mid","Jgl","Bot")
    return loc[Random().nextInt(loc.size)]
}

fun IntTarget(lane : String) :String
{

   return when(lane)
    {
        "Top" -> "Top Laner"
        "Mid" -> "Mid Laner"
        "Jgl" -> "Jungler"
        "Bot" -> "ADC"
        else -> "NO!!!!!!"
    }
}

fun TargetInt()
{
    val len = randomLane()
    val fud = IntTarget(len)
    println("I will feed $len's $fud")
}

