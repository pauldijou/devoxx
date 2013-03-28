package controllers

import play.api._
import play.api.mvc._
import reactivemongo.api._
import play.modules.reactivemongo.ReactiveMongoPlugin
import play.api.Play.current

object Application extends Controller {
  val db = ReactiveMongoPlugin.db
  val conferencesColl = db("conferences")

  def main(all: String) = Action {
    Ok(views.html.main())
  }

  def index() = Action {
    Ok(views.html.index())
  }
  
}