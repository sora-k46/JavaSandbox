
public class RestaurantOO {

    public static void main(String[] args) {
        System.out.println("Lab1: Student ID: 64130500271, Sorrawit Kwanja");
        Food[] menu = new Food[100];
        Food f1 = new Food("Padthai", 70.00, 200, "Noodle");
        menu[0] = f1;
        System.out.println(menu[0]);
        f1.addIngredient("Thin noodle", 200);
        f1.addIngredient("Shrimp", 100);
        f1.addIngredient("Egg", 1);
        f1.addIngredient("Beansprout", 50);
        f1.addIngredient("Tofu", 50);
        System.out.println("The number of ingredients of " + "Padthai is " + menu[0].getAmountOfIngredient());

        menu[1] = new Food("Orange Juice", 30, 100, "Drink");
        menu[1].addIngredient("Orange", 1);
        menu[1].addIngredient("Salt", 20);
        menu[1].addIngredient("Sugar", 40);

        menu[2] = new Food("Corn Soup", 80, 300, "Soup");
        menu[2].addIngredient("Corn", 200);
        menu[2].addIngredient("Salt", 20);
        menu[2].addIngredient("Milk", 200);

        for (int i = 0; menu[i] != null; i++) {
            System.out.println(menu[i] + " ");
            // for (String ingredient : menu[i].getIngredient()) {
            //     System.out.print(ingredient + " ");
            // }
            for (int j = 0; j < menu[i].getAmountOfIngredient(); j++) {
                System.out.print(menu[i].getIngredient()[j] + ";" + menu[i].getIngredientQuantity()[j] + " ");
            }
            System.out.println();
        }

    }
}