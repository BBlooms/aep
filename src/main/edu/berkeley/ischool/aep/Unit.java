package edu.berkeley.ischool.aep;

/**
 * Created by sonali on 2/14/14.
 *
 *
 1 TBSP = 3 TSP
 1 OZ = 2 TBSP
 8 OZ = 1 CUP
 */
//Understands how to convert between
public class Unit {

    public enum unitType {LENGTH, VOLUME, TEMPERATURE};

    public static Unit FEET = new Unit(1,"Feet",unitType.LENGTH);
    public static Unit YARD = new Unit(3,"Yard",unitType.LENGTH);
    public static Unit MILES = new Unit(1760*3,"Miles",unitType.LENGTH);
    public static Unit TSP = new Unit(1,"TSP",unitType.VOLUME);
    public static Unit TBSP = new Unit(3,"TBSP",unitType.VOLUME);
    public static Unit OZ = new Unit(6 ,"OZ",unitType.VOLUME);
    public static Unit CUP = new Unit(48 ,"CUP",unitType.VOLUME);
    public static Unit INCHES = new Unit(1/12,"Inches",unitType.LENGTH);
    public static Unit CELSIUS = new Unit(1, "Celsius", unitType.TEMPERATURE);
    public static Unit FAHRENHEIT = new Unit(1, "Fahrenheit", unitType.TEMPERATURE);

    private final double conversionFactor;
    private final String name;
    private final unitType type;


    public Unit(double inBaseUnits , String name, unitType type)
    {
        this.conversionFactor = inBaseUnits;
        this.name=name;
        this.type= type;
    }
    public boolean isConvertible(Unit unit)
    {
        if (unit.type.equals(this.type))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString(){
        return name;
    }

    public double convertTo(double size, Unit otherUnit)
    {
        return size*conversionFactor/otherUnit.conversionFactor;
        // do the conversion here
    }


}