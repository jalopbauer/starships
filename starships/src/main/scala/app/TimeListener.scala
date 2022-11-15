package app

import edu.austral.ingsis.starships.ui.{ElementModel, EventListener, TimePassed}

trait TimeListener(elements: Map[String, ElementModel]) extends EventListener[TimePassed]
//case class MyTimeListener(elements: Map[String, ElementModel]) extends EventListener[TimePassed]
