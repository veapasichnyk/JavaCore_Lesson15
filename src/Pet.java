import java.util.Objects;

public class Pet {
    String typeOfPet;
    String name;

    public Pet ( String typeOfPet, String name ) {
        this.typeOfPet = typeOfPet;
        this.name = name;
    }

    public void setTypeOfPet ( String typeOfPet ) {
        this.typeOfPet = typeOfPet;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getTypeOfPet ( ) {
        return typeOfPet;
    }

    public String getName ( ) {
        return name;
    }

    @Override
    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass ( ) != o.getClass ( ) ) return false;
        Pet pet = (Pet) o;
        return Objects.equals ( typeOfPet , pet.typeOfPet ) && Objects.equals ( name , pet.name );
    }

    @Override
    public int hashCode ( ) {
        return Objects.hash ( typeOfPet , name );
    }

    @Override
    public String toString ( ) {
        return "Pet{" +
               "typeOfPet='" + typeOfPet + '\'' +
               ", name='" + name + '\'' +
               '}';
    }
}
