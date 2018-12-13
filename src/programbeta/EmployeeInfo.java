/*
Programmer name: Flornaldine Pierre
File: Uses scanner to get employee info and id,
checks if meets expected patterns, and sets to fields
 */

package programbeta;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeInfo {
  Scanner in;
  StringBuilder name;
  String code = "";
  String deptId;
  Pattern p;


  /**
   * Intializes scanner and pattern,
   * calls setname method and checks if
   * name meets requirements.
   */
  EmployeeInfo() {
    in = new Scanner(System.in);
    p = Pattern.compile("[A-Z][a-z]{3}[0-9]{2}");
    setName();
    if (checkName(name)) {
      createEmployeeCode(name);
    } else {
      code = "guest";
    }

    setDeptId();
    in.close();
  }

  public StringBuilder getName() {

    return name;
  }

  public String getCode() {
    return code;
  }

  //Sets name according to input
  private void setName() {
    name = new StringBuilder();
    name.append(inputName());

  }

  //Creates employee code by retrieving first name initial
  //and retrieving surname to join them together
  private void createEmployeeCode(StringBuilder name) {
    char initial = name.charAt(0);
    name.toString();
    int space = name.indexOf(" ");
    String surname = name.substring(space, name.length());
    code = initial + surname;
  }

  //returns input from user
  private String inputName() {
    System.out.println("Please enter your first and last name: ");
    return in.nextLine();
  }

  //checks if name contains a space
  private boolean checkName(StringBuilder name) {
    return name.toString().contains(" ");
  }

  public String getDeptId() {
    System.out.println("Please enter the department ID:");
    return in.nextLine();
  }

  //Checks and encodes department id if it matches pattern p
  private void setDeptId() {
    String id = getDeptId();
    if (validId(id)) {
      reverseString(id);
      deptId = id;
    } else {
      deptId = "None01";
    }
  }

  private String getId() {
    return deptId;
  }

  @Override
  public String toString() {
    return "Employee Code : " + getCode()
        + "\nDepartment Number : " + getId();
  }

  //checks if id matches pattern p
  private boolean validId(String id) {
    return id.matches(p.toString());
  }

  /**
   * Method recursively reverses id.
   * @param id to reverse
   * @return reversed string
   */
  public String reverseString(String id) {
    if (id.length() <= 1) {
      return id;
    }
    return reverseString(id.substring(1)) + id.charAt(0);
  }

}