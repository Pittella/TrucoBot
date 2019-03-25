
package trucobot;


public class MecanicasDeTruco {
    public int PontosA,PontosB;
    
    
    public void IniciarPartida(){
    this.PontosA=0;
    this.PontosB=0;
    }
    
    public void Truco(int A, int B){
        if(A>B){
            this.PontosA=this.PontosA+2;
        }
    }
    
}
