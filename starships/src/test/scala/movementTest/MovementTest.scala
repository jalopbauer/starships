package movementTest

import gameFlow.GameFlow
import actionSource.movement.{ForwardMovementActionSource, RegularForwardMovementActionSourceConfig}

class MovementTest {
  val gameFlow: GameFlow = GameFlow(List(ForwardMovementActionSource(RegularForwardMovementActionSourceConfig()))
}
