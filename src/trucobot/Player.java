package trucobot;

/* */

public class Player {
    public Hand PHand = new Hand();
    boolean mao, submao;
    int Vitorias;
    String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
        
    public void setSubmao(boolean submao) {
        this.submao = submao;
    }

    public boolean isSubmao() {
        return submao;
    }

    public void setPlayerHand(Hand PlayerHand) {
        this.PHand = PlayerHand;
    }

    public void setMao(boolean mao) {
        this.mao = mao;
    }

    public Hand getPlayerHand() {
        return PHand;
    }

    public boolean isMao() {
        return mao;
    }
}
