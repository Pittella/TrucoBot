package trucobot;

import java.util.Scanner;

/* */
public class Player {

    public Hand PHand = new Hand();
    int Pontos, Vitorias;
    String nome;
    
    Scanner PlayerInput = new Scanner(System.in);
    
    public int GetPlayerInput(){
    return PlayerInput.nextInt();
    }
    
    public OPT_RODADA GetPlayerOPT(){
        if(GetPlayerInput()==0){
        return OPT_RODADA.CARTA_1;
        }
        if(GetPlayerInput()==1){
        return OPT_RODADA.CARTA_2;
        }
        if(GetPlayerInput()==2){
        return OPT_RODADA.CARTA_3;
        } else{
            System.out.println("Jogada invalida");            
        }
        return OPT_RODADA.INVALIDA;
    }
    
    //testando enum n sei se vai da certo
    enum OPT_RODADA {
        CARTA_1,
        CARTA_2,
        CARTA_3,
        TRUCO,
        RETRUCO,
        VALE4,
        ACEITAR_TRUCO,
        FUGIR_TRUCO,
        ENVIDO,
        REAL_ENVIDO,
        FATA_ENVIDO,
        ACEITAR_ENVIDO,
        FUGIR_ENVIDO,
        FLOR,
        CONTRA_FLOR,
        CONTRA_FLOR_RESTO,
        INVALIDA;
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
