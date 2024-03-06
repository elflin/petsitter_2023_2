package petsitter;

import java.util.Scanner;

public class Game {

    private Player player;

    public void play() {
        player = new Player();
        int pilih = 0;
        Dog chosenDog = null;

        System.out.println("LET's PLAY!!");
        while (pilih < 10) {
            System.out.println("What you wanna do");
            System.out.println("1. Buy A odg");
            System.out.println("2. Sell A Dog");
            System.out.println("3. Change Dog");
            System.out.println("4. Play with Dog");
            System.out.println("5. Train the Dog");
            System.out.println("6. Feed the Dog");
            System.out.println("7. Bath the Dog");
            System.out.println("8. Let The Dog Sleep");
            System.out.println("9. Show Dog's Status");
            System.out.println("10.Exit");
            System.out.print("Your Answer :");
            Scanner s = new Scanner(System.in);
            pilih = s.nextInt();

            boolean isValid = true;
            if (pilih > 1 && pilih < 10) {
                if (player.getPetsNumber() == 0) {
                    System.out.println("You must buy a dog first!!");
                    isValid = false;
                }
            }

            if (isValid) {
                switch (pilih) {
                    case 1:
                        System.out.println("What's your dog's name ?");
                        String name = s.next() + s.nextLine();
                        Dog newDog = new Dog(name);
                        player.buyADog(newDog);
                        System.out.println("You have buy a dog named " + newDog.getName());
                        chosenDog = newDog;
                        break;
                    case 2:
                        if (chosenDog != null) {
                            player.sellADog(chosenDog);
                            System.out.println("You have sold a dog named " + chosenDog.getName());
                            chosenDog = null;
                        } else {
                            System.out.println("Choose a dog first!!");
                        }
                        break;
                    case 3:
                        player.showPetsNames();
                        System.out.println("Choose the number");
                        int nomor = s.nextInt();
                        chosenDog = player.getADog(nomor);
                        System.out.println("You are now interacting wih " + chosenDog.getName());
                        break;
                    case 4:
                        if (chosenDog != null) {
                            chosenDog.play();
                        } else {
                            System.out.println("Choose a dog first");
                        }
                        break;
                    case 5:
                        if (chosenDog != null) {
                            chosenDog.train();
                        } else {
                            System.out.println("Choose a dog first");
                        }
                        break;
                    case 6:
                        if (chosenDog != null) {
                            chosenDog.eat();
                            player.decreaseFoogStock(chosenDog.getFoodAmount());
                        } else {
                            System.out.println("Choose a dog first");
                        }
                        break;
                    case 7:
                        if (chosenDog != null) {
                            chosenDog.bath();
                        } else {
                            System.out.println("Choose a dog first");
                        }
                        break;
                    case 8:
                        if (chosenDog != null) {
                            chosenDog.sleep();
                        } else {
                            System.out.println("Choose a dog first");
                        }
                        break;
                    case 9:
                        if (chosenDog != null) {
                            chosenDog.showStatus();
                        } else {
                            System.out.println("Choose a dog first");
                        }
                        break;

                }
                System.out.println("");
                System.out.println("======END OF ROUND========");
                System.out.println("");
            }
        }

    }
}
