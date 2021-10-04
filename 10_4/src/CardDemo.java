import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-10-04
 * Time: 18:59
 */

class Card{
    public String suit;
    public int rank;

    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank=" + rank +
                '}';
    }
}
public class CardDemo {
    public static final String[] suits = {"♣","♠","♥","♦"};
    public static List<Card> buyCard() {
        List<Card> cards = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 4; j++) {
                String suit = suits[j];
                Card card = new Card(suit,i);
                cards.add(card);

            }
        }
        return cards;
    }

    public static void swap(List<Card> cardList,int x,int y){
        Card tmp = cardList.get(x);
        cardList.set(x, cardList.get(y));
        cardList.set(y,tmp);
    }

    public static void shuffle(List<Card> cardList){
        int size = cardList.size();
        for(int i = size - 1;i>0;i--){
            Random random = new Random();
            int ranNum = random.nextInt(i);
            swap(cardList,i,ranNum);
        }
    }
    public static void main(String[] args){
        List<Card> cardList = buyCard();
        //System.out.println(cardList);

        shuffle(cardList);
        //System.out.println(cardList);

        //System.out.println("===============");
        List<Card> hand1 = new ArrayList<>();
        List<Card> hand2 = new ArrayList<>();
        List<Card> hand3 = new ArrayList<>();

        List<List<Card>> hand = new ArrayList<>();
        hand.add(hand1);
        hand.add(hand2);
        hand.add(hand3);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                Card card = cardList.remove(0);//得到
                hand.get(j).add(card);//放进每个人手里
            }
        }

        //System.out.println("第一个人"+hand1);
        System.out.println("第一个人"+hand.get(0));

    }


}
