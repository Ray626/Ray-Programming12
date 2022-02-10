import java.awt.*;

public class Main {
    public static void main(String[] args) {
        GasPlanet planet1 = new GasPlanet(4,"one",true, Color.cyan);
        RockPlanet planet2 = new RockPlanet(4,"two",true);
        RockPlanet planet3 = new RockPlanet(4,"one",true);
        Planet planet4 = new Planet(4,"two");
        Moon moon1 = new Moon(planet1, 5 ,true, "APTX-4869");
        Moon moon2 = new Moon(planet1, 5 ,true, "APTX-4870");





        planet1.addMoons(moon1);
        System.out.println(planet1);
        System.out.println(planet2);
        System.out.println(planet2.equals(planet1));
        System.out.println(planet3.equals(planet2));
        System.out.println(planet3.equals(planet1));
        System.out.println(planet4.equals(planet2));
        System.out.println(moon1);
        System.out.println(moon1.equals(moon2));
        System.out.println(moon1.equals(planet1));


    }


}
