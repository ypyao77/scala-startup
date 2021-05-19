package fn.scala.fast.ch06

object D63 {
  abstract class UndoableAction(val description: String) {
    def undo(): Unit
    def redo(): Unit
  }

  object DoNothingAction extends UndoableAction("Do nothing") {
    override def undo(): Unit = {
      println("DoNothingAction.undo()")
    }

    override def redo(): Unit = {
      println("DoNothingAction.redo()")
    }
  }

  def main(args: Array[String]): Unit = {
    val actions = Map("open" -> DoNothingAction, "save" -> DoNothingAction, "exit" -> DoNothingAction)

    actions("open").undo()
    actions("save").redo()
    actions("exit").undo()
    actions("...").redo()
  }
}
