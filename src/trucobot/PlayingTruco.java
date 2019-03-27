/*  
``` Truco Gaudério
	2 players: Player1 & Player2
	First Player who gets 24 points wins.
	Played with a Spanish cards deck, 40 Cards, each card has [Power] Weight and [Number] Weight.
	
	"BigTurn" are played in loop until a player reaches 24 points first.
	BigTurn -> Worth 1 point but may be raised up to 4 points.
	BigTurn -> Each Player gets 3 random cards.	
	BigTurn -> Is a Best of Three dispute of 3 SmallTurn. Stronger card using [Power] wins the SmallTurn.
	BigTurn -> Player1 starts and then alternates 2->1->2->-1>-2......

	"SmallTurn" are the individual dispute best of 3 style that will decide who wins the entire BigTurn.	
	SmallTurn -> 1st Player may choose (1)Play a Card (2)CallRaise+1 (3)Call "Envido" (4)Call Flower (5) GiveUp
		"Envido"- Side dispute on *SmallTurn1 only* using [Number], "Flower"-All cards same equal free 3 points.
	SmallTurn -> 2nd Player may (1)Play a Card (2)CallRaise+1 (3)Call "Envido" (4)Call Flower (5) GiveUp
	SmallTurn -> Strongest Card Player plays 1st next SmallTurn.
	SmallTurn -> If Raise is called, other player has 2 options (1)ACCEPT (2)DENY
		 -On ACCEPT, (1)may call another raise (2)Play the Card
		 ---*Only Player who ACCEPT the raise may call the next raise in his turns*.
		 -On DENY, gives current BigTurn dispute points to other player, BigTurn ends.
	SmallTurn -> If Envido is called, other player has 2 options (1)ACCEPT (2)DENY (3)Call Flower
		 -On ACCEPT, (1)Compare Envido scores (2)Raise Envido
		 -On DENY, gives current Envido dispute points to other player, BigTurn keeps going.
		 -On Flower, invalidates Envido and Flower callers gets 3 points.
	SmallTurn -> If Flower is called, other player might call (1)CounterFlower only if has flower too.
	
```
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
        //Increment winner points with BitTurnWeight
    }

    public void SmallTurn(Player A, Player B) {
        //First Player gets possible options and choose
        //Second Player gets possible options and choose
        //Settle small turn
        //check if it ends BigHand
    }

}
