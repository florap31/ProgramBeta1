/*
Programmer name: Flornaldine Pierre
File: Uses BufferedReader to read each line of
File and prints each line to console
 */

package programbeta;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class ViewFileInfo {

  String file = "C:/LineTest(p)/TestResults.txt(p2)";
  BufferedReader reader;

  ViewFileInfo() {
    viewFile();
  }


  /**
   * FileReader and BufferedReader uses file
   * to read each line and print to console
   * each line. Also catches exception if file is not found
   */
  public void viewFile() {
    //BufferedReader reads each line of text file and prints to console
    try {
      reader = new BufferedReader(new FileReader(file));
      String line = reader.readLine();
      System.out.println(line);
      reader.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
