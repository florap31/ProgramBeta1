package programbeta;
/* Programmer name: Flornaldine Pierre

Date: 9/29/2018
Oracle Project with interface enum class

 */
public enum ItemType {
  //Constant enums
  AUDIO("AU"), AUDIOMOBILE("AM"), VISUAL("VI"), VISUALMOBILE("VM");

  final String code;

  ItemType(String code) {
    this.code = code;
  }
}
