package Zad1

class Dice {
    private val dice = listOf(Die(),Die(),Die(),Die(),Die(),Die())
    var numberOfRolls = 0

    fun roll(){
        if(numberOfRolls < 3){
            dice.forEach(){
                it.roll()
            }
        }
        numberOfRolls++
    }

    fun lockDie(index: Int){
        dice[index].isLocked = true
    }

    fun unlockDice(){
        dice.forEach(){
            it.isLocked = false
        }
    }

    fun printDiceValue(){
        dice.forEachIndexed() { index, die ->  println("${index+1}. ${die.value}" ) }
    }

    fun printResult(){
        when {
            isPoker() -> {
                println("\nYou have poker!")
            }
            isStraight() -> {
                println("\nYou have straight!")
            }
            isFull() -> {
                println("\nYou have full!")
            }

            else -> println("\nNothing. Try again?")
        }
    }

    private fun isPoker(): Boolean{
        val dice = IntArray(6) { 0 }
        val diceValues = getDiceValue()

        var valueOfPoker = 0

        diceValues.forEach {
            dice[it - 1]++
        }
        for(index in dice.indices){
            if (dice[index] >= 4) {
                valueOfPoker = (index + 1) * 4
                valueOfPoker += 40
            }
        }
        return valueOfPoker > 40
    }

    private fun isFull(): Boolean{
        val dice = IntArray(6){0}
        val diceValues = getDiceValue()

        var valueOfTriples = 0
        var valueOfDoubles = 0
        var flag3 = false
        var flag2 = false

        diceValues.forEach {
            dice[it - 1]++
        }
        for(index in dice.indices){
            if(dice[index] >= 3 && !flag3){
                flag3 = true
                valueOfTriples = (index + 1) * 3
            } else if(dice[index] >= 3 && flag3 && valueOfTriples / 3 < (index + 1)){
                valueOfDoubles = valueOfTriples / 3 * 2
                flag2 = true
                valueOfTriples = (index + 1) * 3
            } else if(dice[index] >= 2 && !flag2 ){
                flag2 = true
                valueOfDoubles = (index + 1) * 2
            } else if(dice[index] >= 2 && flag2 && valueOfDoubles / 2 < (index + 1)){
                valueOfDoubles = (index + 1) * 2
            }
        }

        return if(flag2 && flag3)
            valueOfDoubles + valueOfTriples + 30 >= 37
        else false
    }

    private fun isStraight(): Boolean{
        val dice = IntArray(6) { 0 }
        val diceValues = getDiceValue()
        diceValues.forEach {
            dice[it - 1]++
        }

        return if(dice[1] >= 1 && dice[2] >= 1 && dice[3] >= 1 && dice[4] >= 1 && dice[5] >= 1){
            true
        }  else dice[0] >= 1 && dice[1] >= 1 && dice[2] >= 1 && dice[3] >= 1 && dice[4] >= 1
    }

    private fun getDiceValue(): IntArray{
        val diceValues = IntArray(6)
        for(index in diceValues.indices){
            diceValues[index] = this.dice[index].value
        }
        return diceValues
    }
}