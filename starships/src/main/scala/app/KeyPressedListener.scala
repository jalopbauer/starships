package app

import edu.austral.ingsis.starships.ui.{Collision, ElementModel, EventListener, KeyPressed, TimePassed}

trait KeyPressedListener(starship: ElementModel) extends EventListener[KeyPressed]
//case class KeyPressedListener() extends EventListener[Collision]
