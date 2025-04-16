package labCountry;

public class CountryTest {
    public static void main(String[] args) {
        Continent myContinent = Continent.NORTH_AMERICA;
        Continent europe = Continent.EUROPE;

        Country country1 = new Country("USA", myContinent);
        Country country2 = new Country("Austria", europe);

        System.out.printf("MyContinent: %s%n", myContinent);
        System.out.printf("Country1: %s (%s)%n", country1.getName(), country1.getContinent());
        System.out.printf("Country2: %s (%s)%n", country2.getName(), country2.getContinent());
    }
}
