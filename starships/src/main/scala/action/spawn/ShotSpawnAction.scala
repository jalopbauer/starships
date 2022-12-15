package action.spawn

import action.KeyPressIsActiveAction
import action.spawn.SpawnAction
import entity.Entity
import entity.value.motion.Coordinate
import entity.value.{EntityType, KeyPress}
import gameState.PlayingGameState

case class ShotSpawnAction(id: Int, keyPress: KeyPress) extends SpawnAction:
  def act(gameData: PlayingGameState): PlayingGameState =
    KeyPressIsActiveAction(keyPress, EntityShootsMovementAction(id)).act(gameData)