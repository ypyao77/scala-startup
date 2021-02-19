package scala.program.ch32

import scala.swing.{MainFrame, SimpleSwingApplication, Button}

object FirstSwingApp extends SimpleSwingApplication {
  def top = new MainFrame {
    title = "First Swing Application"
    contents = new Button { text = "Click me" }
  }
}
