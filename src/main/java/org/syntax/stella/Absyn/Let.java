// File generated by the BNF Converter (bnfc 2.9.4.1).

package org.syntax.stella.Absyn;

public class Let  extends Expr {
  public final ListPatternBinding listpatternbinding_;
  public final Expr expr_;
  public int line_num, col_num, offset;
  public Let(ListPatternBinding p1, Expr p2) { listpatternbinding_ = p1; expr_ = p2; }

  public <R,A> R accept(org.syntax.stella.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o instanceof org.syntax.stella.Absyn.Let) {
      org.syntax.stella.Absyn.Let x = (org.syntax.stella.Absyn.Let)o;
      return this.listpatternbinding_.equals(x.listpatternbinding_) && this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.listpatternbinding_.hashCode())+this.expr_.hashCode();
  }


}
