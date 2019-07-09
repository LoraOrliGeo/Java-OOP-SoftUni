package Encapsulation.P01_Box;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    private void setLength(double length) {
        validateValue("Length", length);
        this.length = length;
    }

    private void setWidth(double width) {
        validateValue("Width", width);
        this.width = width;
    }

    private void setHeight(double height) {
        validateValue("Height", height);
        this.height = height;
    }

    private void validateValue(String arg, double value) {
        if (value <= 0) {
            throw new IllegalArgumentException(arg + " cannot be zero or negative.");
        }
    }

    public double calculateSurfaceArea() {
        // 2lw + 2lh + 2wh
        double surfaceArea = 2 * this.getLength() * this.getWidth() +
                2 * this.getLength() * this.getHeight() +
                2 * this.getWidth() * this.getHeight();
        return surfaceArea;
    }

    public double calculateLateralSurfaceArea() {
        // 2lh + 2wh
        double lateralSurfaceArea = 2 * this.getLength() * this.getHeight() + 2 * this.getWidth() * this.getHeight();
        return lateralSurfaceArea;
    }

    public double calculateVolume() {
        // lwh
        double volume = this.getLength() * this.getWidth() * this.getHeight();
        return volume;
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f\n" +
                        "Lateral Surface Area - %.2f\n" +
                        "Volume – %.2f\n",
                this.calculateSurfaceArea(),
                this.calculateLateralSurfaceArea(),
                this.calculateVolume());
    }
}