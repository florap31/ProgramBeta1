/* Programmer name: Flornaldine Pierre

Date: 12/12/2018
Interface class contains methods all
classes that implement must contain

 */

package programbeta;

import java.util.Date;

public interface Item {

  final String manufacturer = "OracleProduction";

  void setProductionNumber(int num);

  void setName(String name1);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();

}





