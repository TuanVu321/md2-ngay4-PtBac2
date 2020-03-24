import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public void getter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao a");
        this.a = scanner.nextDouble();
        System.out.println("Nhap vao b");
        this.b = scanner.nextDouble();
        System.out.println("Nhap vao c");
        this.c = scanner.nextDouble();
    }

    public double getDiscriminant() {
        return (this.b * this.b - 4 * this.a * this.c);
    }

    public double getRoot1() {
        return (-this.b + Math.pow((this.b * this.b - (4 * this.a * this.c)), 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow((this.b * this.b - (4 * this.a * this.c)), 0.5)) / (2 * this.a);
    }
}
