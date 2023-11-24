public class Eagle extends Bird{
    
    public Eagle(){
        super("Landroval");
    }

    public Eagle(String name){
        super(name);
    }

    public String eat(){
        return this.name+" eats meat";
    }

    public String attackWithClaws(){
        return this.name+" attacks with claws";
    }

    public String attackWithBeak(){
        return this.name+ " attacks with beak";
    }
}