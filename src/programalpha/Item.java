package programalpha;

//Date is imported
import java.util.Date;

/* Programmer name: Flornaldine Pierre

Date: 9/29/2018
Oracle Project with interface enum and class

 */

public interface Item {

  final String manufacturer = "OracleProduction";


  static void setProdcutionNumber(int num) {

    Product.currentProductionNumber = num;

  }

  static void setName(String name1) {

    Product.name = name1;

  }
  static String getName() {

    return Product.name;

  }

  static Date getManufactureDate() {

    return Product.manufacturedOn;

  }

  static int getSerialNumber(){

    return Product.SerialNumber;

  }




}

abstract class Product implements Item {


  //Constructer sets name with given parameter
  public Product(String name2) {

    this.name = name2;

  }


  static int SerialNumber;
  String manufacturer;
  //Current date and time is found
  static Date manufacturedOn = new Date();
  static String name;
  static Integer currentProductionNumber;
  //Method takes variable parameters and returns string
  public String toString(){

    return "Manufacturer: " + manufacturer +
        "Serial Number: " + Product.SerialNumber+
        "Date:"+ Product.manufacturedOn+
        "Name:"+ Product.name;


  }



}