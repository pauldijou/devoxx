
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply/*1.2*/():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""

<div class="jumbotron">
  <h1>Rate your conf!</h1>
  <p>There is no control, no restriction, you can vote as many times as you want, but we trust you! So please, don't cheat too much.</p>
  <a href="http://devoxx-pdi.rhcloud.com">http://devoxx-pdi.rhcloud.com</a>
</div>
<ul class="list-unstyled conferences">
  <li data-ng-repeat="conf in data.conferences | orderBy:'-note':false">
    <span class="label" data-ng-class=""""),format.raw/*10.40*/("""{"""),format.raw/*10.41*/("""true: 'label-success', false: 'label-danger'"""),format.raw/*10.85*/("""}"""),format.raw/*10.86*/("""[conf.note > 0]">"""),format.raw/*10.103*/("""{"""),format.raw/*10.104*/("""{"""),format.raw/*10.105*/("""conf.note"""),format.raw/*10.114*/("""}"""),format.raw/*10.115*/("""}"""),format.raw/*10.116*/("""</span>

    <span class="name">"""),format.raw/*12.24*/("""{"""),format.raw/*12.25*/("""{"""),format.raw/*12.26*/("""conf.name"""),format.raw/*12.35*/("""}"""),format.raw/*12.36*/("""}"""),format.raw/*12.37*/("""</span>
    <span class="speaker"> (by """),format.raw/*13.32*/("""{"""),format.raw/*13.33*/("""{"""),format.raw/*13.34*/("""conf.speaker"""),format.raw/*13.46*/("""}"""),format.raw/*13.47*/("""}"""),format.raw/*13.48*/(""")</span>

    <button type="button" class="btn" data-ng-click="up(conf.id)">+ Awesome!</button>
    <button type="button" class="btn" data-ng-click="down(conf.id)">- Not so good...</button>

  </li>
</ul>"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Mar 29 09:39:17 CET 2013
                    SOURCE: /Users/Paul/Work/projects/devoxx/app/views/index.scala.html
                    HASH: 23129cd64242dc28350f14c16ef3c3892ee79b0b
                    MATRIX: 498->1|576->3|1028->427|1057->428|1129->472|1158->473|1204->490|1234->491|1264->492|1302->501|1332->502|1362->503|1422->535|1451->536|1480->537|1517->546|1546->547|1575->548|1642->587|1671->588|1700->589|1740->601|1769->602|1798->603
                    LINES: 19->1|22->1|31->10|31->10|31->10|31->10|31->10|31->10|31->10|31->10|31->10|31->10|33->12|33->12|33->12|33->12|33->12|33->12|34->13|34->13|34->13|34->13|34->13|34->13
                    -- GENERATED --
                */
            