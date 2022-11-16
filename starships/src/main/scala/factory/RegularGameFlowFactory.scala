package factory

import gameFlow.GameFlow

case class RegularGameFlowFactory():
  def create(): GameFlow =
    GameFlow(List())
