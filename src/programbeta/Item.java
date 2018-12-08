package programbeta;

//Date is imported
import java.util.Date;

/* Programmer name: Flornaldine Pierre

Date: 9/29/2018
Oracle Project with interface enum and class

 */

public interface Item {

  final String manufacturer = "OracleProduction";


  void setProductionNumber(int num);

  void setName(String name1);

  //method to return name
  String getName();
//method to retrieve manufactured date
  Date getManufactureDate();
//method to retrieve serial number
  int getSerialNumber();

}





