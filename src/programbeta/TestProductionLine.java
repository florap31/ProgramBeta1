/*
Programmer name: Flornaldine Pierre
File: Driver class for processfiles class
 */

package programbeta;

import java.io.IOException;
import java.util.ArrayList;

public class TestProductionLine {

  TestProductionLine(ArrayList<Product> products) {

    ProcessFiles processFiles = new ProcessFiles();
    System.out.println("Test Employee Info");
    EmployeeInfo employee = new EmployeeInfo();
    System.out.println(employee.toString());

    try {
      processFiles.WriteFile(products);
      processFiles.WriteFile(employee);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
