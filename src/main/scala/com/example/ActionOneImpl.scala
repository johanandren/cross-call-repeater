package com.example

import akka.event.slf4j.Logger
import com.google.protobuf.empty.Empty
import kalix.scalasdk.action.Action
import kalix.scalasdk.action.ActionCreationContext

// This class was initially generated based on the .proto definition by Kalix tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

class ActionOneImpl(creationContext: ActionCreationContext) extends AbstractActionOneAction {

  val log = Logger("ActionOneImpl")

  override def doIt(empty: Empty): Action.Effect[Empty] = {
    log.info("ActionOneImpl.doIt")
    val futureResponse = components.actionTwoImpl.doIt(empty).execute()
    effects.asyncReply(futureResponse)
  }
}

