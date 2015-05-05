package org.proyecto.pruebachocolate

import org.uqbar.chocolate.core.Game
import org.uqbar.chocolate.core.components.Visible
import org.uqbar.chocolate.core.appearances.Rectangle
import java.awt.Color
import org.uqbar.chocolate.core.reactions.events.KeyHold
import org.uqbar.chocolate.core.reactions.annotations.io.enums.Key._
import org.uqbar.chocolate.core.dimensions.Vector.touple_to_vector

object MainApp extends Game {
 val MOVE_FACTOR = 250
 def title = "My First Game!"
 def displaySize = (800, 500)

 currentScene addComponent (new Visible() {
   def appearance = new Rectangle(20.0, 60.0)(Color.RED)

   in {
     case KeyHold(UP, delta) => move(0, -delta * MOVE_FACTOR)
     case KeyHold(DOWN, delta) => move(0, delta * MOVE_FACTOR)
     case KeyHold(LEFT, delta) => move(-delta * MOVE_FACTOR, 0)
     case KeyHold(RIGHT, delta) => move(delta * MOVE_FACTOR, 0)
   }
 });
}