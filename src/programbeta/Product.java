package programbeta;

import java.util.Date;


abstract class Product implements Item, Comparable<Product>{


  //Constructor sets name with given parameter
   Product(String name) {

    setName(name);

  }
  static void setProdcutionNumber(int num) {

    Product.currentProductionNumber = num;

  }
// Method sets name of product class
  static void setName(String name1) {

    Product.name = name1;

  }
  //method to return name
  static String getName() {

    return Product.name;

  }
  //method to retrieve manufactured date
  static Date getManufactureDate() {

    return Product.manufacturedOn;

  }
  //method to retrieve serial number
  static int getSerialNumber(){

    return Product.SerialNumber;

  }


  private static String manufacturer = Item.manufacturer;
  //Current date and time is found
  static Date manufacturedOn = new Date();
  static String name = getName();
  static Integer currentProductionNumber = 1;
  static int SerialNumber;



  //Method takes variable parameters and returns string
  public String toString() {
    SerialNumber = currentProductionNumber++;
    return "Manufacturer: " + manufacturer + "\n"+
        "Serial Number: " + getSerialNumber() + "\n"+
        "Date:" + getManufactureDate() + "\n"+
        "Name:" + getName();


  }
}
