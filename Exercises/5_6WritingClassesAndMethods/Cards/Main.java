import java.util.Random;
import java.util.ArrayList;

class Card{
    
   private String [] Suits = {"Hearts", "Diamond","Clubs", "Spades"}; 
   private String [] Ranks = {"Ace", "1","2","3","4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
   
   Random rand = new Random();
   ArrayList<String> Cards_Drawn = new ArrayList<>();// list to store drawn cards

   String getSuits(){
    int Suits_len = Suits.length; //extracting length from Suits
    int rand_1 = rand.nextInt(Suits_len); //generating num from suits lenght
    String Suit_drawn =Suits[rand_1]; // fetching data from Suits list based on rand_1 value
    return Suit_drawn;
   }
   //above process but more optimal
   String getRanks(){
    int rand_2 = rand.nextInt(Ranks.length);
    return Ranks[rand_2];
   }
   //method to avoid duplicate cards
   String dups_Check(){
   
    for (int i = 0; i < 5; i++) {
        String Card;
        do {
            Card = getRanks()+" of "+ getSuits();//generates card
        } while (Cards_Drawn.contains(Card));//regenerates card if alrady exist
        Cards_Drawn.add(Card);//adding the card to the list
        System.out.println(Card);
    }
    return "\n"+"|===| 5 Random Cards Drawn |===|"+"\n";
   }
}

public class Main {
    public static void main(String[] args) {
        Card card = new Card();
        System.out.println(card.dups_Check());
    }
}
