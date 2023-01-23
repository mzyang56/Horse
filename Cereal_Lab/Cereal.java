public class Cereal {
    private String name;
    private double calories;
    private double sugar;
    private double protein;
    
    Cereal(String name, double calories, double sugar, double protein) {
       this.name = name;
       this.calories = calories;
       this.sugar = sugar;
       this.protein = protein;
    }

    public String getName() { 
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public double getSugar() {
        return sugar;
    }

    public double getProtein() {
        return protein;
    }

    public String toString() {
       return ("Name: " + name + " Calories: " + calories + " Sugar: " + sugar + " Protein: " + protein + ".");
    }

}
