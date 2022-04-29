package com.example

import com.google.protobuf.empty.Empty
import kalix.scalasdk.action.Action
import kalix.scalasdk.testkit.ActionResult
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

// This class was initially generated based on the .proto definition by Kalix tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

class ActionTwoImplSpec
    extends AnyWordSpec
    with Matchers {

  "ActionTwoImpl" must {

    "have example test that can be removed" in {
      val service = ActionTwoImplTestKit(new ActionTwoImpl(_))
      pending
      // use the testkit to execute a command
      // and verify final updated state:
      // val result = service.someOperation(SomeRequest)
      // verify the reply
      // result.reply shouldBe expectedReply
    }

    "handle command DoIt" in {
      val service = ActionTwoImplTestKit(new ActionTwoImpl(_))
          pending
      // val result = service.doIt(Empty(...))
    }

  }
}
