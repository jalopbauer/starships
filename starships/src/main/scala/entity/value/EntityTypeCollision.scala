package entity.value

case class EntityTypeCollision(leftEntityType: EntityType, rightEntityType: EntityType)

case object EntityTypeCollision:
  def compare(leftEntityTypeCollision: EntityTypeCollision,
              rightEntityTypeCollision: EntityTypeCollision): Boolean =
    (leftEntityTypeCollision.leftEntityType == rightEntityTypeCollision.leftEntityType
    && leftEntityTypeCollision.rightEntityType == rightEntityTypeCollision.rightEntityType)
    || (leftEntityTypeCollision.rightEntityType == rightEntityTypeCollision.leftEntityType
      && leftEntityTypeCollision.leftEntityType == rightEntityTypeCollision.rightEntityType)

