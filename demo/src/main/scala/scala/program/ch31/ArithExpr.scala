package scala.program.ch31

import scala.util.parsing.combinator._

object ArithExpr extends JavaTokenParsers {
  def expr: Parser[Any] = {
    log(term)("加减法表达式  term") ~ rep("+" ~ log(term)("加法 term") | "-" ~ log(term)("减法  term"))
  }

  def term: Parser[Any] = log(factor)("乘除法表达式   factor") ~ rep("*" ~ log(factor)("乘法 factor") | "/" ~ log(factor)("除法  factor"))

  def factor: Parser[Any] = (wholeNumber | decimalNumber | floatingPointNumber) | "(" ~ log(expr)("factor expr") ~ ")"

  def main(args: Array[String]) {
    println(parseAll(expr, "(1*2)* 5"))
  }
}
