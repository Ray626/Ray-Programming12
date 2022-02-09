import java.util.ArrayList;
import java.util.List;

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

    public List<Moon> getMoons() {return moons;}

    public void addMoons(Moon moon) {
        this.moons.add(moon);
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Planet other){
            return this.designation.equals(other.designation);
        }else{
            return false;
        }
    }
    @Override
    public String toString(){
        if (moons.size() > 0){
            String moonsInfo = "";
            for (Moon moon : moons) {
                moonsInfo += moon.toString() + "; ";
            }
            return "Planet: "+ designation + ", orbit time:"+ orbitTime +", moons:" +moonsInfo ;
        }else{
            return "Planet: "+ designation + ", orbit time:"+ orbitTime;
        }

    }
}
