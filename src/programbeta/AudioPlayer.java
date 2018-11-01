package programbeta;

public class AudioPlayer extends Product implements MultimediaControl {

  String audioSpecification;
  ItemType mediaType;
/*Constructor takes in a name and assigns it to constructor in product
audiospecification is also assigned.
 */




  AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = ItemType.AUDIO;
  }

  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");

  }

  @Override
  public void previous() {
    System.out.println("Loading previous");
  }

  @Override
  public void next() {
    System.out.println("Loading next");

  }

  @Override
  public String toString() {
    return super.toString() + "\n" +
        "Audio Spec : " + audioSpecification + "\n" +
        "Type : " + mediaType;

  }

  @Override
  public int compareTo(Product o) {
    return 0;
  }
}
