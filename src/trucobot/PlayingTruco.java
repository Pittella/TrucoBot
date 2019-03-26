/* 
    Convencoes tomadas: 
    1. A = Primeiro a Jogar B = Segundo a Jogar
    2. Partida = Partida Inteira de Truco
    3. Mao = Fracao da Partida que vale 1 ponto e pode ser aumentada
    4. Rodada = Fracao da Mao 
 */
package trucobot;

import java.util.Scanner;

public class PlayingTruco {

    Deck Baralho = new Deck();
    Scanner UsrIn = new Scanner(System.in);

    /*
    public void InitJogo() {
        Baralho.BuildDeckArray();
        this.PtsA = 0;
        this.PtsB = 0;
        this.TurnVar = 0;
    }
     */
    public void DealCards(Hand A, Hand B) {
        Baralho.ShuffleDeckArray();
        A.SetCards(Baralho.DeckArray[0], Baralho.DeckArray[2], Baralho.DeckArray[4]);
        B.SetCards(Baralho.DeckArray[1], Baralho.DeckArray[3], Baralho.DeckArray[5]);
        A.PrintHand();
        System.out.printf("Envido = %d\n", A.CalcEnvido());
        System.out.printf("Envido = %d\n", B.CalcEnvido());
    }

    public void Partida(Player A, Player B) {
        boolean Truco = false, Retruco = false, Vale4 = false, 
                Envido = false, RealEnvido = false, FaltaEnvido = false; //FLAGS
        int PontosA = 0, PontosB = 0;

    }

    public void Mao() {

    }

    public void Rodada() {

    }

}
