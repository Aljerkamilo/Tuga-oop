public abstract class Animal{
    protected String name;
    protected int age, weight;

    public Animal(String name, int weight){
        this.name=name;
        this.age = 1;
        this.weight=weight;
    }

    public abstract String move();
    public abstract String eat();
}