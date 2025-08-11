package project2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Car extends Vehicle implements Insurance {



 public Car(String brand, String color, int year, float price){

    super(brand,color,year,price);
 }

 @Override
 public String toString()
 {
    return "Brand: " + getBrand() +
    ", Color: " + getColor() +
    ", Year: " + getYear() +
    ", Price: $" + getPrice();
 }


 @Override
 public void dispDetails()
 {
    System.out.println("Car Details are " + toString());
 }

 @Override
 public float calculateInsurance(float price, int year) {
     int currentYear = java.time.Year.now().getValue();
     int age = currentYear - year;
 
     float rate;
 
     if (age <= 1) {
         rate = 0.10f; // 10% for new cars
     } else if (age <= 3) {
         rate = 0.08f; // 8% for relatively new cars
     } else {
         rate = 0.05f; // 5% for older cars
     }
 
     return price * rate;
 }


 @Override

 public void importVehicles()
 {
    String fileName="vehicle.txt";

    String vehicleData=toString();
try(
    FileWriter fw=new FileWriter(fileName,true);
    BufferedWriter bw=new BufferedWriter(fw);
    PrintWriter out=new PrintWriter(bw))

    {
    out.print(vehicleData);
    System.out.println("Vehicle imported to file.");
    }

    catch(IOException e)
    {
        System.out.println("Error Writing file " + e.getMessage());
    }

 }
 
    
}
