package factory


/**
  * Created by zyong on 2016/11/18.
  */
trait WindowsFacotry {
  type aWindows <: Window
  type aScrollbar <: Scrollbar

  def createWindow(s: aScrollbar)
  def createScrollbar()

  abstract class Window(s: aScrollbar)
  abstract class Scrollbar
}

object VistaFacotry extends WindowsFacotry {
  override type aWindows = VistaWindow
  override type aScrollbar = VistaScrollbar

  override def createWindow(s: aScrollbar) = new VistaWindow(s)
  override def createScrollbar() = new VistaScrollbar

  protected class VistaWindow(s: aScrollbar) extends Window(s)
  protected class VistaScrollbar extends Scrollbar
}

trait VistaWidgets {
  self: WindowsFacotry =>
  protected class VistaWindow(s: aScrollbar) extends Window(s)
  protected class VistaScrollbar extends Scrollbar
}

object GuiFactory {

  def main(args: Array[String]): Unit = {
//    class MyWG extends VistaWidgets with WindowsFacotry {}

  }
}
