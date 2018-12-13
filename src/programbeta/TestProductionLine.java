/*
Programmer name: Flornaldine Pierre
File: Tests processfiles class
 */

package programbeta;

import java.io.IOException;
import java.util.ArrayList;

public class TestProductionLine {

  /**
   * Tests ProcessFiles class with Product and
   * Employee objects.
   * @param products used to test ProcessFiles with.
   */
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
