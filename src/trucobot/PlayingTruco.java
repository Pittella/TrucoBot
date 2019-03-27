/*  
IMPORTANTE:
    1. A = 1st to Play B = 2nd to Play
    2. Partida/Match = Partida Inteira de Truco/Whole Match
    3. Mao/Hand = Can be raised, worth 1 point, has turns(max 3)
    4. Rodada/Turn = Single dispute, may call TrucoETC to raise Hand.
 */
package trucobot;

public class PlayingTruco {

    Deck Baralho = new Deck();

    /*Flags*/    
    boolean _A_1st_MAO_ = true, _A_1st_RODADA_ = true; //Set who plays first on each Hand and on each Turn

    /*Mao Counter, Rodada Counter*/
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
        boolean loop = true;
        System.out.printf("Começa a Partida, Pts de %d:%s Pts de %d=%s\n", A.getPontos(), A.getNome(), B.getPontos(), B.getNome());
        while (loop) {
            //System.out.printf("WHILE PARTIDA Pts de %d:%s Pts de %d=%s\n", A.getPontos(), A.getNome(), B.getPontos(), B.getNome());
            DealCards(A.getPlayerHand(), B.getPlayerHand());
            if (this._A_1st_MAO_ == true) {
                System.out.println(A.getNome() + " eh Mao");
                Mao(A, B);
                this._A_1st_MAO_ = false;
            } else {
                System.out.println(B.getNome() + " eh Mao");
                Mao(B, A);
                this._A_1st_MAO_ = true;
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
        this._A_1st_RODADA_ = true;
        boolean loop = true;
        while (loop) {
            if (this._A_1st_RODADA_ == true) {
                System.out.println("joga primeiro na rodada:" + A.getNome());
                Rodada(A, B);
            } else {
                System.out.println("joga primeiro na rodada:" + B.getNome());
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
        System.out.printf("Rodada Numero: %d\n", this.COUNT_RODADA);
        System.out.println(A.getNome() + " joga");
        System.out.println(B.getNome() + " joga");
        System.out.println("Ver quem ganhou");
        if (this._A_1st_RODADA_ == true) {
            System.out.println(B.getNome() + " ganhou rodada");
            this._A_1st_RODADA_ = false;
        } else {
            System.out.println(A.getNome() + " ganhou rodada");
            this._A_1st_RODADA_ = true;
        }
    }

}
