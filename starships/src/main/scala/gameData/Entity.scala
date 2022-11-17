package gameData

import gameData.motion.Motion
import gameData.value.EntityType

case class Entity(id:Int, entityType:EntityType, motion: Motion, damage: Int, health: Int)
