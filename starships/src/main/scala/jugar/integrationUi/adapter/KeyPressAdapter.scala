package jugar.integrationUi.adapter

import edu.austral.ingsis.starships.ui.KeyPressed
import entity.value.KeyPress

case class KeyPressAdapter():
  
  def themMe(keyPressed: KeyPressed): KeyPress =
    KeyPress(keyPressed.getKey.getChar)