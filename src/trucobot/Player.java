package trucobot;

/* */

public class Player {
    public Hand PlayerHand = new Hand();
    boolean mao, submao;
    int Vitorias;

    public void setSubmao(boolean submao) {
        this.submao = submao;
    }

    public boolean isSubmao() {
        return submao;
    }

    public void setPlayerHand(Hand PlayerHand) {
        this.PlayerHand = PlayerHand;
    }

    public void setMao(boolean mao) {
        this.mao = mao;
    }

    public Hand getPlayerHand() {
        return PlayerHand;
    }

    public boolean isMao() {
        return mao;
    }
}
