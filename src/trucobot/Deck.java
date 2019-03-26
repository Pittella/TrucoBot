package trucobot;

import java.util.Random;

public class Deck {

    public Card[] DeckArray = new Card[40];

    public void BuildDeckArray() {
        DeckArray[0] = new Card(13, 1, 1, "Espadao");         //Espadas Naipe = 1; 
        DeckArray[1] = new Card(8, 2, 1, "Dois de Espadas");
        DeckArray[2] = new Card(9, 3, 1, "Tres de Espadas");
        DeckArray[3] = new Card(0, 4, 1, "Quatro de Espadas");
        DeckArray[4] = new Card(1, 5, 1, "Cinco de Espadas");
        DeckArray[5] = new Card(2, 6, 1, "Seis de Espadas");
        DeckArray[6] = new Card(11, 7, 1, "Sete de Espadas");
        DeckArray[7] = new Card(4, 0, 1, "Dez de Espadas");
        DeckArray[8] = new Card(5, 0, 1, "Onze de Espadas");
        DeckArray[9] = new Card(6, 0, 1, "Doze de Espadas");

        DeckArray[10] = new Card(12, 1, 2, "Bastiao");
        DeckArray[11] = new Card(8, 2, 2, "Dois de Bastos");
        DeckArray[12] = new Card(9, 3, 2, "Tres de Bastos");
        DeckArray[13] = new Card(0, 4, 2, "Quatro de Bastos");
        DeckArray[14] = new Card(1, 5, 2, "Cinco de Bastos");
        DeckArray[15] = new Card(2, 6, 2, "Seis de Bastos");
        DeckArray[16] = new Card(3, 7, 2, "Sete de Bastos");
        DeckArray[17] = new Card(4, 0, 2, "Dez de Bastos");
        DeckArray[18] = new Card(5, 0, 2, "Onze de Bastos");
        DeckArray[19] = new Card(6, 0, 2, "Doze de Bastos");

        DeckArray[20] = new Card(7, 1, 3, "Um de Ouros");//Ouros Naipe = 3 
        DeckArray[21] = new Card(8, 2, 3, "Dois de Ouros");
        DeckArray[22] = new Card(9, 3, 3, "Tres de Ouros");
        DeckArray[23] = new Card(0, 4, 3, "Quatro de Ouros");
        DeckArray[24] = new Card(1, 5, 3, "Cinco de Ouros");
        DeckArray[25] = new Card(2, 6, 3, "Seis de Ouros");
        DeckArray[26] = new Card(10, 7, 3, "Manilha de Ouros");
        DeckArray[27] = new Card(4, 0, 3, "Dez de Ouros");
        DeckArray[28] = new Card(5, 0, 3, "Onze de Ouros");
        DeckArray[29] = new Card(6, 0, 3, "Doze de Ouros");

        DeckArray[30] = new Card(7, 1, 4, "Um de Copas");
        DeckArray[31] = new Card(8, 2, 4, "Dois de Copas");
        DeckArray[32] = new Card(9, 3, 4, "Tres de Copas");
        DeckArray[33] = new Card(0, 4, 4, "Quatro de Copas");
        DeckArray[34] = new Card(1, 5, 4, "Cinco de Copas");
        DeckArray[35] = new Card(2, 6, 4, "Seis de Copas");
        DeckArray[36] = new Card(3, 7, 4, "Sete de Copas");
        DeckArray[37] = new Card(4, 0, 4, "Dez de Copas");
        DeckArray[38] = new Card(5, 0, 4, "Onze de Copas");
        DeckArray[39] = new Card(6, 0, 4, "Doze de Copas");
    }

    public void ShuffleDeckArray() {
        Random RandNum = new Random();
        for (int i = 0; i < 40; i++) {
            int RandomPos = RandNum.nextInt(40);
            Card Temp = this.DeckArray[i];
            this.DeckArray[i] = this.DeckArray[RandomPos];
            this.DeckArray[RandomPos] = Temp;
        }
    }

}
