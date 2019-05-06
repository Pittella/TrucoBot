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
        for (int i = 1; i < 4; i++) {
            if (HandArray[i-1] != CartaVazia) {
                System.out.printf("(%d)Carta %s ", i, HandArray[i-1].Nome);
            }
        }
        System.out.printf("\n");
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

    public boolean ChecarMaoVazia() {
        boolean MaoVazia = false;
        if (this.HandArray[0] == this.CartaVazia && this.HandArray[1] == this.CartaVazia && this.HandArray[2] == this.CartaVazia) {
            MaoVazia = true;
        }
        return MaoVazia;
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
