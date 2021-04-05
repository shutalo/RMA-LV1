package zad2

class Deck {

    private val deck = mutableListOf<Card>().apply {
        add(Card(Color.DIAMONDS,Value.TWO))
        add(Card(Color.DIAMONDS,Value.THREE))
        add(Card(Color.DIAMONDS,Value.FOUR))
        add(Card(Color.DIAMONDS,Value.FIVE))
        add(Card(Color.DIAMONDS,Value.SIX))
        add(Card(Color.DIAMONDS,Value.SEVEN))
        add(Card(Color.DIAMONDS,Value.EIGHT))
        add(Card(Color.DIAMONDS,Value.NINE))
        add(Card(Color.DIAMONDS,Value.TEN))
        add(Card(Color.DIAMONDS,Value.JACK))
        add(Card(Color.DIAMONDS,Value.QUEEN))
        add(Card(Color.DIAMONDS,Value.KING))
        add(Card(Color.DIAMONDS,Value.ACE))

        add(Card(Color.HEARTHS,Value.TWO))
        add(Card(Color.HEARTHS,Value.THREE))
        add(Card(Color.HEARTHS,Value.FOUR))
        add(Card(Color.HEARTHS,Value.FIVE))
        add(Card(Color.HEARTHS,Value.SIX))
        add(Card(Color.HEARTHS,Value.SEVEN))
        add(Card(Color.HEARTHS,Value.EIGHT))
        add(Card(Color.HEARTHS,Value.NINE))
        add(Card(Color.HEARTHS,Value.TEN))
        add(Card(Color.HEARTHS,Value.JACK))
        add(Card(Color.HEARTHS,Value.QUEEN))
        add(Card(Color.HEARTHS,Value.KING))
        add(Card(Color.HEARTHS,Value.ACE))

        add(Card(Color.CLUBS,Value.TWO))
        add(Card(Color.CLUBS,Value.THREE))
        add(Card(Color.CLUBS,Value.FOUR))
        add(Card(Color.CLUBS,Value.FIVE))
        add(Card(Color.CLUBS,Value.SIX))
        add(Card(Color.CLUBS,Value.SEVEN))
        add(Card(Color.CLUBS,Value.EIGHT))
        add(Card(Color.CLUBS,Value.NINE))
        add(Card(Color.CLUBS,Value.TEN))
        add(Card(Color.CLUBS,Value.JACK))
        add(Card(Color.CLUBS,Value.QUEEN))
        add(Card(Color.CLUBS,Value.KING))
        add(Card(Color.CLUBS,Value.ACE))

        add(Card(Color.SPADES,Value.TWO))
        add(Card(Color.SPADES,Value.THREE))
        add(Card(Color.SPADES,Value.FOUR))
        add(Card(Color.SPADES,Value.FIVE))
        add(Card(Color.SPADES,Value.SIX))
        add(Card(Color.SPADES,Value.SEVEN))
        add(Card(Color.SPADES,Value.EIGHT))
        add(Card(Color.SPADES,Value.NINE))
        add(Card(Color.SPADES,Value.TEN))
        add(Card(Color.SPADES,Value.JACK))
        add(Card(Color.SPADES,Value.QUEEN))
        add(Card(Color.SPADES,Value.KING))
        add(Card(Color.SPADES,Value.ACE))
    }

    fun remove(card:Card){
        deck.remove(card)
    }

    fun getRandomCard(): Card{
        return deck.random()
    }
}