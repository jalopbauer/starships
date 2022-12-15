package factory.actionSourceConfigFactory

import actionSource.movement.{ControlledMovementActionSourceConfig, InputControlledMovementActionSourceConfig}
import config.ConfigFile
import entity.EntityIdControlledMovementKeyPresses
import factory.IdListSeed

case class ControlledMovementActionSourceConfigFactory():
  def create(idListSeed: IdListSeed): ControlledMovementActionSourceConfig =
    val values = idListSeed.ids zip ConfigFile.shipsControlledMovementKeyPresses
    val valuesAgain = values.map(value => EntityIdControlledMovementKeyPresses(value._1, value._2))
    InputControlledMovementActionSourceConfig(valuesAgain)

