package desafio3.entities;

public class Bill {

    private final double beerPrice = 5.00;
    private final double barbecuePrice = 7.00;
    private final double softDrinkPrice = 3.00;
    private final double couvert = 4.00;

    public char gender;
    public int qtdBeer;
    public int qtdSoftDrink;
    public int qtdBarbecue;

    public double feeding() {
        return (qtdBeer * beerPrice) + (qtdSoftDrink * softDrinkPrice) + (qtdBarbecue * barbecuePrice);
    }

    public double cover() {
        return (feeding() < 30.00) ? couvert : 0.00;
    }

    public double ticket() {
        return (gender == 'M') ? 10.00 : 8.00;
    }

    public double total() {
        return feeding() + cover() + ticket();
    }
}
