public class Parrot extends Bird{
    protected int words;
    public Parrot(String name){
        super(name);
        this.name=name;
        this.words=2;
    }

    public String eat(){
        return this.name+" eats fruits";
    }

    public String talk(){
        return this.name+" is talking to you";
    }
}
