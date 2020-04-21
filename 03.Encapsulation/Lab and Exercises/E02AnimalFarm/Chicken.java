package E02AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty() || name.length()<1 ){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age <=0 || age > 15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private double calculateProductPerDay(){
        if (this.age <=5){
            return 2;
        }
        else if (this.age <=11){
            return 1;
        }
        else {
            return 0.75;
        }
    }

    public double productPerDay(){
        return this.calculateProductPerDay();
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",
                this.name,
                this.age,
                this.productPerDay());
    }
}
