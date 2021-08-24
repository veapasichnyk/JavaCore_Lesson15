import java.util.*;

public class ZooClub {

    Map <Person, List <Pet>> map = new HashMap<>() ;

    public ZooClub() {

    }


    public Map<Person, List<Pet>> getMap() {
        return map;
    }


    public void setMap(Map<Person, List<Pet>> map) {
        this.map = map;
    }
}
