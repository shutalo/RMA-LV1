package zad2

open class Player {

    private val hand = mutableListOf<Card>()

    fun draw(card: Card){
        hand.add(card)
    }

    open fun getHandValue(): Int{
        var value: Int = 0

        hand.forEach(){
            if(it.getValueOfCard() == 11 && value + 11 > 21){
                value += 1
            }
            else
                value += it.getValueOfCard()
        }
        return value
    }

    fun showCardsInHand(){
        hand.forEach(){
            println("$it")
        }
    }
}