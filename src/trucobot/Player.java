package trucobot;

import java.util.Scanner;

/* */
public class Player {

    public Hand PHand = new Hand();
    int Pontos, Vitorias;
    String nome;

    Scanner PlayerInput = new Scanner(System.in);

    public int GetPlayerInput() {
        return PlayerInput.nextInt();
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
