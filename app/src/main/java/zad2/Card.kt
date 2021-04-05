package zad2

class Card(var color: Color, var value: Value) {

    fun getValueOfCard(): Int{
        return when(value){
            Value.TWO -> 2
            Value.THREE -> 3
            Value.FOUR -> 4
            Value.FIVE -> 5
            Value.SIX -> 6
            Value.SEVEN -> 7
            Value.EIGHT -> 8
            Value.NINE -> 9
            Value.TEN -> 10
            Value.JACK -> 10
            Value.QUEEN -> 10
            Value.KING -> 10
            Value.ACE -> 11
        }
    }

    override fun toString(): String {
        return "$value of $color"
    }
}