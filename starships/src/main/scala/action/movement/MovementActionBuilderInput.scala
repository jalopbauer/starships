package action.movement

import gameData.Entity
import action.ActionBuilderInput
import gameData.value.KeyStroke

import scala.collection.immutable.List

case class MovementActionBuilderInput(entity:Entity) extends ActionBuilderInput