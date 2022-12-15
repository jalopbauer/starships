package game

import gameFlow.GameFlow
import gameState.PlayingGameState

case class Game(gameState: PlayingGameState, gameFlow: GameFlow)
