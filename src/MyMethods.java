import java.util.*;

public class MyMethods {

    public static void addPerson ( ZooClub zc ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Enter name of Person" );
        String  nameOfPerson = scanner.next ( );
        Scanner scanner1     = new Scanner ( System.in );
        System.out.println ( "Enter age of Person" );
        int ageOfPerson = scanner1.nextInt ( );

        Person person = new Person ( nameOfPerson , ageOfPerson );
        zc.getMap ( ).put ( person , new ArrayList <Pet> ( ) );

    }

    public static void addPet ( ZooClub zc ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Enter type of Pet" );
        String  typeOfPet = scanner.next ( );
        Scanner scanner1  = new Scanner ( System.in );
        System.out.println ( "Enter name of Pet" );
        String nameOfPet = scanner1.next ( );

        Pet pet = new Pet ( typeOfPet , nameOfPet );

        Scanner scanner2 = new Scanner ( System.in );
        System.out.println ( "Enter name of Person" );
        String  nameOfPerson = scanner2.next ( );
        Scanner scanner3     = new Scanner ( System.in );
        System.out.println ( "Enter age of Person" );
        int ageOfPerson = scanner3.nextInt ( );

        Person owner = new Person ( nameOfPerson , ageOfPerson );

        Iterator <Map.Entry <Person, List <Pet>>> iterator = zc.getMap ( ).entrySet ( ).iterator ( );

        while (iterator.hasNext ( )) {
            Map.Entry <Person, List <Pet>> next = iterator.next ( );
            if ( next.getKey ( ).equals ( owner ) ) {
                List <Pet> value = next.getValue ( );
                value.add ( pet );
            } else {
                System.out.println ( "This owner is not in this ZooClub" );
            }

        }
    }

    public static void removePetFromOwner ( ZooClub zc ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Enter type of Pet" );
        String  typeOfPet = scanner.next ( );
        Scanner scanner1  = new Scanner ( System.in );
        System.out.println ( "Enter name of Pet" );
        String nameOfPet = scanner1.next ( );

        Pet pet = new Pet ( typeOfPet , nameOfPet );

        Scanner scanner2 = new Scanner ( System.in );
        System.out.println ( "Enter name of Person" );
        String  nameOfPerson = scanner2.next ( );
        Scanner scanner3     = new Scanner ( System.in );
        System.out.println ( "Enter age of Person" );
        int ageOfPerson = scanner3.nextInt ( );

        Person owner = new Person ( nameOfPerson , ageOfPerson );

        Iterator <Map.Entry <Person, List <Pet>>> iterator = zc.getMap ( ).entrySet ( ).iterator ( );

        while (iterator.hasNext ( )) {
            Map.Entry <Person, List <Pet>> next = iterator.next ( );
            if ( next.getKey ( ).equals ( owner ) ) {
                List <Pet> value = next.getValue ( );
                value.remove ( pet );
            }else {
                System.out.println ( "This pet is not in this owner" );
            }

        }
    }

    public static void removeOwnerFromZooClub ( ZooClub zc ) {
        Scanner scanner2 = new Scanner ( System.in );
        System.out.println ( "Enter name of Person" );
        String  nameOfPerson = scanner2.next ( );
        Scanner scanner3     = new Scanner ( System.in );
        System.out.println ( "Enter age of Person" );
        int ageOfPerson = scanner3.nextInt ( );

        Person owner = new Person ( nameOfPerson , ageOfPerson );

        zc.getMap ( ).remove ( owner );

        System.out.println ( "This " + owner + " was remove from this ZooClub " );
    }

    public static void removePetFromAllOwners ( ZooClub zc ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Enter type of Pet" );
        String typeOfPet = scanner.next ( );


        Iterator <Person> iterator = zc.getMap ( ).keySet ( ).iterator ( );
        while (iterator.hasNext ( )) {
            Person                                    owner     = iterator.next ( );
            Iterator <Map.Entry <Person, List <Pet>>> iterator2 = zc.getMap ( ).entrySet ( ).iterator ( );
            while (iterator2.hasNext ( )) {
                Map.Entry <Person, List <Pet>> next = iterator2.next ( );
                if ( next.getKey ( ).equals ( owner ) ) {
                    List <Pet>     value     = next.getValue ( );
                    Iterator <Pet> iterator3 = value.iterator ( );
                    if ( iterator3.next ( ).getTypeOfPet ( ).equals ( typeOfPet ) ) {
                        iterator3.remove ( );
                    }

                }

            }
        }
    }

    public static void printZooClub ( ZooClub zc ) {
        Set <Map.Entry <Person, List <Pet>>> zooClubMembers = zc.map.entrySet ( );
        for ( Map.Entry <Person, List <Pet>> entry : zooClubMembers ) {
            System.out.println ( "This owner " + entry.getKey ( ) + " has a " + entry.getValue ( ) );
        }

    }
}
