fun main(){
    val likePluralForms: Array<String> = arrayOf("лайк", "лайка", "лайков")
    //3
    var likeCount = 3
    var outText = num2PluralText(likeCount, likePluralForms)
    println("$likeCount $outText")
    //5
    likeCount = 5
    outText = num2PluralText(likeCount, likePluralForms)
    println("$likeCount $outText")
    //21
    likeCount = 21
    outText = num2PluralText(likeCount, likePluralForms)
    println("$likeCount $outText")
}

fun num2PluralText(num: Int, formsArray: Array<String>): String {
    var number: Int = num % 100
    number = if (number <= 19) number else number % 10
    return when (number) {
        1 -> formsArray[0]
        2, 3, 4 -> formsArray[1]
        else -> formsArray[2]
    }
}