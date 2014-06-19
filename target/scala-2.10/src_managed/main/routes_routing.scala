// @SOURCE:C:/Users/Wesley/Dropbox/workspaces/workspaceJEE/si1-lab2-P3/conf/routes
// @HASH:47faf541838d08a17675306f6894bbe5006f3ba6
// @DATE:Thu Jun 19 17:18:01 BRT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

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
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_hacks1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("hackfest"))))
        

// @LINE:8
private[this] lazy val controllers_Application_newEvent2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cadastraEvento"))))
        

// @LINE:9
private[this] lazy val controllers_Application_addUser3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addUser/"),DynamicPart("id", """[^/]+""",true),StaticPart("/add"))))
        

// @LINE:12
private[this] lazy val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """hackfest""","""controllers.Application.hacks()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cadastraEvento""","""controllers.Application.newEvent()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addUser/$id<[^/]+>/add""","""controllers.Application.addUser(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_hacks1(params) => {
   call { 
        invokeHandler(controllers.Application.hacks(), HandlerDef(this, "controllers.Application", "hacks", Nil,"GET", """""", Routes.prefix + """hackfest"""))
   }
}
        

// @LINE:8
case controllers_Application_newEvent2(params) => {
   call { 
        invokeHandler(controllers.Application.newEvent(), HandlerDef(this, "controllers.Application", "newEvent", Nil,"POST", """""", Routes.prefix + """cadastraEvento"""))
   }
}
        

// @LINE:9
case controllers_Application_addUser3(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.addUser(id), HandlerDef(this, "controllers.Application", "addUser", Seq(classOf[Long]),"POST", """""", Routes.prefix + """addUser/$id<[^/]+>/add"""))
   }
}
        

// @LINE:12
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     