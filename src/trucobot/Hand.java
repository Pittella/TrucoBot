package trucobot;

public class Hand {

    public Card[] HandArray = new Card[3];
    public Card CartaVazia = new Card(-1, -1, -1, "Vazia");

    public void SetCards(Card x, Card y, Card z) {
        this.HandArray[0] = x;
        this.HandArray[1] = y;
        this.HandArray[2] = z;
    }

    public void PrintHand() {
        for (int i = 0; i < 3; i++) {
            if (HandArray[i] != CartaVazia) {
                System.out.printf("Carta %s (%d)\n", HandArray[i].Nome, i);
            }
        }
    }

    public void RemoveCard(int i) {
        this.HandArray[i] = CartaVazia;
    }

}
