/*
Programmer name: Flornaldine Pierre
File: Driver class for AudioPlayer class
 */

package programbeta;

public class PlayerDriver {
 public static void testPlayer() {

   AudioPlayer audioPlayer = new AudioPlayer("name", "Audio specification");

   audioPlayer.next();
   audioPlayer.previous();
   audioPlayer.play();
   audioPlayer.stop();

 }
}
