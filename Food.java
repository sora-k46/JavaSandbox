public class Food {
    private String name;
    private double price;
    private int calories;
    private String[] ingredient;
    private int[] ingredientQuantity;
    private String type;
    private int amountOfIngredient;

    public Food(String name, double price, int calories, String type) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.type = type;
        this.ingredient = new String[10];
        this.ingredientQuantity = new int[10];
        amountOfIngredient = 0;

    }

    public void addIngredient(String ingredient, int quantity) {
        this.ingredient[amountOfIngredient] = ingredient;
        ingredientQuantity[amountOfIngredient] = quantity;
        amountOfIngredient++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if(price >= 50 && price <= 1000) {
            this.price = price;
        }
    }

    public int getCalories() {
        return this.calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String[] getIngredient() {
        return this.ingredient;
    }

    public void setIngredient(String[] ingredient) {
        this.ingredient = ingredient;
    }

    public int[] getIngredientQuantity() {
        return this.ingredientQuantity;
    }

    public void setIngredientQuantity(int[] ingredientQuantity) {
        this.ingredientQuantity = ingredientQuantity;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmountOfIngredient() {
        return this.amountOfIngredient;
    }

    public void setAmountOfIngredient(int amountOfIngredient) {
        this.amountOfIngredient = amountOfIngredient;
    }

    @Override
    public String toString() {
        return getName() + " " + getPrice();
    }

}