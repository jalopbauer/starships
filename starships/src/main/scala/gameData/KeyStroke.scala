package gameData

case class KeyStroke(letter: Char, keyStrokeAction: KeyStrokeAction)
enum KeyStrokeAction:
  case FORWARD, BACKWARDS, ROTATE_LEFT, ROTATE_RIGHT