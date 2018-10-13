import java.io.*;

class ElencaToken {
    public static void main(String args[]) throws IOException {
      Scanner scanner;
      if (args.length == 0) 
        scanner = new Scanner(new InputStreamReader(System.in));
      else
        scanner = new Scanner(new FileReader(args[0]));
      Token t;
      while ((t = scanner.getNext()).getTipo() != TipoToken.EOF)
         System.out.println(t.toString());
    }
}