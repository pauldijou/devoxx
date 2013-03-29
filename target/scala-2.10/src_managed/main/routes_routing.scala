// @SOURCE:/Users/Paul/Work/projects/devoxx/conf/routes
// @HASH:20bd7dc5aada3116147ddc2f2069e76187c9b2c7
// @DATE:Fri Mar 29 09:44:06 CET 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_main0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Application_index1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("views/index"))))
        

// @LINE:12
private[this] lazy val controllers_Conferences_all2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/v1/conferences"))))
        

// @LINE:13
private[this] lazy val controllers_Conferences_get3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/v1/conferences/"),DynamicPart("id", """[^/]+"""))))
        

// @LINE:14
private[this] lazy val controllers_Conferences_create4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/v1/conferences"))))
        

// @LINE:15
private[this] lazy val controllers_Conferences_delete5 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/v1/conferences/"),DynamicPart("id", """[^/]+"""))))
        

// @LINE:16
private[this] lazy val controllers_Conferences_up6 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/v1/conferences/"),DynamicPart("id", """[^/]+"""),StaticPart("/up"))))
        

// @LINE:17
private[this] lazy val controllers_Conferences_down7 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/v1/conferences/"),DynamicPart("id", """[^/]+"""),StaticPart("/down"))))
        

// @LINE:20
private[this] lazy val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+"""))))
        

// @LINE:23
private[this] lazy val controllers_Application_main9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("all", """.+"""))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.main(all:String = "none")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/index""","""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/v1/conferences""","""controllers.Conferences.all"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/v1/conferences/$id<[^/]+>""","""controllers.Conferences.get(id:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/v1/conferences""","""controllers.Conferences.create()"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/v1/conferences/$id<[^/]+>""","""controllers.Conferences.delete(id:String)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/v1/conferences/$id<[^/]+>/up""","""controllers.Conferences.up(id:String)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/v1/conferences/$id<[^/]+>/down""","""controllers.Conferences.down(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$all<.+>""","""controllers.Application.main(all:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_main0(params) => {
   call(Param[String]("all", Right("none"))) { (all) =>
        invokeHandler(controllers.Application.main(all), HandlerDef(this, "controllers.Application", "main", Seq(classOf[String]),"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Application_index1(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Views""", Routes.prefix + """views/index"""))
   }
}
        

// @LINE:12
case controllers_Conferences_all2(params) => {
   call { 
        invokeHandler(controllers.Conferences.all, HandlerDef(this, "controllers.Conferences", "all", Nil,"GET", """ API""", Routes.prefix + """api/v1/conferences"""))
   }
}
        

// @LINE:13
case controllers_Conferences_get3(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Conferences.get(id), HandlerDef(this, "controllers.Conferences", "get", Seq(classOf[String]),"GET", """""", Routes.prefix + """api/v1/conferences/$id<[^/]+>"""))
   }
}
        

// @LINE:14
case controllers_Conferences_create4(params) => {
   call { 
        invokeHandler(controllers.Conferences.create(), HandlerDef(this, "controllers.Conferences", "create", Nil,"POST", """""", Routes.prefix + """api/v1/conferences"""))
   }
}
        

// @LINE:15
case controllers_Conferences_delete5(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Conferences.delete(id), HandlerDef(this, "controllers.Conferences", "delete", Seq(classOf[String]),"DELETE", """""", Routes.prefix + """api/v1/conferences/$id<[^/]+>"""))
   }
}
        

// @LINE:16
case controllers_Conferences_up6(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Conferences.up(id), HandlerDef(this, "controllers.Conferences", "up", Seq(classOf[String]),"PUT", """""", Routes.prefix + """api/v1/conferences/$id<[^/]+>/up"""))
   }
}
        

// @LINE:17
case controllers_Conferences_down7(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Conferences.down(id), HandlerDef(this, "controllers.Conferences", "down", Seq(classOf[String]),"PUT", """""", Routes.prefix + """api/v1/conferences/$id<[^/]+>/down"""))
   }
}
        

// @LINE:20
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Assets""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:23
case controllers_Application_main9(params) => {
   call(params.fromPath[String]("all", None)) { (all) =>
        invokeHandler(controllers.Application.main(all), HandlerDef(this, "controllers.Application", "main", Seq(classOf[String]),"GET", """ Fallback""", Routes.prefix + """$all<.+>"""))
   }
}
        
}
    
}
        