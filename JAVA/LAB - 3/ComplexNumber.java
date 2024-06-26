public class ComplexNumber {
    private double real;
    private double imaginary;

    // Default constructor
    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    // Overloaded constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Getter method for the real part
    public double getReal() {
        return real;
    }

    // Getter method for the imaginary part
    public double getImaginary() {
        return imaginary;
    }

    // Main method for testing the ComplexNumber class
    public static void main(String[] args) {
        // Create complex numbers
        ComplexNumber complex1 = new ComplexNumber(2.0, 3.0);
        ComplexNumber complex2 = new ComplexNumber(1.0, -2.0);

        // Add two complex numbers
        ComplexNumber result = complex1.add(complex2);

        // Display the result
        System.out.println("Result: " + result.getReal() + " + " + result.getImaginary() + "i");
    }
}
