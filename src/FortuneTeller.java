import java.util.ArrayList;

public class FortuneTeller {
	private ArrayList<String> hand = new ArrayList<String>();
	private String reading;
	private TarotDeck deck;
	
	public FortuneTeller(){
		setReading("");
		deck = new TarotDeck();
		drawHand();
	}
	
	public FortuneTeller(TarotDeck newDeck){
		setReading("");
		deck = newDeck;
		drawHand();
	}
	
	public void drawHand(){
		hand.clear();
		for(int i = 0; i < 8; i ++){
			hand.add(deck.drawCard());
		}
	}
	
	public void generateFullReading(){
		//Here is the place holder for probably the most complicated method
		//you'd want to track what card is where but I'm just going to output the whole hand here
		reading = "";
		for(String card: hand){
			reading += card + "\n";
		}
	}

	public String readCard(){
		String output = "";
		//you'd parse each card here with a meaning
		//I'm just going to have it read each card to save time in this example
		
		if(hand.size() > 0){
			output = hand.get(0);
			hand.remove(0);
		}
		else{
			output = "I have no more cards.";
		}
		
		return output;
	}
	
	public String readCard(String card){
		String output = "";
		//here you could give the "fortune teller" a card and have them read your fortune card.
		//Again i'm just having it echo the card at this point to save time
		output = "Your card is " + card;
		
		return output;
	}
	
	public String getReading() {
		return reading;
	}

	public void setReading(String reading) {
		this.reading = reading;
	}
	
}
