package action

import entity.Entity
import entity.value.KeyPress
import gameState.PlayingGameState

case class EntityKeyPressAction(  entity:Entity
                                , action: KeyPressIsActiveAction
                                ) extends ExistsEntityAction(entity.id, action) with ConditionalAction(action)