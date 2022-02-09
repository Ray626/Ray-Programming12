import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Planet planet1 = new GasPlanet(5,"one",true, Color.cyan);
        RockPlanet planet2 = new RockPlanet(4,"two",true);
        Planet planet3 = new RockPlanet(4,"two",true);
        Planet planet4 = new Planet(4,"one");
        Moon moon = new Moon(planet1, 5 ,true, "APTX-4869");



        planet1.addMoons(moon);
        System.out.println(planet1);
        System.out.println(planet2);
        System.out.println(planet2.equals(planet1));
        System.out.println(planet3.equals(planet2));
        System.out.println(planet1.equals(planet4));
        System.out.println(moon);


    }


}
