public abstract class Bird extends Animal {
    protected int wings, legs, beak;

    public Bird(String name){
        this(name,4);//tidak error, karena memanggil konstruktor dibawahnya
    }

    public Bird(String name, int weight){
        super(name, weight);
        this.wings = this.legs =2;
        this.beak=1;
    }

    public String move(){
        return this.name+" is flying";
    }
}
