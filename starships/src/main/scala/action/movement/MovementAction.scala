package action.movement

import action.Action
import gameData.KeyStroke

trait MovementAction(id:Int, keyStrokes:List[KeyStroke]) extends Action
