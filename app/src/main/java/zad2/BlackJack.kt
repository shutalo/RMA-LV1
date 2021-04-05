package zad2

private var deck: Deck = Deck()
private var player: Player = Player()
private var dealer: Player = Player()
private lateinit var card: Card

fun main(){

    startGame()

    while (true){

        println("\nDo you want to hit or stand?")
        println("\n0: hit \n1: stand")
        var input = readLine()?.toInt()

        if(input == 0){
            playerDraws()
            showCards()
            if(player.getHandValue() > 21){
                println("\nYou lost! Value of your hand is ${player.getHandValue()}")
                restart()
                input = -1
            } else if(player.getHandValue() == 21){
                println("\nYou won! Value of your hand is 21")
                restart()
                input = -1
            } else {
                println("\nValue of your hand is: ${player.getHandValue()}")
                input = -1
            }
        } else if(input == 1){
            if(player.getHandValue() >= dealer.getHandValue() && dealer.getHandValue() < 17 ){
                dealerDraws()
                if(dealer.getHandValue() > 21) {
                    println("\nYou won! Dealer's value is ${dealer.getHandValue()}")
                    restart()
                } else
                    showCards()
                println("Dealer drew!")
                input = -1
            } else if(player.getHandValue() >= dealer.getHandValue() && dealer.getHandValue() <= 21){
                println("\nYou won! Value of your hand is ${player.getHandValue()} while dealers is ${dealer.getHandValue()}")
                restart()
                input = -1
            } else if(player.getHandValue() < dealer.getHandValue()){
                println("\nYou lost! Value of your hand is ${player.getHandValue()} while dealers is ${dealer.getHandValue()}")
                restart()
                input = -1
            }
        }
    }
}

fun startGame(){
    playerDraws()
    dealerDraws()
    playerDraws()
    dealerDraws()

    if(player.getHandValue() == 21){
        println("\nYou won!")
        restart()
        startGame()
    }

    showCards()
}

fun restart(){
    player = Player()
    dealer = Player()
    deck = Deck()

    startGame()
}

fun dealerDraws(){
    card = deck.getRandomCard()
    dealer.draw(card)
    deck.remove(card)
}

fun playerDraws(){
    card = deck.getRandomCard()
    player.draw(card)
    deck.remove(card)
}

fun showCards(){
    println("\nValue of your hand is: ${player.getHandValue()}")
    player.showCardsInHand()

    println("\nValue of dealers hand is: ${dealer.getHandValue()}")
    dealer.showCardsInHand()
}