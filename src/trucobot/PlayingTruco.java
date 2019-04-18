/*  
 ``` Truco Gaudério
 2 players: Player1 & Player2
 First Player who gets 24 points wins.
 Played with a Spanish cards deck, 40 Cards, each card has [Power] Weight and [Number] Weight.
	
 "BigTurn" are played in loop until a player reaches 24 points first.
 BigTurn -> Worth 1 point but may be raised up to 4 points.
 BigTurn -> Each Player gets 3 random cards.	
 BigTurn -> Is a Best of Three dispute of 3 SmallTurn. Stronger card using [Power] wins the SmallTurn.
 BigTurn -> Player1 starts and then alternates 2->1->2->-1>-2......

 "SmallTurn" are the individual dispute best of 3 style that will decide who wins the entire BigTurn.	
 SmallTurn -> 1st Player may choose (1)Play a Card (2)CallRaise+1 (3)Call "Envido" (4)Call Flower (5) GiveUp
 "Envido"- Side dispute on *SmallTurn1 only* using [Number], "Flower"-All cards same equal free 3 points.
 SmallTurn -> 2nd Player may (1)Play a Card (2)CallRaise+1 (3)Call "Envido" (4)Call Flower (5) GiveUp
 SmallTurn -> Strongest Card Player plays 1st next SmallTurn.
 SmallTurn -> If Raise is called, other player has 2 options (1)ACCEPT (2)DENY
 -On ACCEPT, (1)may call another raise (2)Play the Card
 ---*Only Player who ACCEPT the raise may call the next raise in his turns*.
 -On DENY, gives current BigTurn dispute points to other player, BigTurn ends.
 SmallTurn -> If Envido is called, other player has 2 options (1)ACCEPT (2)DENY (3)Call Flower
 -On ACCEPT, (1)Compare Envido scores (2)Raise Envido
 -On DENY, gives current Envido dispute points to other player, BigTurn keeps going.
 -On Flower, invalidates Envido and Flower callers gets 3 points.
 SmallTurn -> If Flower is called, other player might call (1)CounterFlower only if has flower too.
	
 ```
 */
package trucobot;

public class PlayingTruco {

    Deck MatchDeck = new Deck();

    public Card[] MesaA = new Card[3];

    public Card[] MesaB = new Card[3];

    public boolean RodadaEmAndamento;

    int PesoDaMao;      //Peso da Mao Em Andamento
    int PesoDeEnvido;   //Peso do envido

    public void DealCards(Hand A, Hand B) {
        MatchDeck.ShuffleDeckArray();
        A.SetCards(MatchDeck.DeckArray[0], MatchDeck.DeckArray[2], MatchDeck.DeckArray[4]);
        B.SetCards(MatchDeck.DeckArray[1], MatchDeck.DeckArray[3], MatchDeck.DeckArray[5]);
    }

    public void Match(Player A, Player B) {

        System.out.println("Iniciado Partida XD");

        System.out.println("Setando pontos " + A.getNome() + " e " + B.getNome() + " Zero");
        A.setPontos(0);
        B.setPontos(0);

        A.setJogadorMao(true);
        B.setJogadorMao(false);

        System.out.println("Construindo deck");
        MatchDeck.BuildDeckArray();

        boolean loop = true;

        while (loop) {

            DealCards(A.getPlayerHand(), B.getPlayerHand());

            /*
             System.out.println("Mao de A");
             A.PHand.PrintHand();
             System.out.println("Mao de B");
             B.PHand.PrintHand();
             */
            System.out.println("Inicio da Mao");

            if (A.JogadorMao == true) {

                System.out.println("A Primeiro Jogador");

                BigTurn(A, B);

                B.setJogadorMao(true);
                A.setJogadorMao(false);

            } else {

                System.out.println("B Primeiro Jogador");

                BigTurn(B, A);

                A.setJogadorMao(true);
                B.setJogadorMao(false);

            }

            System.out.println("Placar A->" + A.getPontos() + " X " + B.getPontos() + "<-B");
            if (A.getPontos() >= 24) {
                break;
            }
            if (B.getPontos() >= 24) {
                break;
            }
        }
        //Match ENDS

    }

    public void BigTurn(Player A, Player B) {

        //int BigTurnWeight = 1;
        //int EnvidoWeight = 0;
        this.PesoDaMao = 1;
        this.PesoDeEnvido = 0;

        A.setPrimeiroDaRodada(true);
        B.setPrimeiroDaRodada(false);

        this.RodadaEmAndamento = true;

        while (this.RodadaEmAndamento == true) {

            if (A.PrimeiroDaRodada == true) {

                A.setPontos(A.getPontos() + this.PesoDaMao);
                SmallTurn(A, B);

                //this.RodadaEmAndamento = false;
            } else {

                B.setPontos(B.getPontos() + this.PesoDaMao);
                SmallTurn(B, A);

                //this.RodadaEmAndamento = false;
            }
            //Break, end current BigTurn
        }
        //Increment winner points with BitTurnWeight
    }

    public void SmallTurn(Player A, Player B) {

        OpcoesDeRodada(A, B);

        A.setPrimeiroDaRodada(false);

        B.setPrimeiroDaRodada(true);

    }

    public void OpcoesDeRodada(Player A, Player B) {
        A.ChamouTruco = false;
        A.ChamouEnvido = false;

        if (B.ChamouTruco == true) {
            B.ChamouTruco = false;
            System.out.println("Jogador " + A.getNome() + " aceitas? [1]Sim [2]Nao");
            int RespostaTruco = A.GetPlayerInput();
            if (RespostaTruco == 1) {
                System.out.println("Aceitastes Truco");
            }
            if (RespostaTruco == 2) {
                System.out.println("Recusastes Truco");
                RodadaEmAndamento = false;
            }
        }

        if (B.ChamouEnvido == true) {
            B.ChamouEnvido = false;
            System.out.println("Jogador " + A.getNome() + " aceitas? [1]Sim [2]Nao");
            int RespostaTruco = A.GetPlayerInput();
            if (RespostaTruco == 1) {
                System.out.println("Aceitastes Envido");
            }
            if (RespostaTruco == 2) {
                System.out.println("Recusastes Envido");                
            }
        }

        System.out.println("Rodada: Vez de Jogador " + A.getNome() + " suas opcoes sao:");
        A.PHand.PrintHand();
        System.out.println("[1][2][3]Jogar Cartas [4]Truco [5]Envido [6]Real Envido [7]Falta Envido [8]Flor [9]Fugir");

        int PlayerInput = A.GetPlayerInput();

        switch (PlayerInput) {
            case 1:
                System.out.println("Jogador escolheu jogar primeira carta");
                break;
            case 2:
                System.out.println("Jogador escolheu jogar segunda carta");
                break;
            case 3:
                System.out.println("Jogador escolheu jogar terceira carta");
                break;
            case 4:
                System.out.println("Chamou Truco");
                A.ChamouTruco = true;
                break;
            case 5:
                System.out.println("Chamou Envido");
                A.ChamouEnvido = true;
                break;
            case 6:
                System.out.println("Chamou Real Envido");
                break;
            case 7:
                System.out.println("Chamou Falta Envido");
                break;
            case 8:
                System.out.println("Cantou Flor");
                break;
            case 9:
                System.out.println("Foi ao baralho");
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }

    }

}
