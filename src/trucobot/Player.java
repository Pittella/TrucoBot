package trucobot;

import java.util.Scanner;

/* */
public class Player {

    public Hand PHand = new Hand();
    
    public Card[] Mesa = new Card[3];
    
    int Pontos, Vitorias;
    String nome;
    Scanner PlayerInput = new Scanner(System.in);

    //Atributos boolean para fluxo da rodada
    public boolean JogadorMao;
    public boolean JogadorPe;
    public boolean PrimeiroDaRodada;
    public boolean SegundoDaRodada;
    public boolean VezDeJogar;
    public boolean JogouUmaCarta;
    public boolean PodeChamarOuAumentarTruco;
    public boolean PodeChamarInvido;
    public boolean PodeChamarFlor;    
    public boolean VenceuPrimeiraRodada;
    public boolean VenceuSegundaRodada;
    public boolean VenceuTerceiraRodada;
    public boolean ChamouTruco;
    public boolean ChamouRetruco;
    public boolean ChamouVale4;
    public boolean ChamouEnvido;
    public boolean ChamouRealEnvido;
    public boolean ChamouFaltaEnvido;
    public boolean ChamouFlor;
    

    
    public void setJogadorMao(boolean JogadorMao) {
        this.JogadorMao = JogadorMao;
        if(JogadorMao == true)
            this.JogadorPe = false;
        if(JogadorMao == false)
            this.JogadorPe = true;
        
    }

        public void setPrimeiroDaRodada(boolean PrimeiroDaRodada) {
        this.PrimeiroDaRodada = PrimeiroDaRodada;
        if(PrimeiroDaRodada == true)
            this.SegundoDaRodada = false;
        if(PrimeiroDaRodada == false)
            this.SegundoDaRodada = true;
        
    }

    public int GetPlayerInput() {
        return PlayerInput.nextInt();
        //return PlayerInput.nextLine();
        //return 1;
        //return foo;
    }

    public void setPontos(int Pontos) {
        this.Pontos = Pontos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void IncrementaPontos(int a) {
        this.Pontos = this.Pontos + a;
    }

    public int getPontos() {
        return Pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setPlayerHand(Hand PlayerHand) {
        this.PHand = PlayerHand;
    }

    public Hand getPlayerHand() {
        return PHand;
    }

}
