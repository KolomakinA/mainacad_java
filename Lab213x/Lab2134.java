package edu.testenum2;

public class Main {
    public static void main(String[] args) {
        Card[] deck = new Card[52];
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck[i] = new Card(suit,rank);
                System.out.println(deck[i]);
                i++;
                }
            }
        }
    }
    enum Suit{
        SPADE,
        DIAMOND,
        CLUB,
        HEART
    }

    enum Rank{
        ACE,        TWO,        THREE,
        FOUR,        FIVE,        SIX,
        SEVEN,        EIGHT,        NINE,
        TEN,        JACK,        QUEEN,
        KING
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

