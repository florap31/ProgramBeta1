package programbeta;

public class MoviePlayer extends Product implements MultimediaControl {
  MonitorType monitorType;
  Screen screen;

  MoviePlayer(String name, Screen screen, MonitorType monitor) {
    super(name);
    //MoviePlayer's super class's constructer is called
    this.monitorType = monitor;
    //String parameter is set to screen variable
    this.screen = screen;
  }



  //Multimedia Controls set for this class
  @Override
  public void play() {
    System.out.println("Playing movie");
  }

  @Override
  public void stop() {
    System.out.println("Stopping movie");

  }

  @Override
  public void previous() {
    System.out.println("Previous movie");

  }

  @Override
  public void next() {
    System.out.println("Next movie");

  }
  //toString method integrates variables and returns string
  public String toString() {
    return super.toString() + "\n" +
        "Screen : " + screen.toString() + "\n"+
        "Monitor Type : " + monitorType ;
  }

  @Override
  public int compareTo(Product o) {
    return 0;
  }
}
