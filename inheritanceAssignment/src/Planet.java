import java.util.ArrayList;
import java.util.Arrays;

public class Planet {
    private int orbitTime;
    private ArrayList<Moon> moons;
    private String designation;

    public Planet(int orbitTime,  String designation) {
        this.orbitTime = orbitTime;
        this.moons = new ArrayList<>();
        this.designation = designation;
    }

    public Planet() {
        this.orbitTime = 0;
        this.moons = new ArrayList<>();
        this.designation = "default";

    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public ArrayList<Moon> addMoons() {
        return moons;
    }

    public void addMoons(Moon moon) {
        this.moons.add(moon);
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public boolean equals(Object obj){
        if(obj instanceof Planet other){
            return this.designation.equals(other.designation);
        }else{
            return false;
        }
    }
    @Override
    public String toString(){
        return orbitTime  + designation  ;
    }
}
