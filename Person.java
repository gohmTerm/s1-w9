public class Person {
    public double height;

    public Person(int tallness){
        height = tallness;
    }

    public boolean equals(Person other){
        return this.height == other.height;
    }
}
