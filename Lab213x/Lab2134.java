package edu.testenum2;

public class Main {
    public static void main(String[] args) {
        Card[] deck = new Card[52];

        for (int i = 0; i < deck.length; i++) {
            deck[i]= new Card(
                    Suit.SPADE,
                    Rank.ACE);
        }
        }
    }
    enum Suit{
        SPADE,
        DIAMOND,
        CLUB,
        HEART;
        Suit next(){
            return Suit.values()[this.ordinal()+1];
        }
    }

    enum Rank{
        ACE,        TWO,        THREE,
        FOUR,        FIVE,        SIX,
        SEVEN,        EIGHT,        NINE,
        TEN,        JACK,        QUEEN,
        KING;
        
        Rank next(){
            return Rank.values()[this.ordinal()+1];
        }
    }

    class Card{
        private Suit cardSuit;
        private Rank cardRank;

        public Card(Suit cardSuit, Rank cardRank) {
            this.cardSuit = cardSuit;
            this.cardRank = cardRank;
        }

        @Override
        public String toString(){
            return String.format("The %s of %s",cardRank.name(),cardSuit.name());
        }
    }
}
