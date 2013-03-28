package controllers

import play.api.mvc._
import reactivemongo.bson.handlers.DefaultBSONHandlers.{DefaultBSONReaderHandler, DefaultBSONDocumentWriter}
import reactivemongo.bson._
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.modules.reactivemongo.PlayBsonImplicits._
import play.api.libs.json._
import scala.concurrent.Future

object Conferences extends Controller {
  lazy val collection = controllers.Application.conferencesColl

  def all() = Action {
    Async {
      collection.find[BSONDocument, JsValue](BSONDocument()).toList.map(res => Ok(JsArray(res)))
    }
  }

  def get(id: String) = Action {
    Async {
      collection.find[BSONDocument, JsValue](BSONDocument("id" -> BSONString(id))).toList.map(res => Ok(res.headOption.getOrElse(JsUndefined("Not Found"))))
    }
  }

  def create() = Action(parse.json) { request =>
    Async {
      val conf = Json.obj(
        "id" -> BSONObjectID.generate.stringify,
        "name" -> request.body \ "name",
        "speaker" -> request.body \ "speaker",
        "note" -> 0
      )
      collection.insert[JsValue](conf).map(le => Ok(Json.obj("ok" -> le.ok)))
    }
  }

  def delete(id: String) = Action {
    Async {
      collection.remove[BSONDocument](BSONDocument("id" -> BSONString(id))).map(le => Ok(Json.obj("ok" -> le.ok)))
    }
  }

  def up(id: String) = Action {
    Async {
      collection.update(BSONDocument("id" -> BSONString(id)), BSONDocument("$inc" -> BSONDocument("note" -> BSONInteger(1)))).map(le => Ok(Json.obj("ok" -> le.ok)))
    }
  }

  def down(id: String) = Action {
    Async {
      collection.update(BSONDocument("id" -> BSONString(id)), BSONDocument("$inc" -> BSONDocument("note" -> BSONInteger(-1)))).map(le => Ok(Json.obj("ok" -> le.ok)))
    }
  }
}