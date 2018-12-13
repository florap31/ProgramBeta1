/*
Programmer name: Flornaldine Pierre
File: Extends product to set the name of the movie player,
and also sets the screen and monitor type.
Implements MultimediaControl, so must contain the methods
*/

package programbeta;

public class MoviePlayer extends Product implements MultimediaControl {
  MonitorType monitorType;
  Screen screen;


  /**
   * Constructor calls super to superclass to set up name of movie Player.
   * @param name of movie player
   * @param screen is set to Object Screen
   * @param monitor is set to object MonitorType
   */
  MoviePlayer(String name, Screen screen, MonitorType monitor) {
    super(name);
    //MoviePlayer's super class's constructor is called
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

  /**
   * Calls superclasses's tostring to print certain fields of object.
   * @return superclasses's to string as well as
   * monitor type and screen of object.
   */
  public String toString() {
    return super.toString() + "\n"
        + "Screen : " + screen.toString()
        + "\n" + "Monitor Type : " + monitorType;
  }

}
