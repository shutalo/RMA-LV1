package Zad1

fun main(){
    val dice = Dice()

    while (dice.numberOfRolls < 3){
        println("\n0: roll the dice\n1: Lock die")

        var input = readLine()
        var value: Int
        /**
         * Checking if user has pressed enter
         */
        if(input == ""){
            println("\nChoose option!")
            continue
        } else{
            value = input?.toInt()!!
        }

        if(value == 0){
            dice.roll()
            println("\n${3 - dice.numberOfRolls} guesses left!")
            dice.printDiceValue()
            dice.printResult()
        } else {
            /**
             * Checking if user has rolled the dice initially
             */
            if(value == 1 && dice.numberOfRolls == 0){
                println("\nRoll the dice first!")
                continue
            }

            /**
             * Checking if user has pressed enter
             */
            println("\nWhich die do you want to lock?")
            input = readLine()
            if(input == ""){
                println("\nChoose option!")
                continue
            } else{
                value = input?.toInt()!!
            }

            dice.lockDie(value - 1)
        }

        if(dice.numberOfRolls == 3){
            dice.numberOfRolls = 0
            dice.unlockDice()
            println("0 guesses left! Try again?")
        }

    }
}