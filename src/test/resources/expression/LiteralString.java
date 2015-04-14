package expression;

import io.vertx.codetrans.LiteralExpressionTest;
import io.vertx.codetrans.annotations.CodeTranslate;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class LiteralString {

  @CodeTranslate
  public void value() throws Exception {
    LiteralExpressionTest.result = "foobar";
  }

  @CodeTranslate
  public void concat() throws Exception {
    int a = 0;
    a = 3;
    LiteralExpressionTest.result = "_" + a + "_";
  }

  @CodeTranslate
  public void concat1() throws Exception {
    int a = 0;
    a = 1;
    LiteralExpressionTest.result = a + "_";
  }

  @CodeTranslate
  public void concat2() throws Exception {
    int a = 0;
    int b = 0;
    a = 1;
    b = 2;
    LiteralExpressionTest.result = a + b + "_";
  }

  @CodeTranslate
  public void concat3() throws Exception {
    int a = 0;
    int b = 0;
    a = 1;
    b = 2;
    LiteralExpressionTest.result = (a + b) + "_";
  }

  @CodeTranslate
  public void concat4() throws Exception {
    int a = 0;
    int b = 0;
    a = 1;
    b = 2;
    LiteralExpressionTest.result = a + (b + "_");
  }

  @CodeTranslate
  public void concat5() throws Exception {
    int a = 0;
    a = 1;
    LiteralExpressionTest.result = "_" + a;
  }

  @CodeTranslate
  public void concat6() throws Exception {
    LiteralExpressionTest.result = "_" + 1 + 2;
  }

  @CodeTranslate
  public void concat7() throws Exception {
    int a = 0;
    int b = 0;
    a = 1;
    b = 2;
    LiteralExpressionTest.result = ("_" + a) + b;
  }

  @CodeTranslate
  public void concat8() throws Exception {
    int a = 0;
    int b = 0;
    a = 1;
    b = 2;
    LiteralExpressionTest.result = "_" + (a + b);
  }

  @CodeTranslate
  public void concat9() throws Exception {
    int a = 0;
    a = 2;
    LiteralExpressionTest.result = ("_" + a) + "_";
  }

  @CodeTranslate
  public void escape() throws Exception {
    LiteralExpressionTest.result = "\n\r\t\f\b\"\\'\u0000A\u007F";
  }
}
