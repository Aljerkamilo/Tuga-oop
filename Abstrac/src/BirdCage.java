public class BirdCage extends Cage{
    protected final int MAXSIZE =20;
    protected Bird[] birds;
    // protected Parrot[] parrots;//menyimpan banyak parrot
    // protected Eagle[] eagles;//menyimpan banyak eagle
    protected int height, numBird;//inisialisasi =0
    //numEagles dan numParrots diinisialisasi = 0

    public BirdCage(){//kontruktor 1
        this(10);//height itu untuk apa?
    }

    public BirdCage(int height){//kontruktor 2
        this.height=height;
        this.birds= new Bird[MAXSIZE];
        // this.parrots=new Parrot[MAXSIZE];//inisialisasi array parrots
        // this.eagles= new Eagle[MAXSIZE];//inisialisasi array eagles
    }

    public boolean addBird(Bird b){
        if(this.numBird>=this.MAXSIZE){//knp ini >=? knp ngga > aja?
            return false;
        }else{
            this.birds[this.numBird++]=b;
            return true;
        }
    }

    // public boolean addEagle(Eagle a){
    //     if(this.numEagles>=this.MAXSIZE){
    //         return false;
    //     }else{
    //         this.eagles[this.numEagles++] =a;
    //         return true;
    //     }
    // }

    // public boolean addParrot(Parrot p){
    //     if(this.numParrots>=this.MAXSIZE){
    //         return false;
    //     }else{
    //         this.parrots[this.numParrots++]=p;
    //         return true;
    //     }
    // }

    public String doMoveBird(){
        String res = new String();
        for(Bird bird: this.birds){
            if(bird!=null){
                res = res+bird.move()+"\n";
            }
        }
        return res;
    }
    // public String doMoveEagles(){
    //     String res = new String ();
    //     for(Eagle a: this.eagles){
    //         if(a!=null){
    //             res = res+ a.move()+"\n";
    //         }
    //     }
    //     return res;
    // }

    // public String doMoveParrots(){
    //     String res = new String();
    //     for(Parrot p: this.parrots){
    //         if(p!=null){
    //             res = res+p.move()+"\n";
    //         }
    //     }
    //     return res;
    // }

    public String doEatBird(){
        String res = new String();
        for(Bird newB: this.birds ){
            if(newB!=null){
                res = res+newB.eat()+"\n";
            }
        }
        return res;
    }

    // public String doEatEagles(){
    //     String res = new String();
    //     for(Eagle a: this.eagles){
    //         if(a!=null){
    //             res=res+a.eat()+"/n";
    //         }
    //     }
    //     return res;
    // }

    // public String doEatParrots(){
    //     String res = new String();
    //     for(Parrot p: this.parrots){
    //         if(p!=null){
    //             res=res+p.eat()+"/n";
    //         }
    //     }
    //     return res;
    // }
}
