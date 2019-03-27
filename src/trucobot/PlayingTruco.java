/* 
    Convencoes tomadas: 
    1. A = Primeiro a Jogar B = Segundo a Jogar
    2. Partida = Partida Inteira de Truco
    3. Mao = Fracao da Partida que vale 1 ponto e pode ser aumentada
    4. Rodada = Fracao da Mao 

OBS: Tive que criar WhileVar e breaks pq em Partida() while(A.getPontos() >= 24 || B.getPontos() >= 24) nao funciona lol kkk XD
 */
package trucobot;

public class PlayingTruco {

    Deck Baralho = new Deck();

    boolean WhileVar = true; 
    boolean A_PRIMEIRO_MAO = true, A_PRIMEIRO_RODADA = true; 
    boolean TRUCO = false, RETRUCO = false, VALE4 = false; 
    boolean ENVIDO = false, REAL_ENVIDO = false, FALTA_ENVIDO = false;
    boolean EMPATE_PRIMEIRA = false, EMPATE_SEGUNDA = false, EMPATE_TERCEIRA = false;
    boolean PRIMEIRA_RODADA = true;
    boolean A_GANHOU_MAO = false, B_GANHOU_MAO = false, A_GANHOU_ENVIDO = false, B_GANHOU_ENVIDO = false;
    int COUNT_MAO, COUNT_RODADA; 

    public void DealCards(Hand A, Hand B) {
        Baralho.ShuffleDeckArray();
        A.SetCards(Baralho.DeckArray[0], Baralho.DeckArray[2], Baralho.DeckArray[4]);
        B.SetCards(Baralho.DeckArray[1], Baralho.DeckArray[3], Baralho.DeckArray[5]);
    }

    public void Partida(Player A, Player B) {
        A.setPontos(0);
        B.setPontos(0);
        Baralho.BuildDeckArray();
        System.out.printf("Começa a Partida, Pts de %d:%s Pts de %d=%s\n", A.getPontos(), A.getNome(), B.getPontos(), B.getNome());
        while (WhileVar) {
            //System.out.printf("WHILE PARTIDA Pts de %d:%s Pts de %d=%s\n", A.getPontos(), A.getNome(), B.getPontos(), B.getNome());
            DealCards(A.getPlayerHand(), B.getPlayerHand());
            if (this.A_PRIMEIRO_MAO == true) {
                System.out.println(A.getNome() + " eh Mao");
                Mao(A, B);
                this.A_PRIMEIRO_MAO = false;
            } else {
                System.out.println(B.getNome() + " eh Mao");
                Mao(B, A);
                this.A_PRIMEIRO_MAO = true;
            }
            if (A.getPontos() >= 24) {
                break;
            }
            if (B.getPontos() >= 24) {
                break;
            }
            System.out.printf("FIM WHILE PARTIDA Pts de %d:%s Pts de %d=%s\n", A.getPontos(), A.getNome(), B.getPontos(), B.getNome());
        }
        System.out.printf("Termina a Partida, Pts de %d:%s Pts de %d=%s\n", A.getPontos(), A.getNome(), B.getPontos(), B.getNome());

    }

    public void Mao(Player A, Player B) {
        int ValorMao = 12; //Valor da Mao pode ser aumentada
        int ValorEnvido = 0; //Valor de Envido        
        this.COUNT_RODADA = 0;
        this.A_PRIMEIRO_RODADA = true;
        while (WhileVar) {
            if (this.A_PRIMEIRO_RODADA == true) {
                System.out.println("joga primeiro na rodada:"+A.getNome());
                Rodada(A, B);
            } else {
                System.out.println("joga primeiro na rodada:"+B.getNome());
                Rodada(B, A);
            }
            if (COUNT_RODADA >= 3) {
                break;
            }
            COUNT_RODADA = COUNT_RODADA + 1;
        }
        A.IncrementaPontos(ValorMao);
        System.out.printf("FIM MAO Pts de %d:%s Pts de %d=%s\n", A.getPontos(), A.getNome(), B.getPontos(), B.getNome());

    }

    public void Rodada(Player A, Player B) {
        System.out.printf("Rodada Numero: %d\n",this.COUNT_RODADA);
        System.out.println(A.getNome()+" joga");
        System.out.println(B.getNome()+" joga");
        System.out.println("Ver quem ganhou");
        if (this.A_PRIMEIRO_RODADA == true) {            
            System.out.println(B.getNome()+" ganhou rodada");
            this.A_PRIMEIRO_RODADA = false;
        } else {
            System.out.println(A.getNome()+" ganhou rodada");
            this.A_PRIMEIRO_RODADA = true;
        }        
    }

}
