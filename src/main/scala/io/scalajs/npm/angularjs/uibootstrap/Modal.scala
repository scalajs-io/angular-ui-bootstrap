package io.scalajs.npm.angularjs.uibootstrap

import io.scalajs.RawOptions

import scala.scalajs.js
import scala.scalajs.js.|

/**
  * AngularJS Modal Service (\$modal)
  * @author lawrence.daniels@gmail.com
  * @see http://angular-ui.github.io/bootstrap/#/modal
  */
@js.native
trait Modal extends js.Object {

  /**
    * Creates and opens a new modal dialog instance
    * @param options the given [[ModalOptions Modal Options]]
    * @tparam T the return type
    * @return a new [[ModalInstance Modal Instance]]
    */
  def open[T](options: ModalOptions | RawOptions): ModalInstance[T] = js.native

}
