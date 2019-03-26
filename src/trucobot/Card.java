package trucobot;

/*
Peso eh o que decide qual carta eh a mais forte
Num eh para referencia qual quarta eh
tipo 1=Espadas 2=Bastos 3=Ouros 4=Copas
 */
public class Card {

    int peso;
    int num;
    int tipo;
    String Nome;

    public Card(int peso, int num, int tipo, String Nome) {
        this.peso = peso;
        this.num = num;
        this.tipo = tipo;
        this.Nome = Nome;

    }

}
