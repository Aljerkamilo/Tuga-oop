public class Tester{
    public static void main(String[] args) {
        //polymorphism
        //kemampuan objejk untuk merespon terhadap method tertentu/attribut, dengan nama yang sama
        //dalam cara kelas spesifiknya sendiri

        //polymorphism: multiple forms
        //cuman bisa reference type
        //Bird p = new Parrot();
        //reference alias Bird harus superclass dari object typenya
        //karena ga logis kalo assignning superclass ke subclassnya
        //upcasting, downcasting
        BirdCage bc = new BirdCage();
        Eagle eagle;
        Parrot parrot;
        boolean res;//bikin res boolean biar bisa diisi sama addEagle
        //method add juga return type nya boolean biar bisa diisi gampang di tester 

        System.out.println("Adding birds : ...");
        for(int i=1;i<=3;i++){
            eagle = new Eagle("Eagle no "+i);
            res= bc.addBird(eagle);
            System.out.println("Adding an eagle :"+eagle.name+" "+res);

            parrot = new Parrot("Parrot no "+i);
            res=bc.addBird(parrot);
            System.out.println("Adding a parrot :"+parrot.name+" "+res);

        }

        System.out.println("\nMoving :");
        System.out.println("All Eagles moving : ");
        System.out.println(bc.doMoveBird());
        System.out.println("Eating : ");
        System.out.println(bc.doEatBird());

        // Bird bird1 = new Parrot("P4rr0t");
        // Bird bird2 = new Eagle("E4gl3");
        // System.out.println("Birds eating: ");
        // System.out.println(bird1.eat());//jadi bisa pake methodnya Parrot karena objeknya Parrot dan karena bird punya method eat
        // System.out.println(bird2.eat());

        // Animal animal1 = new Parrot("Parrot");
        // Animal animal2 = new Eagle("Eagle");
        // System.out.println("\nAnimal eating : ");
        // System.out.println(animal1.eat());
        // System.out.println(animal2.eat());

        // Animal animal = new Parrot("Parrot1");
        // Bird bird = new Parrot("Parrot2");
        // Parrot parrot = new Parrot("Parrot3");
        // System.out.println("\nAnimals talking : ");
        // // System.out.println(animal.talk());//errot karena animal gapunya method talk
        // // System.out.println(bird.talk());
        // System.out.println(parrot.talk());

        // // Parrot p1 = new Animal();
        // // Parrot p2 = new Bird();

        // //Casting
        // //upcasting
        // // convert dari subclass ke superclass
        // Parrot p = new Parrot("Cecep");
        // Animal a = (Animal) p;//upcasting

        // Animal k = new Parrot("Coco");//automatic upcasting
        // Animal j =p;//automatic upcasting

        // //upcasting = membuat propertiesnya unavailable, sampai objek tersebut di downcast lagi

        // Parrot p1 = new Parrot("Alex");
        // System.out.println("Alex's (Parrot) activities : ");
        // System.out.println(p1.eat());
        // System.out.println(p1.move());
        // System.out.println(p1.talk());
        // System.out.println(p1.words);
        // System.out.println(p1.age);
        // Tester.addAge(p1);
        // System.out.println(p1.age);

        // Animal a = p1;//automatic casting
        // System.out.println("\nAlex's (Animal) activities : ");
        // System.out.println(a.eat());
        // System.out.println(a.move());
        // // System.out.println(a.talk());//error karena kelas animal tidak memiliki method method dan atau attribute ini
        // // System.out.println(a.words);
        // System.out.println(a.age);//agenya akan sama dengan p1 karena
        // // Tester.addAge(a.age);
        // System.out.println(a.age);


        // //downcasting: convert superclass ke subclass
        // Parrot k1 = new Parrot("contoh");
        // Animal c = k1;
        // Parrot k2 = (Parrot) a;//downcasting, 
        // //tapi downcasting tidak bisa seperti dibawah ini
        // //Animal k2 = new Animal();
        // //Parrot p = (Parrot) k2;
        // //jadi upcast dulu baru bisa di downcast
        // //downcasting itu manual -> di test pake instance of

    }
    
    public static void addAge(Bird b){
        b.age=b.age+1;
    }


}