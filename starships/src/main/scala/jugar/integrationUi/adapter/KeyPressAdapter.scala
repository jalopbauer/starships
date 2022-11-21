package jugar.integrationUi.adapter

import edu.austral.ingsis.starships.ui.KeyPressed
import entity.value.KeyPress
import javafx.scene.input.KeyCode

case class KeyPressAdapter():
  
  def themMe(keyPressed: KeyCode): KeyPress =
    KeyPress(keyPressed.getChar)