package action.movement

import gameData.{Entity, KeyStroke}
import action.ActionBuilderInput

import scala.collection.immutable.List

case class MovementActionBuilderInput(entity:Entity) extends ActionBuilderInput