package action.collision

import action.ActionBuilderInput
import gameData.Entity
import gameData.value.KeyStroke

import scala.collection.immutable.List

case class CollisionActionBuilderInput(actionEmitter: Entity, actionReceiver: Entity) extends ActionBuilderInput:
  def inverse:CollisionActionBuilderInput = this.copy(actionReceiver, actionEmitter)