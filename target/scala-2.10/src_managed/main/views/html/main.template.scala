
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply/*1.2*/():play.api.templates.Html = {
        _display_ {import play.api.Play

import play.api.Play.current


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>

<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" data-ng-app="app" data-ng-controller="AppCtrl"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" data-ng-app="app" data-ng-controller="AppCtrl"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" data-ng-app="app" data-ng-controller="AppCtrl"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js" data-ng-app="app" data-ng-controller="AppCtrl">
<!--<![endif]-->

<head>
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <meta name="fragment" content="!" />

  <title>Devoxx</title>
  <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*21.48*/routes/*21.54*/.Assets.at("stylesheets/main.css"))),format.raw/*21.88*/("""">
  <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*22.53*/routes/*22.59*/.Assets.at("images/favicon.png"))),format.raw/*22.91*/("""">
</head>

<body>
  <div class="navbar">
    <div class="container">
      <a class="navbar-toggle" data-toggle="collapse" data-target=".navbar-responsive-collapse">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </a>

      <a class="navbar-brand" href="#">Zenexity - DevoxxFR</a>

      <div class="nav-collapse collapse navbar-responsive-collapse">
        <ul class="nav">
          <li>
            <a data-target="#modalAddConference" data-toggle="modal">Add conference</a>
          </li>
        </ul>
      </div>
    </div>
  </div>

  <div class="container">
    <div data-ng-view="view"></div>
  </div>

  <form class="form-horizontal" data-ng-submit="addConference()">
    <div id="modalAddConference" class="modal fade">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
            <h4 class="modal-title">Add conference</h4>
          </div>
          <div class="modal-body">
              <div class="control-group">
                <label class="control-label" for="addConfName">Name</label>
                <div class="controls">
                  <input type="text" id="addConfName" placeholder="What was the title?" data-ng-model="addConfForm.name">
                </div>
              </div>

              <div class="control-group">
                <label class="control-label" for="addConfSpeaker">Speaker</label>
                <div class="controls">
                  <input type="text" id="addConfSpeaker" placeholder="Who was talking?" data-ng-model="addConfForm.speaker">
                </div>
              </div>
          </div>
          <div class="modal-footer">
            <a href="#" class="btn" data-dismiss="modal" data-ng-click="resetConference()">Close</a>
            <button type="submit" href="#" class="btn btn-primary">Add</a>
          </div>
        </div>
      </div>
    </div>
  </form>

  <script src=""""),_display_(Seq[Any](/*82.17*/routes/*82.23*/.Assets.at("javascripts/vendors/jquery.min.js"))),format.raw/*82.70*/(""""></script>
  <script src=""""),_display_(Seq[Any](/*83.17*/routes/*83.23*/.Assets.at("javascripts/vendors/angular.min.js"))),format.raw/*83.71*/(""""></script>
  <script src=""""),_display_(Seq[Any](/*84.17*/routes/*84.23*/.Assets.at("javascripts/vendors/angular-resource.min.js"))),format.raw/*84.80*/(""""></script>
  <script src=""""),_display_(Seq[Any](/*85.17*/routes/*85.23*/.Assets.at("javascripts/vendors/lodash.min.js"))),format.raw/*85.70*/(""""></script>
  <script src=""""),_display_(Seq[Any](/*86.17*/routes/*86.23*/.Assets.at("javascripts/vendors/bootstrap.min.js"))),format.raw/*86.73*/(""""></script>
  <script src=""""),_display_(Seq[Any](/*87.17*/routes/*87.23*/.Assets.at("javascripts/vendors/ui-bootstrap-tpls-0.2.0.min.js"))),format.raw/*87.87*/(""""></script>
  <script src=""""),_display_(Seq[Any](/*88.17*/routes/*88.23*/.Assets.at("javascripts/main.js"))),format.raw/*88.56*/(""""></script>

</body>
</html>
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Mar 31 15:23:15 CEST 2013
                    SOURCE: /Users/Paul/Work/projects/devoxx/app/views/main.scala.html
                    HASH: 879656fb72431c9bda45fbb28b6e44c6f7e79939
                    MATRIX: 497->1|626->3|654->57|1457->824|1472->830|1528->864|1619->919|1634->925|1688->957|3824->3057|3839->3063|3908->3110|3972->3138|3987->3144|4057->3192|4121->3220|4136->3226|4215->3283|4279->3311|4294->3317|4363->3364|4427->3392|4442->3398|4514->3448|4578->3476|4593->3482|4679->3546|4743->3574|4758->3580|4813->3613
                    LINES: 19->1|25->1|27->5|43->21|43->21|43->21|44->22|44->22|44->22|104->82|104->82|104->82|105->83|105->83|105->83|106->84|106->84|106->84|107->85|107->85|107->85|108->86|108->86|108->86|109->87|109->87|109->87|110->88|110->88|110->88
                    -- GENERATED --
                */
            