import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Regression rg = new Regression();
        
        Cereal AB = new Cereal("All-Bran",70,5,4);
        Cereal AD = new Cereal("Almond Delight",110,8,2);
        Cereal AJ = new Cereal("Apple Jacks",110,14,2);
        Cereal BF = new Cereal("Bran Flakes",90,5,3);
        Cereal CC = new Cereal("Corn Chex",110,3,2);

        ArrayList<Double> calories = new ArrayList<Double>();
        calories.add(AB.getCalories());
        calories.add(AD.getCalories());
        calories.add(AJ.getCalories());
        calories.add(BF.getCalories());
        calories.add(CC.getCalories());

        ArrayList<Double> sugar = new ArrayList<Double>();
        sugar.add(AB.getSugar());
        sugar.add(AD.getSugar());
        sugar.add(AJ.getSugar());
        sugar.add(BF.getSugar());
        sugar.add(CC.getSugar());

        ArrayList<Double> protein = new ArrayList<Double>();
        protein.add(AB.getProtein());
        protein.add(AD.getProtein());
        protein.add(AJ.getProtein());
        protein.add(BF.getProtein());
        protein.add(CC.getProtein());
        
        System.out.println("Cereal Inputted:");
        System.out.println(AB.toString());
        System.out.println(AD.toString());
        System.out.println(AJ.toString());
        System.out.println(BF.toString());
        System.out.println(CC.toString());

        //finds r-value for correlation between sugar and calories
        System.out.println("Calories/Sugar r-value is: " + rg.runRegression(sugar, calories));
        //finds r-value for correlation between sugar and protein
        System.out.println("Protein/Sugar r-value is: " + rg.runRegression(sugar, protein));


    }
}
