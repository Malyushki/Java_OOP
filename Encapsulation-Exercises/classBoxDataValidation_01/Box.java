package classBoxDataValidation_01;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }


    public double calculateSurfaceArea() {
        //Surface Area = 2lw + 2lh + 2wh
        return 2 * this.length * this.width + 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public double calculateLateralSurfaceArea() {
        //Lateral Surface Area = 2lh + 2wh
        return 2 * this.length * this.height + 2 * this.width * this.height;
    }

    public double calculateVolume() {
        //Volume = lwh
        return this.length * this.width * this.height;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //Surface Area - 52.00
        //Lateral Surface Area - 40.00
        //Volume – 24.00
        //String.format("%.2f",calculateVolume())

        sb.append("Surface Area - ").append(String.format("%.2f",calculateSurfaceArea())).append(System.lineSeparator());
        sb.append("Lateral Surface Area - ").append(String.format("%.2f",calculateLateralSurfaceArea())).append(System.lineSeparator());
        sb.append("Volume - ").append(String.format("%.2f",calculateVolume())).append(System.lineSeparator());

        return sb.toString().trim();
    }
}
