fun main(args: Array<String>) {
    first("abcdrf",50)
}

/**
 * Answer of first question
 */
private fun first( str:String,count :Int) : Int {

    var countOfRepeatA = 0
    if (count<=0 || str.isEmpty()){
        println("Invalid Value")
    return countOfRepeatA
    }

    var newString = ""
    while (newString.length <= count){
        newString+=str
    }
    newString= newString.subSequence(0,count).toString()
    newString.forEach {
        if (it == 'a'){
            countOfRepeatA++
        }
    }
    println("newStringSize=$newString size=${newString.length} \n countOfRepeat=$countOfRepeatA")

    return countOfRepeatA

}