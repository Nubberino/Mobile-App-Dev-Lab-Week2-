import java.util.*


//------------------------------------De fsirt----------------------------------
//fun main(args: Array<String>)
//{
//    println("Yo ${args[0]}")
//}

fun main()
{
    val decorations = listOf("aocke", "bagoda", "clastic plant", "dlligator", "elowerpot ")
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

//------------------------------------Numero Dos----------------------------------
//    TargetInt()
//    TargetInt()
//    TargetInt()
//------------------------------------Numero Tres----------------------------------
//    swim()
//    swim("Sloe")
//    swim(speed = "zero")
//    feedTheFish()
    //------------------------------------FOUR!!!----------------------------------

    val eager = decorations.filter {it[0] == 'c'}
    println("eager: $eager")
    val filtered = decorations.asSequence().filter {it[0] == 'd'}
    println("filtered: $filtered")
    val newlist = filtered.toList()
    println("new list: $newlist")

    val lazyMap = decorations.asSequence().map()
    {
        println("access: $it")
        it
    }

    println("lazy: $lazyMap")
    println("---------")
    println("first: ${lazyMap.first()}")
    println("---------")
    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter {it[0] == 'b'}.map()
    {
        println("access: $it")
        it
    }
    println("---------")
    println("all: ${lazyMap2.toList()}")


    val mysports = listOf ("Basketball", "fishing", "running")
    val myplayers = listOf ("The Bronze Jade", "Earnest Hammerway", "Sonic guy")
    val mycities = listOf ("Lost Angles", "Chicanery", "Green Hills")
    val mylist = listOf (mysports, myplayers, mycities)

    println("----")
    println("Flat: ${mylist.flatten()}")
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



//------------------------------------Numero Tres----------------------------------


fun randomDay() : String{
    val week = arrayOf("Morndas","Tuesdas","Wednesdas","Thursdas","Fridas","Saturdas","Sundas")
    return week[Random().nextInt(week.size)]

}

fun fishfood(day : String) : String{
    return when (day)
    {
        "Mondas" -> "Flakes"
        "Wednesdas" -> "Rworms"
        "Thursdas" -> "Granules"
        "Fridas" -> "Mosquitos"
        "Sundas" -> "Mr Krabs"
        else -> "Nuh"
    }




}


fun feedTheFish()
{
    val day = randomDay()
    val food = fishfood(day)
    println("Todady is $day and the fish eats $food")
    println("Change the water: ${shouldchangewater(day)}")
}
fun swim(speed: String = "Fast")
{
    println("Swimming $speed")
}

fun shouldchangewater (day: String, temp: Int = 22, dirty: Int = 20) : Boolean
{
    return when{
        is2hot(temp) -> true
        is2dirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun is2hot(temp : Int) = temp > 30
fun is2dirty(dirty : Int) = dirty > 30
fun isSunday(day: String) = day == "Sundas"


