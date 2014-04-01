package edu.berkeley.ischool.aep;

/**
 * Created by galahad on 1/31/14.
 */
public class Chance
{
    private double probability;
    public Chance(double p){
        probability=p;
    }
    public Chance not(){
        return new Chance(1-probability);
    }
    public Chance and(Chance other){
        return new Chance(this.probability*other.probability);
    }
    public Chance or (Chance other){
        return (this.not().and(other.not())).not();
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) return true;
        if(!(other instanceof Chance)) return false;
        if(this.probability==((Chance)other).probability)
            return true;
        else
            return false;
    }
    @Override
    public int hashCode(){
        long longBits=Double.doubleToLongBits(probability);
        return (int) (longBits ^ (longBits >>> 32));
    }
    @Override
    public String toString() {
        return "value " + probability;
    }


}
