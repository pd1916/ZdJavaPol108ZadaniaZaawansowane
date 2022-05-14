package pl.sdacademy.java.advance.exercises.day2.task20_21_22;

public class Cube extends Shape3D{
    private final float a;

    public Cube(float a) {
        this.a = a;
    }

    @Override
    float calculatePerimeter() {
        return 12 * a;
    }

    @Override
    float calculateVolume() {
        return (float)Math.pow(a, 3);
    }

    @Override
    public int fill(float volume) {
        float maxVolume = calculateVolume();
        return Float.compare(volume, calculateVolume());
//        if(maxVolume == volume) {
//            return 0;
//        } else if(maxVolume > volume) {
//            return -1; //wlano za mało wody
//        } else {
//            return 1; //wlano za dużo wody
//        }
    }
}
