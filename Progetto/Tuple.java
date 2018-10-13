import java.util.Vector;

public class Tuple { 
  private SymbolTable symbolTable; 
  private Vector<Expr> vector; 
  private Expr whileExpr; 

  public Tuple(SymbolTable symbolTable, Vector<Expr> vector, Expr whileExpr) { 
    this.symbolTable = symbolTable; 
    this.vector = vector; 
    this.whileExpr = whileExpr;     
  } 

  public SymbolTable getSymbolTable(){
  	return symbolTable;
  }

  public Vector<Expr> getVector(){
  	return vector;
  }

  public Expr getWhileExpr(){
  	return whileExpr;
  }
} 