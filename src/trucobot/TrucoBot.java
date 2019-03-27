package trucobot;

public class TrucoBot {

    public static void main(String[] args) {
        Player Mario = new Player();
        Player Luigi = new Player();
        Mario.setNome("Mario");
        Luigi.setNome("Luigi");
        
        PlayingTruco JogoDeTruco = new PlayingTruco();
        JogoDeTruco.Match(Mario, Luigi);
        

    }

}
