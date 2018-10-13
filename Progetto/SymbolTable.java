import java.util.Vector;
import java.util.Iterator;

public class SymbolTable implements Iterable<Descrittore> {

  private Vector<Descrittore> tabella;

  public SymbolTable() {
    tabella = new Vector<Descrittore>();
  }

  public Descrittore trova(String s) {
    int posizione = tabella.indexOf(new Descrittore(s));
    if (posizione == -1)
      return null;
    else
      return tabella.elementAt(posizione);
  }

  public void aggiungi(Descrittore d) {
    tabella.add(d);
  }

  public Descrittore trovaEAggiungi(String s) {
    Descrittore d = this.trova(s);
    if (d == null) {
      d = new Descrittore(s);
      this.aggiungi(d);
    }
    return d;
  }
  
  public Iterator<Descrittore> iterator() {
    return tabella.iterator();
  }
}