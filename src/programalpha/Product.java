package programalpha;

import java.util.Date;

abstract class Product implements Item {


  //Constructer sets name with given parameter
  public Product(String name2) {

    this.name = name2;

  }


  private static String manufacturer = Product.manufacturer;
  //Current date and time is found
  static Date manufacturedOn = new Date();
  static String name;
  static Integer currentProductionNumber = 1;
  static int SerialNumber = currentProductionNumber++;

  //Method takes variable parameters and returns string
  public String toString() {

    return "Manufacturer: " + manufacturer +
        "Serial Number: " + Product.SerialNumber +
        "Date:" + Product.manufacturedOn +
        "Name:" + Product.name;


  }
}
