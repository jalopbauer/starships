package controller.game

import dto.collision.CollisionDTO
import model.GameData
import model.value.collision.Collision
import service.game.GameService

trait GameController(gameService: GameService):
  def handleCollision(gameData: GameData):GameData =
    gameService.handleCollision(gameData)