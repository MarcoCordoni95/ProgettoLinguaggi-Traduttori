/* Ogni istanza di questa classe descrive un identificatore */

public class Descrittore {

  private String identificatore;
  private int valore;
  private boolean keeping = false;

  public Descrittore(String id, int val) {
    identificatore = id;
    valore = val;
  }

  public Descrittore(String id) {
    this(id, 0);
  }

  public String getIdentificatore() {
    return identificatore;
  }

  public int getValore() {
    return valore;
  }

  public void modificaValore(int nuovo) {
    valore = nuovo;
  }

  public boolean equals(Descrittore d) {
    return this.identificatore.equals(d.identificatore);
  }

  public boolean equals(Object o) {
    if (o instanceof Descrittore)
      return equals((Descrittore) o);
    else
      return false;
  }

  public String toString() {
    return identificatore + " " + valore;
  }

  public Boolean isKeeping(){
  	return keeping;
  }

  public void setKeeping(){
  	keeping = true;
  }  
}
