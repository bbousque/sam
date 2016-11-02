package fr.bbt.sam.akka.http

import spray.json.DefaultJsonProtocol

/**
  * Created by brice on 02/11/2016.
  */
object HttpModel {

  case class Entite(id : Int, nom : String, description : String)

  object ServiceJsonProtoocol extends DefaultJsonProtocol {
    implicit val customerProtocol = jsonFormat3(Entite)
  }

  val entites = List(
    Entite(1, "ObjetArme", "Arme"),
    Entite(2, "ObjetBijou", "Les bijoux"),
    Entite(3, "ObjetVoiture", "Voiture")
    )

}
