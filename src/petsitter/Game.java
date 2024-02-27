package petsitter;

import java.util.Scanner;

public class Game {

    public void Start() {

        Scanner scan = new Scanner(System.in);
        int action = 0;
        Dog myDog = null;

        System.out.println("~~WELCOME TO PETSITTER~~");

        do {
            System.out.println("\n\n--MENU--");
            System.out.println("1. Buy Pet");
            System.out.println("2. play with Pet");
            System.out.println("3. Train Pet");
            System.out.println("4. Bath Pet");
            System.out.println("5. Feed Pet");
            System.out.println("6. Let Pet Sleep");
            System.out.println("7. Sell Pet");
            System.out.println("8. Show Pet Status");
            System.out.println("9. Exit");
            System.out.print("Choose you action: ");
            action = scan.nextInt();
            System.out.println("");

            if (myDog == null) {
                switch (action) {
                    case 1:
                        System.out.print("Enter your pet's name: ");
                        String username = scan.next() + scan.nextLine();
                        myDog = new Dog(username);
                        System.out.println("Hai, " + myDog.getName());
                        break;
                    case 9:
                        System.out.println("~~THANK YOU FOR PLAYING PETSITTER~~");
                        break;
                    default:
                        System.out.println("Please buy a pet first before");
                        break;
                }
            } else {
                switch (action) {
                    case 1:
                        System.out.println("You already have " + myDog.getName());
                        break;
                    case 2:
                        System.out.println(myDog.getName() + " is playing");
                        myDog.play();
                        myDog.showStatus();
                        if (!myDog.isAlive()) {
                            System.out.println(myDog.getName() + " dead");
                            myDog = null;
                        }
                        break;
                    case 3:
                        System.out.println(myDog.getName() + " trained " );
                        myDog.train();
                        myDog.showStatus();
                        if (!myDog.isAlive()) {
                            System.out.println(myDog.getName() + " dead");
                            myDog = null;
                        }
                        break;
                    case 4:
                        System.out.println(myDog.getName() + " bathed " );
                        myDog.bath();
                        myDog.showStatus();
                        if (!myDog.isAlive()) {
                            System.out.println(myDog.getName() + " dead");
                            myDog = null;
                        }
                        break;
                    case 5:
                        System.out.println(myDog.getName() + " feed " );
                        myDog.feed();
                        myDog.showStatus();
                        if (!myDog.isAlive()) {
                            System.out.println(myDog.getName() + " dead");
                            myDog = null;
                        }
                        break;
                    case 6:
                        System.out.println(myDog.getName() + " is sleeping");
                        myDog.sleep();
                        myDog.showStatus();
                        if (!myDog.isAlive()) {
                            System.out.println(myDog.getName() + " dead");
                            myDog = null;
                        }
                        break;
                    case 7:
                        System.out.print("Would you like to sell " + myDog.getName() + "? [Y/N]");
                        char sell = scan.next().charAt(0);
                        if (sell == 'y' || sell == 'Y') {
                            myDog = null;
                            System.out.println("You sell your pet");
                        }
                        break;
                    case 8:
                        myDog.showStatus();
                        break;
                    case 9:
                        System.out.println("~~THANK YOU FOR PLAYING PETSITTER~~");
                        break;
                    default:
                        System.out.println("Action not available");
                        break;
                }
            }

        } while (action != 9);
    }
}
