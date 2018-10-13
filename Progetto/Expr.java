abstract class Expr {
  public abstract int calcola();
}

class PiuExpr extends Expr {
  private Expr sx, dx;

  public PiuExpr(Expr sx, Expr dx) {
    this.sx = sx;
    this.dx = dx;
  }

  public int calcola() {
    return sx.calcola() + dx.calcola();
  }
}

class MenoExpr extends Expr {
  private Expr sx, dx;

  public MenoExpr(Expr sx, Expr dx) {
    this.sx = sx;
    this.dx = dx;
  }

  public int calcola() {
    return sx.calcola() - dx.calcola();
  }
}

class PerExpr extends Expr {
  private Expr sx, dx;

  public PerExpr(Expr sx, Expr dx) {
    this.sx = sx;
    this.dx = dx;
  }

  public int calcola() {
    return sx.calcola() * dx.calcola();
  }
}

class DivisoExpr extends Expr {
  private Expr sx, dx;

  public DivisoExpr(Expr sx, Expr dx) {
    this.sx = sx;
    this.dx = dx;
  }

  public int calcola() {
    return sx.calcola() / dx.calcola();
  }
}

class RestoExpr extends Expr {
  private Expr sx, dx;

  public RestoExpr(Expr sx, Expr dx) {
    this.sx = sx;
    this.dx = dx;
  }

  public int calcola() {
    return sx.calcola() % dx.calcola();
  }
}

class UnMenoExpr extends Expr {
  private Expr e;

  public UnMenoExpr(Expr e) {
    this.e = e;
  }

  public int calcola() {
    return -e.calcola();
  }
}


class UnPiuExpr extends Expr {
  private Expr e;

  public UnPiuExpr(Expr e) {
    this.e = e;
  }

  public int calcola() {
    return e.calcola();
  }
}

class NumExpr extends Expr {
  private Integer num;

  public NumExpr(Integer num) {
    this.num = num;
  }

  public int calcola() {
    return num.intValue();
  }
}

class IdExpr extends Expr {
  private Descrittore descrittore;

  public IdExpr(Descrittore d) {
    descrittore = d;
  }

  public int calcola() {
    return descrittore.getValore();
  }
}

class IncrPreExpr extends Expr {
  private Descrittore descrittore;

  public IncrPreExpr(Descrittore d) {
    descrittore = d;
  }

  public int calcola() {
  	descrittore.modificaValore(descrittore.getValore()+1);
    return descrittore.getValore();
  }
}

class IncrPosExpr extends Expr {
  private Descrittore descrittore;

  public IncrPosExpr(Descrittore d) {
    descrittore = d;
  }

  public int calcola() {
  	int aux = descrittore.getValore();
  	descrittore.modificaValore(aux+1);
    return aux;
  }
}

class DecPreExpr extends Expr {
  private Descrittore descrittore;

  public DecPreExpr(Descrittore d) {
    descrittore = d;
  }

  public int calcola() {
  	descrittore.modificaValore(descrittore.getValore()-1);
    return descrittore.getValore();
  }
}

class DecPosExpr extends Expr {
  private Descrittore descrittore;

  public DecPosExpr(Descrittore d) {
    descrittore = d;
  }

  public int calcola() {
  	int aux = descrittore.getValore();
  	descrittore.modificaValore(aux-1);
    return aux;
  }
}

class AssExpr extends Expr {
  private Expr expr;
  private Descrittore descrittore;

  public AssExpr(Descrittore d, Expr e) {
    this.descrittore = d;
    this.expr = e;
  }

  public int calcola() {
  	descrittore.modificaValore(expr.calcola());
    return descrittore.getValore();
  }
}