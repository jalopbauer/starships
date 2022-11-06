package action.movementAction

import action.Action
import gameData.KeyStroke

trait MovementAction extends Action:
  def setKeyStrokes(keyStrokes:List[KeyStroke]):MovementAction
