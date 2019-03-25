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

    public boolean ChecarFlor() {
        boolean flor = false;
        if (this.HandArray[0].tipo == this.HandArray[1].tipo) {
            if (this.HandArray[0].tipo == this.HandArray[2].tipo) {
                flor = true;
            }
        }
        return flor;
    }

    public int CalcEnvido() {
        int Envido = 0;
        if (ChecarFlor() == false) {
            if (this.HandArray[0].tipo == this.HandArray[1].tipo) {
                Envido = 20 + this.HandArray[0].num + this.HandArray[1].num;
            } else if (this.HandArray[0].tipo == this.HandArray[2].tipo) {
                Envido = 20 + this.HandArray[0].num + this.HandArray[2].num;
            } else if (this.HandArray[1].tipo == this.HandArray[2].tipo) {
                Envido = 20 + this.HandArray[1].num + this.HandArray[2].num;
            } else {
                if (this.HandArray[0].num >= this.HandArray[1].num && this.HandArray[0].num >= this.HandArray[2].num) {
                    Envido = this.HandArray[0].num;
                } else if (this.HandArray[1].num >= this.HandArray[0].num && this.HandArray[1].num >= this.HandArray[2].num) {
                    Envido = this.HandArray[1].num;
                } else if (this.HandArray[2].num >= this.HandArray[0].num && this.HandArray[2].num >= this.HandArray[1].num) {
                    Envido = this.HandArray[2].num;
                }
            }
        }
        return Envido;

    }
}
