
public class Main {
	public static void main(String[] args){
		TarotDeck deck = new TarotDeck();
		FortuneTeller teller = new FortuneTeller();
		FortuneTeller teller2 = new FortuneTeller(deck);
		
		//first let's generate a full reading
		teller.generateFullReading();
		System.out.println(teller.getReading());
		
		//let's draw a new hand, and ask for 9 cards, when there are only 8
		teller.drawHand();
		for(int i=0; i < 9; i++){
			System.out.println(teller.readCard());
		}
		System.out.println("");
		
		//for the teller we gave a deck let's generate a few readings drawing a new hand every time.
		teller2.generateFullReading();
		System.out.println(teller2.getReading());
		
		teller2.drawHand();
		teller2.generateFullReading();
		System.out.println(teller2.getReading());

		teller2.drawHand();
		teller2.generateFullReading();
		System.out.println(teller2.getReading());

		teller2.drawHand();
		teller2.generateFullReading();
		System.out.println(teller2.getReading());
		
		//now let's draw a few of our own cards and have teller read them
		System.out.println(teller.readCard(deck.drawCard()));
		System.out.println(teller.readCard(deck.drawCard()));
		System.out.println(teller.readCard(deck.drawCard()));
		System.out.println(teller.readCard(deck.drawCard()));
	}
}
