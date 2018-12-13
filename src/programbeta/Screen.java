/*
Programmer name: Flornaldine Pierre
File: sets resolution, refresh rate, and response times
 */

package programbeta;


public class Screen implements ScreenSpec {
  String resolution;
  int refreshrate;
  int responsetime;

  Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  @Override
  public String getResolution() {
    return this.resolution;
  }

  @Override
  public int getRefreshRate() {
    return this.refreshrate;
  }

  @Override
  public int getResponseTime() {
    return this.responsetime;
  }

  /**
   * Uses get methods tho retrieve resolution
   * variables and return string of details.
   * @return string of resolution variables
   */
  public String toString() {
    return "Resolution : " + getResolution() + "\n"
        + "Refresh rate : " + getRefreshRate() + "\n"
        + "Response time :" + getResponseTime();
  }
}
