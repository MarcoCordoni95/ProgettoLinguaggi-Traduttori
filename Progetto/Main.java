import java_cup.runtime.*;
import java.io.*;
import java.util.Vector;

class Main {  
  public static void main(String[] args) throws java.io.IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ComplexSymbolFactory sf = new ComplexSymbolFactory();
        Scanner scanner;

    if (args.length == 0){
      String s = in.readLine();
      scanner = new Scanner(new StringReader(s), sf);
    }
    else
      scanner = new Scanner(new FileReader(args[0]),sf);   
   
    Parser p = new Parser(scanner, sf);

    try {
      Symbol ris = p.parse();
      Tuple risultato = (Tuple) ris.value;
      Vector<Expr> alberoVect = risultato.getVector();

      SymbolTable tabella = risultato.getSymbolTable();

  for (Descrittore d : tabella) {
    System.out.print(d.getIdentificatore() + "? ");
    d.modificaValore(Integer.parseInt(in.readLine()));
  }

  Boolean flagDopoPrimaVolta = false;

      do {

        if(flagDopoPrimaVolta){
          for (Descrittore d : tabella) {
            if(!d.isKeeping()){
          System.out.print(d.getIdentificatore() + "? ");
          d.modificaValore(Integer.parseInt(in.readLine()));
        }
          }
      }

      flagDopoPrimaVolta = true;

    for(Expr albero: alberoVect){
          try {
              System.out.println(albero.calcola());
          } catch (ArithmeticException e) {
            System.err.println("Err");
          }
        }

      } while (risultato.getWhileExpr().calcola() != 0 );
    } catch (Exception e)  {
      System.out.println(e);
    }
  }
}