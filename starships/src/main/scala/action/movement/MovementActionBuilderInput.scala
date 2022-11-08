package action.movement

import gameData.KeyStroke
import action.ActionBuilderInput

import scala.collection.immutable.List

case class MovementActionBuilderInput(id:Int, keyStrokes:List[KeyStroke]) extends ActionBuilderInput