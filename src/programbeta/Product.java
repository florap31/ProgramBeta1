package programbeta;

import java.util.Date;


abstract class Product implements Item, Comparable<Product>{


  //Constructor sets name with given parameter
   Product(String name) {

    setName(name);

  }
  public void setProductionNumber(int num) {

    this.currentProductionNumber = num;

  }
// Method sets name of product class
  public void setName(String name1) {

    this.name = name1;

  }
  //method to return name
  public String getName() {

    return this.name;

  }
  //method to retrieve manufactured date
  public Date getManufactureDate() {

    return this.manufacturedOn;

  }
  //method to retrieve serial number
  public int getSerialNumber(){

    return serialNumber;

  }

  String name;
  String manufacturer = Item.manufacturer;
  //Current date and time is found
  Date manufacturedOn = new Date();
  static Integer currentProductionNumber = 1;
  int serialNumber;



  //Method takes variable parameters and returns string
  public String toString() {
    serialNumber = currentProductionNumber++;
    return "Manufacturer : " + manufacturer + "\n"+
        "Serial Number : " + getSerialNumber() + "\n"+
        "Date : " + getManufactureDate() + "\n"+
        "Name : " + this.name;

  }

  @Override
  public int compareTo(Product o) {
    return name.compareTo(o.name);
  }
}
