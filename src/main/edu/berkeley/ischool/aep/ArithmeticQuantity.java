package edu.berkeley.ischool.aep;

/**
 * Created by brianbloomer on 2/21/14.
 */
public class ArithmeticQuantity extends ScaledQuantity {

    public ArithmeticQuantity(Unit unit, double value){
        super(value, unit);
        //        this.type = QuantityType.valueOf(this.unit.GetQuantityType());
    }


    public ScaledQuantity add(ScaledQuantity otherQuantity) {

        if (this.unit.isConvertibleTo(otherQuantity.unit)) {
            double otherValue = otherQuantity.unit.convertTo(otherQuantity.value, this.unit);
            return new ArithmeticQuantity(this.unit, this.value + otherValue);
        }
        else {
            throw new RuntimeException("Cannot add " + this.unit + " with " + otherQuantity.unit);
        }
    }

}