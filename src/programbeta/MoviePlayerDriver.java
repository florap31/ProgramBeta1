/* Programmer name: Flornaldine Pierre

Date: 12/12/2018
File: Used to test MoviePlayer class

 */

package programbeta;

public class MoviePlayerDriver {

  /**
   * Creates new objects to test MoviePlayer class
   */
  public static void testMoviePlayer() {
    Screen screen = new Screen("720x480", 40,22);
    Screen screen1 = new Screen("1366x768",40,22);
    MoviePlayer moviePlayer = new MoviePlayer("DBPOWER MK101",screen,MonitorType.LCD);
    System.out.println(moviePlayer.toString());
    MoviePlayer moviePlayer1 = new MoviePlayer("DBPOWER MK101",screen1,MonitorType.LED);
    System.out.println(moviePlayer1.toString());
  }

}

