package Zad1

data class Die (var isLocked: Boolean = false){

    var value: Int = (1..6).random()
    private set


    fun roll(){
        if(!isLocked){
            value = (1..6).random()
        }
    }
}