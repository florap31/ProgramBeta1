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





