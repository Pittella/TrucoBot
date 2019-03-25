package trucobot;

import java.util.Scanner;

public class PlayingTruco {

    Hand HandA = new Hand();
    Hand HandB = new Hand();
    Deck Deck1 = new Deck();

    Scanner UsrIn = new Scanner(System.in);

    public int PtsA, PtsB, TurnVar, Escolha;

    public void InitJogo() {
        Deck1.BuildDeckArray();
        Deck1.ShuffleDeckArray();
        this.PtsA = 0;
        this.PtsB = 0;
        this.TurnVar = 0;
    }

    public void DealCards() {
        HandA.SetCards(Deck1.DeckArray[0], Deck1.DeckArray[2], Deck1.DeckArray[4]);
        HandB.SetCards(Deck1.DeckArray[1], Deck1.DeckArray[3], Deck1.DeckArray[5]);
    }

    public void Turn() {
        int PesoA, PesoB;
        System.out.println("1/2/3 escolher carta");
        this.DealCards();
        //System.out.println("4 Truco, 5 Invido");
        System.out.printf("Pontuação A: %d B:%d\n", this.PtsA, this.PtsB);
        for (int i = 0; i < 3; i++) {//while (this.PtsA != 3 || this.PtsB != 3) {
            System.out.println("A:");
            HandA.PrintHand();
            System.out.println("B:");
            HandB.PrintHand();
            System.out.printf("PONTUAÇÃO RODADA A: %d B:%d\n", this.PtsA, this.PtsB);
            if (this.TurnVar == 0) {

                System.out.println("Jogador 1: Aguardando input...");
                this.Escolha = UsrIn.nextInt();
                //this.Escolha = this.Escolha;                
                System.out.println("Jogador 1 escolheu a carta: ");
                System.out.println(HandA.HandArray[this.Escolha].Nome);
                PesoA = HandA.HandArray[this.Escolha].peso;
                HandA.RemoveCard(this.Escolha);

                System.out.println("Jogador 2: Aguardando input...");
                this.Escolha = UsrIn.nextInt();
                //this.Escolha = this.Escolha;                
                System.out.println("Jogador 2 escolheu a carta: ");
                System.out.println(HandB.HandArray[this.Escolha].Nome);
                PesoB = HandB.HandArray[this.Escolha].peso;
                HandB.RemoveCard(this.Escolha);

                System.out.println("Verificando carta mais forte");
                if (PesoA > PesoB) {
                    System.out.println("A > B");
                    this.PtsA = this.PtsA + 1;
                } else {
                    System.out.println("B < A");
                    this.PtsB = this.PtsB + 1;
                }
            }
        }
        System.out.println("FIM da rodada");
        if (this.PtsA > this.PtsB) {
            System.out.println("A wins!");
        } else {
            System.out.println("B wins!");
        }

    }

}

/*
    public void TestarCoisasETC(){
    Deck1.BuildDeckArray(); //Testado OK
    Deck1.ShuffleDeckArray(); //Testado OK
    HandA.SetCards(Deck1.DeckArray[0], Deck1.DeckArray[2], Deck1.DeckArray[4]);
    HandB.SetCards(Deck1.DeckArray[1], Deck1.DeckArray[3], Deck1.DeckArray[5]);
    
    //Teste Print Baralho 
    
    for(int i=0;i<40;i++){
        System.out.printf("Carta %d/%d\n", Deck1.DeckArray[i].num, Deck1.DeckArray[i].tipo);
        } 
    
    
    //Teste Print Maos 
    System.out.println("Mao A");
    for(int i=0;i<3;i++){
        System.out.printf("Carta %s\n", HandA.HandArray[i].Nome);       
    }
    
    System.out.println("Mao B");
    for(int i=0;i<3;i++){
        System.out.printf("Carta %s\n", HandB.HandArray[i].Nome);       
    }
    
    
    }  */
