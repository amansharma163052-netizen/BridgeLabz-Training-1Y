package com.gla.Strings.level3;

import java.util.Scanner;

class DeckOfCards{

    public static String[] initializeDeck(String[] suits, String[] ranks){

        int numOfCards = suits.length*ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (int i = 0; i < suits.length; i++){
            for (int j = 0; j < ranks.length; j++){
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck){

        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {

        int totalCardsNeeded = players * cardsPerPlayer;

        if (totalCardsNeeded > deck.length) {
            System.out.println("Not enough cards to distribute");
            return null;
        }

        String[][] playerCards = new String[players][cardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }
        return playerCards;
    }

    public static void printPlayers(String[][] players) {

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " cards");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};

        String[] deck = initializeDeck(suits, ranks);
        shuffleDeck(deck);

        System.out.print("Enter number of players");
        int players = sc.nextInt();

        System.out.print("Enter number of cards per player");
        int cardsPerPlayer = sc.nextInt();

        String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);

        if (distributedCards != null) {
            printPlayers(distributedCards);
        }
    }
}