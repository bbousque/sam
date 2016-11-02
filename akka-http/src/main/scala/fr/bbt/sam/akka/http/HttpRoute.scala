package fr.bbt.sam.akka.http

import akka.http.scaladsl.server.Directives._
import HttpModel._
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
/**
  * Created by brice on 02/11/2016.
  */

object HttpRoute {

  import HttpModel.ServiceJsonProtoocol._

  val testRoutes =
    get {
      path("entites") {
        complete(entites)
      } ~
        path("ping") {
          complete("PONG!")
        }
    }
}
