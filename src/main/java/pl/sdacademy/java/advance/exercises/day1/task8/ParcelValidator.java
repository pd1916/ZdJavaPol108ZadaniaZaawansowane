package pl.sdacademy.java.advance.exercises.day1.task8;

public class ParcelValidator implements Validator{
    private static final int TOTAL_MAX_LENGTH = 300;
    private static final int SINGLE_MIN_LENGTH = 30;
    private static final float MAX_WEIGHT_FOR_EXPRESS = 15f;
    private static final float MAX_WEIGHT_FOR_NON_EXPRESS = 30f;

    @Override
    public boolean validate(Parcel input) {
        return isSumOfXYZCorrect(input)
                && isEachDimensionCorrect(input)
                && isWeightCorrect(input);
    }

    private boolean isSumOfXYZCorrect(Parcel input) {
        return input.getxLength() + input.getyLength() + input.getzLength() <= TOTAL_MAX_LENGTH;
    }

    private boolean isEachDimensionCorrect(Parcel input) {
        return input.getxLength() >= SINGLE_MIN_LENGTH
                && input.getyLength() >= SINGLE_MIN_LENGTH
                && input.getzLength() >= SINGLE_MIN_LENGTH;
    }

    private boolean isWeightCorrect(Parcel input) {
        return (input.isExpress() && input.getWeight() <= MAX_WEIGHT_FOR_EXPRESS)
                || (!input.isExpress() && input.getWeight() <= MAX_WEIGHT_FOR_NON_EXPRESS);
    }
}
