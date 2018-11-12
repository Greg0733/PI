// @GENERATOR:play-routes-compiler
// @SOURCE:/home/minh/PI/play-java-starter-example/conf/routes
// @DATE:Sun Nov 11 17:48:06 CET 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:12
  CountController_0: controllers.CountController,
  // @LINE:15
  AsyncController_2: controllers.AsyncController,
  // @LINE:18
  Assets_6: controllers.Assets,
  // @LINE:21
  SignUp_5: controllers.SignUp,
  // @LINE:24
  SignIn_3: controllers.SignIn,
  // @LINE:27
  RemoveUser_4: controllers.RemoveUser,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:12
    CountController_0: controllers.CountController,
    // @LINE:15
    AsyncController_2: controllers.AsyncController,
    // @LINE:18
    Assets_6: controllers.Assets,
    // @LINE:21
    SignUp_5: controllers.SignUp,
    // @LINE:24
    SignIn_3: controllers.SignIn,
    // @LINE:27
    RemoveUser_4: controllers.RemoveUser
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_6, SignUp_5, SignIn_3, RemoveUser_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_6, SignUp_5, SignIn_3, RemoveUser_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix, """controllers.HomeController.write"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sign_up""", """controllers.SignUp.sign_up(user:String, password:String, email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sign_in""", """controllers.SignIn.sign_in(user:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """remove_user""", """controllers.RemoveUser.remove_user(user:String, password:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_write1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_write1_invoker = createInvoker(
    HomeController_1.write,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "write",
      Nil,
      "POST",
      this.prefix + """""",
      """write data into file""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_CountController_count2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count2_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_AsyncController_message3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message3_invoker = createInvoker(
    AsyncController_2.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_SignUp_sign_up5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sign_up")))
  )
  private[this] lazy val controllers_SignUp_sign_up5_invoker = createInvoker(
    SignUp_5.sign_up(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUp",
      "sign_up",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """sign_up""",
      """add user in database""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_SignIn_sign_in6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sign_in")))
  )
  private[this] lazy val controllers_SignIn_sign_in6_invoker = createInvoker(
    SignIn_3.sign_in(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignIn",
      "sign_in",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """sign_in""",
      """check user id""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_RemoveUser_remove_user7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("remove_user")))
  )
  private[this] lazy val controllers_RemoveUser_remove_user7_invoker = createInvoker(
    RemoveUser_4.remove_user(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RemoveUser",
      "remove_user",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """remove_user""",
      """remove user from database""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:9
    case controllers_HomeController_write1_route(params@_) =>
      call { 
        controllers_HomeController_write1_invoker.call(HomeController_1.write)
      }
  
    // @LINE:12
    case controllers_CountController_count2_route(params@_) =>
      call { 
        controllers_CountController_count2_invoker.call(CountController_0.count)
      }
  
    // @LINE:15
    case controllers_AsyncController_message3_route(params@_) =>
      call { 
        controllers_AsyncController_message3_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:18
    case controllers_Assets_versioned4_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_6.versioned(path, file))
      }
  
    // @LINE:21
    case controllers_SignUp_sign_up5_route(params@_) =>
      call(params.fromQuery[String]("user", None), params.fromQuery[String]("password", None), params.fromQuery[String]("email", None)) { (user, password, email) =>
        controllers_SignUp_sign_up5_invoker.call(SignUp_5.sign_up(user, password, email))
      }
  
    // @LINE:24
    case controllers_SignIn_sign_in6_route(params@_) =>
      call(params.fromQuery[String]("user", None), params.fromQuery[String]("password", None)) { (user, password) =>
        controllers_SignIn_sign_in6_invoker.call(SignIn_3.sign_in(user, password))
      }
  
    // @LINE:27
    case controllers_RemoveUser_remove_user7_route(params@_) =>
      call(params.fromQuery[String]("user", None), params.fromQuery[String]("password", None)) { (user, password) =>
        controllers_RemoveUser_remove_user7_invoker.call(RemoveUser_4.remove_user(user, password))
      }
  }
}