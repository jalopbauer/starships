package action.movement

import action.Action
import gameData.{Entity, KeyStroke, Spawner}

import math.{pow, sqrt}

case class MaxValueVariableMovementAction(id:Int, maxValue: Int
                                          , variableMovementAction: VariableMovementAction
                                         , constantMovementAction: ConstantMovementAction) extends MovementAction(id, List()):
  def act(entity:Entity): Entity =
    val mod = entity.motion.direction.dontKnowName
    if (mod >= maxValue) constantMovementAction.act(entity)
    else variableMovementAction.act(entity)
