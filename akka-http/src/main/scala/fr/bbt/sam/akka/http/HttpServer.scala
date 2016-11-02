package fr.bbt.sam.akka.http

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer

/**
  * Created by brice on 02/11/2016.
  */
object HttpServer extends App {

  implicit val system = ActorSystem("HttpServer")
  import system.dispatcher
  implicit val materializer = ActorMaterializer()

  val interface = "127.0.0.1"
  val port = 8080

  val bindingFuture = Http().bindAndHandle(HttpRoute.testRoutes, interface, port)

  println(s"Server online at http://$interface:$port/\nPress RETURN to stop...")
  Console.readLine()
  bindingFuture.flatMap(_.unbind()).onComplete(_ ⇒ system.shutdown())

}
