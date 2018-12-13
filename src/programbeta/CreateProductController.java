/*
Programmer name: Flornaldine Pierre
File: Controller for fxml allows user to add products
into arraylist and also view added products on console
 */

package programbeta;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CreateProductController {

  @FXML
  private RadioButton ipod;
  @FXML
  private RadioButton walkman;
  @FXML
  private RadioButton dbpower;
  @FXML
  private RadioButton pyle;
  @FXML
  private ToggleGroup chosenProduct;
  @FXML
  private Label status;
  @FXML
  private TextField totalItems;

  private String product;
  private int numOfItems;

  ArrayList<Product> products = new ArrayList<>();

  /**
   * Adds a product depending on chosen products
   * and number of products.
   * @param event from adding product
   */
  public void addProduct(ActionEvent event) {

    RadioButton selected = (RadioButton) chosenProduct.getSelectedToggle();

    try {
      numOfItems = Integer.parseInt(totalItems.getText());
    } catch (NumberFormatException e) {
      status.setText("Please enter a number");
    }

    //Finds selected product and adds to arraylist for specified amount
    if (selected == ipod) {
      product = "Audio Player";
      AudioPlayer a1 = new AudioPlayer("iPod Mini","MP3");
      addProducts(a1);
    } else if (selected == walkman) {
      product = "Audio Player";
      AudioPlayer a2 = new AudioPlayer("Walkman","WAV ");
      addProducts(a2);
    } else if (selected == dbpower) {
      product = "Movie Player";
      MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
          new Screen(" 720x480", 40, 22), MonitorType.LCD);
      addProducts(m1);
    } else if (selected == pyle) {
      product = "Movie Player";
      MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
          new Screen("1366x768", 40, 22), MonitorType.LED);
      addProducts(m2);
    } else {
      status.setText("Select a product.");
    }

  }

  //Method prints collection with statistics
  public void viewCollection(ActionEvent event) {
    print(products);
  }

  //Arraylist is passed as parameter for generic method
  static <T> void print(ArrayList<T> p) {
    int num = 0;
    for (T t: p) {
      num++;
      System.out.println(num + " " + t);
    }
    System.out.println("total = " + num);
  }

  // Add products to collection for specified amount of times
  private void addProducts(Object p) {
    for (int i = 0; i < numOfItems; i++) {
      products.add((Product) p);
    }
  }

}
