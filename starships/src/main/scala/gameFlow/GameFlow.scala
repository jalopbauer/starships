package gameFlow

import action.Action
import actionSource.ActionSource
import gameState.PlayingGameState

case class GameFlow(actionSources: List[ActionSource]):
  def nextFrame(gameData: PlayingGameState): PlayingGameState =
    if (gameData.isPaused) gameData
    else
      val actions = actionSources.foldLeft(List(): List[Action])((acc, actionSource) =>
        acc.appendedAll(actionSource.createActions(gameData)))
      actions.foldLeft(gameData)((gameData, action) => action.act(gameData))
