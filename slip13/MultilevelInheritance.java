class Continent {
    String continent;

    Continent(String continent) {
        this.continent = continent;
    }
}

class Country extends Continent {
    String country;

    Country(String country, String continent) {
        super(continent);
        this.country = country;
    }
}

class State extends Country {
    String state;
    String place;

    State(String state, String place, String country, String continent) {
        super(country, continent);
        this.state = state;
        this.place = place;
    }

    void display() {
        System.out.println("Place: " + place);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("Continent: " + continent);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        State s = new State("California", "Los Angeles", "USA", "North America");
        s.display();
    }
}
