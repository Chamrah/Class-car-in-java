public class Main{
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.nameCar = "BMW";
        car1.speed = 360;
        car1.color ="Red";
// Presentation of the car
        System.out.println(car1.nameCar);
        System.out.println(car1.nameCar +" have "+ car1.speed+ " KM/H in speed");
        System.out.println(car1.nameCar +" have a color "+ car1.color);
// Method to do in this car
        car1.Turn();
        car1.Accelerate();
        car1.boost();
        car1.brake();






    }
}