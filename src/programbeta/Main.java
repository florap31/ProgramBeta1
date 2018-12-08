package programbeta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception{
    Parent root = FXMLLoader.load(getClass().getResource("CreateProduct.fxml"));
    primaryStage.setTitle("Product");
    primaryStage.setScene(new Scene(root, 600, 400));
    primaryStage.show();
  }
  public static void main(String[] args) {
    launch(args);
    // Write one line of code to create an ArrayList of products
    ArrayList<Product> products = new ArrayList<>();

    // Write one line of code to call testCollection and assign the result to the ArrayList
    products = testCollection(products);

    // Write one line of code to sort the ArrayList
    Collections.sort(products);

    // Call the print method on the ArrayList
     print(products);
    TestProductionLine testProductionLine = new TestProductionLine(products);
  }

  // Step 15
  // Complete the header for the testCollection method here

  static ArrayList<Product> testCollection(ArrayList<Product> products) {
    AudioPlayer a1 = new AudioPlayer("iPod Mini","MP3");

    AudioPlayer a2 = new AudioPlayer("Walkman","WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    //objects are added to arraylist
    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  // Step 16
  // Create print method here
  //Arraylist is passed as parameter for generic method
  static <T> void print(ArrayList<T> p){
    for(T t: p) {
      System.out.println(t);
    }
  }

}



