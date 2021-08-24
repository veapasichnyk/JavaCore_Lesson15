import java.util.Scanner;

public class Main {

    static void menu () {
        System.out.println();
        System.out.println("Enter 1 to add Person to the ZooClub " +
                           "\nEnter 2 to add Pet to the ZooClub member " +
                           "\nEnter 3 to remove the pet from the owner " +
                           "\nEnter 4 to remove the Person from the ZooClub" +
                           "\nEnter 5 to remove the some type of pet from the all owners" +
                           " \nEnter 6 to print all the ZooClub" +
                           "\nEnter 7 to exit the program" );
    }

    public static void main ( String[] args) {

        ZooClub zooClub = new ZooClub ();
        Scanner scanner = new Scanner ( System.in );

        while (true) {
            menu();

            switch (scanner.nextInt()) {

                case 1: {
                    MyMethods.addPerson ( zooClub );
                    break;
                }

                case 2: {
                    MyMethods.addPet ( zooClub );
                    break;
                }

                case 3: {
                    MyMethods.removePetFromOwner ( zooClub );
                    break;
                }

                case 4: {
                    MyMethods.removeOwnerFromZooClub ( zooClub );
                    break;
                }

                case 5: {
                    MyMethods.removePetFromAllOwners ( zooClub );
                    break;
                }

                case 6: {
                    MyMethods.printZooClub ( zooClub );
                    break;
                }

                case 7: {
                    System.exit(0);
                    break;
                }

                default: {
                    System.out.println("Enter a number from 1 to 7.");
                    break;
                }
            }
        }

    }
}
