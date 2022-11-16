package factory.actionSourceFactory

import actionSource.ActionSource

trait ActionSourceFactory():
  def create(): ActionSource
