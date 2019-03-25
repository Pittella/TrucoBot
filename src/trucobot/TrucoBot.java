package trucobot;   

public class TrucoBot {

    public static void main(String[] args) {
        //MAIN CODE
        PlayingTruco p = new PlayingTruco();
        p.InitJogo();
        //p.DealCards();
        //p.PrintHands();
        p.Turn();
        
        //System.out.println("Hello world");     
        
    }
    
}
