package L03ValidationData;

public class Person {
        private String firstName;
        private String lastName;
        private int age;
        private double salary;

        public Person(String firstName, String lastName, int age, double salary){
            this.firstName = firstName;
            this.lastName = lastName;
                    this.setAge(age);
                    this.setSalary(salary);
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonusPercentage){
            double baseBonus = this.getSalary() * bonusPercentage/100;
            if(this.getAge() < 30){
                this.setSalary(this.getSalary()+baseBonus/2);
            }
            else {
                this.setSalary(this.getSalary() + baseBonus);
            }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva",
                this.firstName,this.lastName,this.salary);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age){
            if (age<=0){
                throw new IllegalArgumentException("Age cannot be zero or negative integer");
            }
            this.age = age;
    }
}
