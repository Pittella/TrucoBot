/* 
    Convencoes tomadas: 
    1. A = Primeiro a Jogar B = Segundo a Jogar
    2. Partida = Partida Inteira de Truco
    3. Mao = Fracao da Partida que vale 1 ponto e pode ser aumentada
    4. Rodada = Fracao da Mao 

OBS: Tive que criar WhileVar e breaks pq em Partida() while(A.getPontos() >= 24 || B.getPontos() >= 24) nao funciona lol kkk XD
 */
package trucobot;

import java.util.Scanner;

public class PlayingTruco {

    Deck Baralho = new Deck();
    Scanner UsrIn = new Scanner(System.in);

    boolean WhileVar = true, OrdemMao = true, OrdemRodada = true, 
            Truco = false, Retruco = false, Vale4 = false, 
            Envido = false, RealEnvido = false, FaltaEnvido = false;

    public void DealCards(Hand A, Hand B) {
        Baralho.ShuffleDeckArray();
        A.SetCards(Baralho.DeckArray[0], Baralho.DeckArray[2], Baralho.DeckArray[4]);
        B.SetCards(Baralho.DeckArray[1], Baralho.DeckArray[3], Baralho.DeckArray[5]);
    }

    public void Partida(Player A, Player B) {
        A.setPontos(0);
        B.setPontos(0);
        Baralho.BuildDeckArray();        
        System.out.printf("Partida() Pts de %d:%s Pts de %d=%s\n", A.getPontos(), A.getNome(), B.getPontos(), B.getNome());
        while (WhileVar) {
            //System.out.printf("WHILE PARTIDA Pts de %d:%s Pts de %d=%s\n", A.getPontos(), A.getNome(), B.getPontos(), B.getNome());
            DealCards(A.getPlayerHand(), B.getPlayerHand());
            if (this.OrdemMao == true) {
                System.out.println(A.getNome() + " joga primeiro");
                Mao(A, B);
                this.OrdemMao = false;
            } else {
                System.out.println(B.getNome() + " joga primeiro");
                Mao(B, A);
                this.OrdemMao = true;
            }
            if(A.getPontos()>=24){
                break;
            }
            if(B.getPontos()>=24){
                break;
            }
            System.out.printf("FIM WHILE PARTIDA Pts de %d:%s Pts de %d=%s\n", A.getPontos(), A.getNome(), B.getPontos(), B.getNome());
        }

    }

    public void Mao(Player A, Player B) {
        int a = 1;
        this.OrdemRodada = true;
        while (WhileVar){
            if(this.OrdemRodada==true){
                Rodada(A,B);
                this.OrdemRodada=false;
            } else {
                Rodada(B,A);
                this.OrdemRodada=true;
            }
        }
        A.IncrementaPontos(a);
        System.out.printf("FIM MAO Pts de %d:%s Pts de %d=%s\n", A.getPontos(), A.getNome(), B.getPontos(), B.getNome());

    }

    public void Rodada(Player A, Player B) {

    }

}
