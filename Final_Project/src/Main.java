import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static ArrayList<Integer> randomizedList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 52; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		return list;
	}
	
	public static void main(String[] args) 
	{
		// Deck of 52 Cards with color and face values:
		String colors[] = {"Spades", "Hearts", "Clubs", "Diamonds"};
		String values[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		Cards cards[] = new Cards[colors.length * values.length];
//		System.out.println(cards.length);
		int j = 0;
		for (int i = 0; i < colors.length; i++) {
			for (int k = 0; k < values.length; k++) {
				cards[j] = new Cards(colors[i], values[k]);
				j++;
			}
		}
		ArrayList<Cards> PlayerOne = new ArrayList<Cards>();
		ArrayList<Cards> PlayerTwo = new ArrayList<Cards>();
		
		// Randomnly dividing into 2 equal parts(26/26), among both players:
		ArrayList<Integer> random = randomizedList(); 
		for (int i = 0; i < random.size(); i++) {
			if (i < 26) 
				PlayerOne.add(cards[random.get(i)]);
			else 
				PlayerTwo.add(cards[random.get(i)]);
		}
		
		ArrayList<Cards> tableDeck = new ArrayList<Cards>();
//		System.out.println(tableDeck.size());
		
		boolean firstTurn = true;
		boolean isPlaying = true;
		while(isPlaying) 
		{
			// top most card is at the end of the list
			Cards playerOneCard = PlayerOne.get(PlayerOne.size() - 1);
			PlayerOne.remove(PlayerOne.size() - 1);
			System.out.println("\nCard by Player One: " + playerOneCard);
			System.out.println("SIZE OF TABLE DECK: " + tableDeck.size() + "\nSIZE OF PLAYER ONE DECK: " + PlayerOne.size() + "\nSIZE OF PLAYER TWO DECK: " + PlayerTwo.size());
			tableDeck.add(playerOneCard);
			if (!firstTurn) // this is so have one card from both players, on the table deck
			{
				// If the Face Value of card placed by player is same as 
				// the top card of table deck then that player takes table deck, 
				// add it in its deck and shuffle it.
				if (playerOneCard.getFaceValue() == (tableDeck.get(tableDeck.size() - 2).getFaceValue())) 
				{
					for (int a = 0; a < tableDeck.size(); a++) 
					{
						PlayerOne.add(tableDeck.get(a));
						tableDeck.remove(a);
					}
					Collections.shuffle(PlayerOne);
					Collections.shuffle(PlayerTwo);
					// Player who get table’s deck throws another card at the end of his/her turn.
					tableDeck.add(PlayerOne.get(PlayerOne.size() - 1));
					PlayerOne.remove(PlayerOne.size() - 1);
				}
			}
			
			Cards playerTwoCard = PlayerTwo.get(PlayerTwo.size() - 1);
			PlayerTwo.remove(PlayerTwo.size() - 1);
			System.out.println("\nCard by Player Two: " + playerTwoCard);
			System.out.println("SIZE OF TABLE DECK: " + tableDeck.size() + "\nSIZE OF PLAYER ONE DECK: " + PlayerOne.size() + "\nSIZE OF PLAYER TWO DECK: " + PlayerTwo.size());
			tableDeck.add(playerTwoCard);
			if (playerTwoCard.getFaceValue() == (tableDeck.get(tableDeck.size() - 2).getFaceValue())) 
			{
				for (int a = 0; a < tableDeck.size() - 1; a++) 
				{
					PlayerTwo.add(tableDeck.get(a));
					tableDeck.remove(a);
				}
				Collections.shuffle(PlayerOne);
				Collections.shuffle(PlayerTwo);
				// Player who get table’s deck throws another card at the end of his/her turn.
				tableDeck.add(PlayerTwo.get(PlayerTwo.size() - 1));
				PlayerTwo.remove(PlayerTwo.size() - 1);
			}
			if (PlayerOne.size() == 0) 
			{
				System.out.println("\n******************************************");
				System.out.println("******************************************");
				System.out.println("PLAYER TWO HAS WON :) \nPLAYER ONE HAS LOST ;(");
				isPlaying = false;
			}
			else if (PlayerTwo.size() == 0)
			{
				System.out.println("\n******************************************");
				System.out.println("******************************************");
				System.out.println("\nPLAYER ONE HAS WON :) \nPLAYER TWO HAS LOST ;(");
				isPlaying = false;
			}
			firstTurn = false;
		}
		
	}

}
