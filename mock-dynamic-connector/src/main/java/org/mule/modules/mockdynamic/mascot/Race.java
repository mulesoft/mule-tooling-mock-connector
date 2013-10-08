package org.mule.modules.mockdynamic.mascot;

public class Race {

    public Race(String string) {
        setName(string);
    }

    private String name;

    private Race bestMatchRace;

    private Breeder seller;

    public void setBreeder(Breeder breeder) {
        this.seller = breeder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Race getBestMatchRace() {
        return bestMatchRace;
    }

    public void setBestMatchRace(Race bestMatchRace) {
        this.bestMatchRace = bestMatchRace;
    }

    public Breeder getBreeder() {
        return seller;
    }

}
