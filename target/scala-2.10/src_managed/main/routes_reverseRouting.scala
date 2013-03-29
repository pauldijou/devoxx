// @SOURCE:/Users/Paul/Work/projects/devoxx/conf/routes
// @HASH:20bd7dc5aada3116147ddc2f2069e76187c9b2c7
// @DATE:Fri Mar 29 09:58:19 CET 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseConferences {
    

// @LINE:16
def up(id:String): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "api/v1/conferences/" + implicitly[PathBindable[String]].unbind("id", id) + "/up")
}
                                                

// @LINE:15
def delete(id:String): Call = {
   Call("DELETE", _prefix + { _defaultPrefix } + "api/v1/conferences/" + implicitly[PathBindable[String]].unbind("id", id))
}
                                                

// @LINE:14
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/v1/conferences")
}
                                                

// @LINE:17
def down(id:String): Call = {
   Call("PUT", _prefix + { _defaultPrefix } + "api/v1/conferences/" + implicitly[PathBindable[String]].unbind("id", id) + "/down")
}
                                                

// @LINE:12
def all(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/v1/conferences")
}
                                                

// @LINE:13
def get(id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/v1/conferences/" + implicitly[PathBindable[String]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:23
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "views/index")
}
                                                

// @LINE:23
// @LINE:6
def main(all:String): Call = {
   (all: @unchecked) match {
// @LINE:6
case (all) if all == "none" => Call("GET", _prefix)
                                                        
// @LINE:23
case (all) if true => Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("all", all))
                                                        
   }
}
                                                
    
}
                          

// @LINE:20
class ReverseAssets {
    

// @LINE:20
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseConferences {
    

// @LINE:16
def up : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Conferences.up",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/conferences/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", id) + "/up"})
      }
   """
)
                        

// @LINE:15
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Conferences.delete",
   """
      function(id) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/conferences/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:14
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Conferences.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/conferences"})
      }
   """
)
                        

// @LINE:17
def down : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Conferences.down",
   """
      function(id) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/conferences/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", id) + "/down"})
      }
   """
)
                        

// @LINE:12
def all : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Conferences.all",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/conferences"})
      }
   """
)
                        

// @LINE:13
def get : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Conferences.get",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/v1/conferences/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:23
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "views/index"})
      }
   """
)
                        

// @LINE:23
// @LINE:6
def main : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.main",
   """
      function(all) {
      if (all == """ + implicitly[JavascriptLitteral[String]].to("none") + """) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("all", all)})
      }
      }
   """
)
                        
    
}
              

// @LINE:20
class ReverseAssets {
    

// @LINE:20
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseConferences {
    

// @LINE:16
def up(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Conferences.up(id), HandlerDef(this, "controllers.Conferences", "up", Seq(classOf[String]), "PUT", """""", _prefix + """api/v1/conferences/$id<[^/]+>/up""")
)
                      

// @LINE:15
def delete(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Conferences.delete(id), HandlerDef(this, "controllers.Conferences", "delete", Seq(classOf[String]), "DELETE", """""", _prefix + """api/v1/conferences/$id<[^/]+>""")
)
                      

// @LINE:14
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Conferences.create(), HandlerDef(this, "controllers.Conferences", "create", Seq(), "POST", """""", _prefix + """api/v1/conferences""")
)
                      

// @LINE:17
def down(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Conferences.down(id), HandlerDef(this, "controllers.Conferences", "down", Seq(classOf[String]), "PUT", """""", _prefix + """api/v1/conferences/$id<[^/]+>/down""")
)
                      

// @LINE:12
def all(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Conferences.all(), HandlerDef(this, "controllers.Conferences", "all", Seq(), "GET", """ API""", _prefix + """api/v1/conferences""")
)
                      

// @LINE:13
def get(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Conferences.get(id), HandlerDef(this, "controllers.Conferences", "get", Seq(classOf[String]), "GET", """""", _prefix + """api/v1/conferences/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:23
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Views""", _prefix + """views/index""")
)
                      

// @LINE:6
def main(all:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.main(all), HandlerDef(this, "controllers.Application", "main", Seq(classOf[String]), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:20
class ReverseAssets {
    

// @LINE:20
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Assets""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      