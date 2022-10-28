package action

import javax.security.auth.Subject

trait Action:
  def act(subject :Subject): ActionResult
