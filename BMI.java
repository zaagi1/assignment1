public class BMI {
    // Data fields
    private String name;
    private int age;
    private double weight; // in pounds
    private double height; // in inches

    // Constructor with all fields
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // Constructor with default age = 20
    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    // Method to calculate BMI
    public double getBMI() {
        double bmi = (weight * 703) / (height * height);
        return Math.round(bmi * 100.0) / 100.0; // Round to 2 decimal places
    }

    // Method to return BMI status
    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
class BMITest {

    public static void main(String[] args) {

        // Create BMI object using the first constructor
        BMI person1 = new BMI("Abdirizak", 21, 150, 68);

        System.out.println("===== PERSON 1 =====");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Weight: " + person1.getWeight() + " pounds");
        System.out.println("Height: " + person1.getHeight() + " inches");
        System.out.println("BMI: " + person1.getBMI());
        System.out.println("Status: " + person1.getStatus());

        System.out.println();

        // Create BMI object using the second constructor
        // Age will automatically be 20
        BMI person2 = new BMI("Ahmed", 180, 70);

        System.out.println("===== PERSON 2 =====");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Weight: " + person2.getWeight() + " pounds");
        System.out.println("Height: " + person2.getHeight() + " inches");
        System.out.println("BMI: " + person2.getBMI());
        System.out.println("Status: " + person2.getStatus());
    }
}