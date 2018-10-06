package chengang.com.chapter2;

/**
 * Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves. Provide methods to
 * drive by a given number of miles, to add a given number of gallons to the gas tank, and to get the current distance
 * from the origin and fuel level. Specify the fuel efficiency (in miles/gallons) in the constructor. Should this be an
 * immutable class? Why or why not?
 */
public class Ex9 {
    class Car {
        private double oddmeter, gasTank, mpg;

        Car(double odometer, double gasTank, double mpg) {
            this.oddmeter = odometer;
            this.gasTank = gasTank;
            this.mpg = mpg;
        }

        void drive(double miles) {
            if (miles / 100D * this.mpg >= gasTank) {
                this.oddmeter += this.gasTank * mpg;
                this.gasTank = 0;
            } else {
                this.oddmeter += miles;
                gasTank -= miles / 100D * mpg;
            }
        }

        void addGas(double gallons) {
            gasTank += gallons;
        }

        double distanceFromOrigin() {
            return this.oddmeter;
        }

        double distanceToDrive() {
            return gasTank * mpg;
        }

        @Override
        public String toString() {
            return String.format("oddmeter: %.4f, gasTank: %.4f, distanceToDrive: %.4f",
                    distanceFromOrigin(), gasTank, distanceToDrive());
        }
    }

    public static void main(String[] args) {
        Ex9 ex9 = new Ex9();
        Ex9.Car car = ex9.new Car(0D, 0D, 10D);
        System.out.println(car);
        car.addGas(50D);
        System.out.println(car);
        car.drive(10D);
        System.out.println(car);
        car.addGas(41.1);
        System.out.println(car);
        car.drive(2000);
        System.out.println(car);

    }
}

