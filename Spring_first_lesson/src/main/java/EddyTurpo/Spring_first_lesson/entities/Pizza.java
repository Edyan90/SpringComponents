package EddyTurpo.Spring_first_lesson.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Pizza extends Cibo {
    private final String ingrediente1 = "Tomato";
    private final String ingrediente2 = "Cheese";
    private List<Toppings> toppings;

    public Pizza(String nome, Double prezzo, int calorie) {
        super(nome, prezzo, calorie);
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Toppings toppings) {
        this.toppings.add(toppings);
    }

    @Override
    public Double getPrezzo() {
        Double totalPrezzo = this.prezzo;
        for (Toppings topping : toppings) {
            totalPrezzo += topping.getPrezzo();
        }
        return totalPrezzo;
    }


    @Override
    public void printCiboDetails() {
        System.out.println("Pizza: " + getNome());
        System.out.println("Prezzo: " + getPrezzo());
        System.out.println("Calorie: " + getCalorie());
        System.out.println("Ingredienti base (Margherita): " + ingrediente1 + " " + ingrediente2);
        System.out.println("Toppings: ");
        for (Toppings topping : toppings) {
            System.out.println(" - " + topping.getNome());
        }
    }
}
