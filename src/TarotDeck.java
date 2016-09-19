import java.util.ArrayList;
import java.util.Random;

public class TarotDeck {
	String[] suits = {"Swords", "Cups", "Wands", "Coins"};
	String[] values = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	String[] trumps = {"I: The Magician", "II: The High Priestess", "III: The Empress", "IV: The Emperor", "V: The Heirophant", "VI: The Lovers",
			"VII: The Chariot", "VIII: Strength", "IX: The Hermit", "X: Wheel of Fortune", "XI: Justice", "XII: The Hanged Man", "XIII: Death", "XIV: Temperance",
			"XV: The Devil", "XVI: The Tower", "XVII: The Star", "XVIII: The Moon", "XIX: The Sun", "XX: Judgement", "XXI: The World", "The Fool"};
	ArrayList<String> tarotDeck = new ArrayList<String>();
	Random rand = new Random();
	
	public TarotDeck(){
		generateDeck();
	}
	
	public void generateDeck(){
		for(String suit: suits){
			for(String value: values){
				tarotDeck.add("The " + value + " of " + suit );
			}
		}
		for(String card: trumps){
			tarotDeck.add(card);
		}
	}

	public String drawCard(){
		String card = "";
		if(tarotDeck.size()>0){
			int choice = rand.nextInt(tarotDeck.size());
			card = tarotDeck.get(choice);
			tarotDeck.remove(choice);
		}
		else{
			card = "This card doesn't actually exist O.o";
		}
		return card;
	}
}
