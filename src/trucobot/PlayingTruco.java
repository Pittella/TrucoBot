/*  
IMPORTANTE:
    1. A = 1st to Play B = 2nd to Play
    2. Match/Match = Match Inteira de Truco/Whole Match
    3. BigTurn/Hand = Can be raised, worth 1 point, has  smalls turns(max 3)
    4. SmallTurn/Turn = Single dispute, may call raises to raise BigTurn points.
 */
package trucobot;

public class PlayingTruco {

    Deck MatchDeck = new Deck();

    /*Flags*/
    boolean _A_1st_BigTurn_ = true, _A_1st_SmallTurn_ = true; //Set who plays first on each Big and Small turn

    public void DealCards(Hand A, Hand B) {
        MatchDeck.ShuffleDeckArray();
        A.SetCards(MatchDeck.DeckArray[0], MatchDeck.DeckArray[2], MatchDeck.DeckArray[4]);
        B.SetCards(MatchDeck.DeckArray[1], MatchDeck.DeckArray[3], MatchDeck.DeckArray[5]);
    }

    public void Match(Player A, Player B) {
        A.setPontos(0);
        B.setPontos(0);
        MatchDeck.BuildDeckArray();
        boolean loop = true;
        while (loop) {
            DealCards(A.getPlayerHand(), B.getPlayerHand());
            if (this._A_1st_BigTurn_ == true) {
                BigTurn(A, B);
                this._A_1st_BigTurn_ = false;
            } else {
                BigTurn(B, A);
                this._A_1st_BigTurn_ = true;
            }
            if (A.getPontos() >= 24) {
                break;
            }
            if (B.getPontos() >= 24) {
                break;
            }
        }
        //Match ENDS

    }

    public void BigTurn(Player A, Player B) {
        int BigTurnWeight = 1;
        int EnvidoWeight = 0;
        this.COUNT_SmallTurn = 0;
        this._A_1st_SmallTurn_ = true;
        boolean TurnIsNotFinished = true;
        while (TurnIsNotFinished == true) {
            if (this._A_1st_SmallTurn_ == true) {
                SmallTurn(A, B);
            } else {
                SmallTurn(B, A);
            }
            //Break end current BigTurns ends
        }
        A.IncrementaPontos(BigTurnWeight);
    }

    public void SmallTurn(Player A, Player B) {
        //First Player gets possible options and choose

        //Second Player gets possible options and choose
        //Settle small turn
        //check if it ends BigHand
    }

}
