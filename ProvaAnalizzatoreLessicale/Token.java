enum TipoToken {  
  WHILE, KEEPING, PIU, MENO, PER, DIVISO, RESTO, UNARIO, TONDA_APERTA, TONDA_CHIUSA, SEPARATORE, INCREMENTO, DECREMENTO, 
  ASSEGNAMENTO, VIRGOLA, NUMERO, IDENT, EOF, ALTRO;
}

class Token {
  private TipoToken tipo;
  private Object valore;

  public Token(TipoToken t) {
    tipo = t;
    valore = null;
  }

  public Token(TipoToken t, String s) {
    tipo = t;
    valore = s;
  }

  public Token(TipoToken t, Integer num) {
    tipo = t;
    valore = num;
  }
 
  public TipoToken getTipo() {
    return tipo;
  }

  public Object getValore() {
    return valore;
  }

  public String getString() {
    return (String) valore;
  }

  public Integer getInteger() {
    return (Integer) valore;
  }

  public String toString() {
    if (valore == null)
      return tipo.toString();
    else
      return tipo.toString() + "  " + valore;
   }
}