package action.collision

import action.ActionBuilderInput
import gameData.{Entity, KeyStroke}

import scala.collection.immutable.List

case class CollisionActionBuilderInput(actionEmitter: Entity, actionReceiver: Entity) extends ActionBuilderInput:
  def inverse:CollisionActionBuilderInput = this.copy(actionReceiver, actionEmitter)