package trucobot;

/* */
public class Player {

    public Hand PHand = new Hand();
    int Pontos,Vitorias;

    public void setPontos(int Pontos) {
        this.Pontos = Pontos;
    }
    String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void IncrementaPontos(int a){
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
