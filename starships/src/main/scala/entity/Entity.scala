package entity

import entity.value.EntityType
import entity.value.motion.Motion

case class Entity(id: Int, entityType: EntityType, motion: Motion, damage: Int, health: Int)