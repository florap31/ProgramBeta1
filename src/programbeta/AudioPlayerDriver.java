package programbeta;

public class AudioPlayerDriver {
  //AudioPlayer class is instantiated
  AudioPlayer audioPlayer = new AudioPlayer("iPod Mini", "MP3");

  /**
   * Prints details of AudioPlayer object methods
   * As well as MultimediaControl detains
   */
  public void testAudioPlayer() {
    audioPlayer.play();
    audioPlayer.stop();
    audioPlayer.next();
    audioPlayer.previous();

    //Calls toString function for first object
    System.out.println(audioPlayer.toString());

    //New object is made for second portion of output
    AudioPlayer audioPlayer1 = new AudioPlayer("Walkman", "WAV");
    //details of second object is printed out
    System.out.println(audioPlayer1.toString());

  }
}

