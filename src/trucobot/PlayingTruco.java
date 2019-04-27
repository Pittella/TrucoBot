package trucobot;

public class PlayingTruco {

    Deck MatchDeck = new Deck();
    public Card[] MesaA = new Card[3];
    public Card[] MesaB = new Card[3];

    public boolean RodadaEmAndamento;  //Contador da rodada

    int PesoDaMao;      //Peso da Mao Em Andamento
    int PesoDeEnvido;   //Peso do envido
    int CountRodada;    //Contador Numero da rodada

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

                MaoDoJogo(A, B);

                B.setJogadorMao(true);
                A.setJogadorMao(false);

            } else {

                System.out.println("B Primeiro Jogador");

                MaoDoJogo(B, A);

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

    public void MaoDoJogo(Player A, Player B) {

        this.PesoDaMao = 1;
        this.PesoDeEnvido = 0;
        this.CountRodada = 1;
        int PontosDaMaoA = 0;
        int PontosDaMaoB = 0;

        //A.setPrimeiroDaRodada(true);
        //B.setPrimeiroDaRodada(false);
        A.PrimeiroDaRodada = true;
        B.PrimeiroDaRodada = false;

        this.RodadaEmAndamento = true;

        A.JogouUmaCarta = false;
        B.JogouUmaCarta = false;

        while (this.RodadaEmAndamento == true) {

            if (this.CountRodada >= 4) {
                this.RodadaEmAndamento = false;
                break;
            }

            if (A.PrimeiroDaRodada == true && B.PrimeiroDaRodada == false) {

                //A.setPontos(A.getPontos() + this.PesoDaMao);
                RodadaDaMao(A, B);

                //this.RodadaEmAndamento = false;
            } else if (B.PrimeiroDaRodada == true && A.PrimeiroDaRodada == false) {

                //B.setPontos(B.getPontos() + this.PesoDaMao);
                RodadaDaMao(B, A);

                //this.RodadaEmAndamento = false;
            } else {
                System.out.println("Error MaoDoJogo() ");
            }

            if (A.JogouUmaCarta == true && B.JogouUmaCarta == true) {
                
                System.out.println("Ambos jogadores jogaram uma carta na rodada #" + CountRodada);
                
                if (ContabilizaCartasDaRodada(A.Mesa[CountRodada - 1], B.Mesa[CountRodada - 1], CountRodada) == 1) {
                    
                    System.out.println(A.getNome() + " vence a rodada");
                    
                    PontosDaMaoA = PontosDaMaoA + 1;
                    
                    A.PrimeiroDaRodada = true;
                    
                    B.PrimeiroDaRodada = false;
                    

                } else if (ContabilizaCartasDaRodada(A.Mesa[CountRodada - 1], B.Mesa[CountRodada - 1], CountRodada) == 2) {
                    
                    System.out.println(B.getNome() + " vence a rodada");
                    
                    PontosDaMaoB = PontosDaMaoB + 1;
                    
                    B.PrimeiroDaRodada = true;
                    
                    A.PrimeiroDaRodada = false;
                    

                } else {
                    
                    System.out.println("Empardou a rodada #" + CountRodada);
                    
                }
                
                if(PontosDaMaoA==2){
                    
                    break;
                    
                }
                
                if(PontosDaMaoB==2){
                    
                    break;
                    
                }

                this.CountRodada = this.CountRodada + 1;
                
                A.JogouUmaCarta = false;
                
                B.JogouUmaCarta = false;
                
            }

        }

        if (PontosDaMaoA > PontosDaMaoB) {
            
            System.out.println(A.getNome() + " pontoa");
            
            A.setPontos(A.getPontos() + this.PesoDaMao);
            
        } else if (PontosDaMaoB > PontosDaMaoA) {
            
            System.out.println(B.getNome() + " pontoa");
            
            B.setPontos(B.getPontos() + this.PesoDaMao);
            
        }
        //Increment winner points with BitTurnWeight
    }

    public void RodadaDaMao(Player A, Player B) {

        System.out.println("Rodada #" + this.CountRodada + " PesoDaMao:" + this.PesoDaMao);

        A.VezDeJogar = true;
        A.ChamouTruco = false;

        while (A.VezDeJogar == true) {
            
            OpcoesDeRodada(A, B);
            
        }

        A.setPrimeiroDaRodada(false);

        B.setPrimeiroDaRodada(true);

    }

    public void OpcoesDeRodada(Player A, Player B) {
        int EscolhaDaJogada;

        System.out.println("Jogador " + A.getNome() + " opcoes:" + " PesoDaMao:" + this.PesoDaMao);

        A.PHand.PrintHand();

        if (A.ChamouTruco == true && this.CountRodada == 1) {

            System.out.println("1 2 3 ->Cartas 5->Envido 6->Real Envido 7->Falta Envido 8->Flor 9->Exit ");

        } else if (this.CountRodada == 1) {

            System.out.println("1 2 3 ->Cartas 4->Truco 5->Envido 6->Real Envido 7->Falta Envido 8->Flor 9->Exit ");

        } else {

            System.out.println("1 2 3 ->Cartas 4->Truco 9->Exit ");

        }

        EscolhaDaJogada = A.GetPlayerInput();

        if (EscolhaDaJogada == 1 || EscolhaDaJogada == 2 || EscolhaDaJogada == 3) {

            if (A.PHand.HandArray[EscolhaDaJogada - 1].peso == -1) {

                System.out.println("Carta Vazia Escolha Invalida");

            } else {
                
                A.Mesa[CountRodada - 1] = A.PHand.HandArray[EscolhaDaJogada - 1];

                A.PHand.HandArray[EscolhaDaJogada - 1] = A.PHand.CartaVazia;

                A.JogouUmaCarta = true;

                System.out.println(A.getNome() + " jogou " + A.Mesa[CountRodada - 1].Nome);

                System.out.println("Passando a vez para outro jogador");

                A.VezDeJogar = false;
            }

        } else if (EscolhaDaJogada == 4) {

            System.out.println(A.getNome() + " chamou truco");

            A.ChamouTruco = true;

            B.ChamouTruco = false;

            ChamouTruco(A, B);

        }

    }

    public void ChamouTruco(Player A, Player B) {
        int RespostaTruco;

        if (A.ChamouTruco == true) {
            
            System.out.println(B.getNome() + " aceitas truco? (1)Sim (2)Nao (3)Sim e Retruco");
            
            RespostaTruco = B.GetPlayerInput();
            
            if (RespostaTruco == 1) {
                
                System.out.println("Aceitastes");
                
                this.PesoDaMao = 2;
                
            } else if (RespostaTruco == 2) {
                
                System.out.println("Recusastes");
                
                System.out.println("Fim da rodada");
                
                this.RodadaEmAndamento = false;
                
            }
        }

    }

    public int ContabilizaCartasDaRodada(Card A, Card B, int Rodada) {
        
        if (A.peso > B.peso) {
            
            return 1;
            
        } else if (A.peso < B.peso) {
            
            return 2;
            
        } else {
            
            return 3;
            
        }
        
    }

}
