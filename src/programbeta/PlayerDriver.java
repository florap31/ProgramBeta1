/*
Programmer name: Flornaldine Pierre
File: Driver class for Player Driver class
 */

package programbeta;

public class PlayerDriver {

  /**
   * Method creates AudioPlayer object to test the class.
   */
  public static void testPlayer() {

    AudioPlayer audioPlayer = new AudioPlayer("name", "Audio specification");

    audioPlayer.next();
    audioPlayer.previous();
    audioPlayer.play();
    audioPlayer.stop();

  }
}
