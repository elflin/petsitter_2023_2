package petsitter;

public class Main {
    public static void main(String[] args) {
//        LoginRegister lr = new LoginRegister();
//        lr.Menu();
        Dog doggy = new Dog("Doggy");
        doggy.train();
        doggy.showStatus();
        
        System.out.println("");
        SmartDog gary = new SmartDog("Gary");
        gary.train();
        gary.showStatus();
        
        System.out.println("");
        BeautyDog lia = new BeautyDog("Lia");
        lia.bath();
        lia.bath();
        lia.bath();
        lia.showStatus();
    }
}
