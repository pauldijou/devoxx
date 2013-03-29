
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
  <p class="link">
    <i class=" icon-dashboard icon-2x"></i>
    <a href="http://devoxx-pdi.rhcloud.com">http://devoxx-pdi.rhcloud.com</a>
  </p>
  <p class="link">
    <i class=" icon-github icon-2x"></i>
    <a href="https://github.com/pauldijou/devoxx">https://github.com/pauldijou/devoxx</a>
  </p>
</div>
<ul class="list-unstyled conferences">
  <li data-ng-repeat="conf in data.conferences | orderBy:'-note':false">
    <span class="label" data-ng-class=""""),format.raw/*16.40*/("""{"""),format.raw/*16.41*/("""true: 'label-success', false: 'label-danger'"""),format.raw/*16.85*/("""}"""),format.raw/*16.86*/("""[conf.note > 0]">"""),format.raw/*16.103*/("""{"""),format.raw/*16.104*/("""{"""),format.raw/*16.105*/("""conf.note"""),format.raw/*16.114*/("""}"""),format.raw/*16.115*/("""}"""),format.raw/*16.116*/("""</span>

    <span class="name">"""),format.raw/*18.24*/("""{"""),format.raw/*18.25*/("""{"""),format.raw/*18.26*/("""conf.name"""),format.raw/*18.35*/("""}"""),format.raw/*18.36*/("""}"""),format.raw/*18.37*/("""</span>
    <span class="speaker"> (by """),format.raw/*19.32*/("""{"""),format.raw/*19.33*/("""{"""),format.raw/*19.34*/("""conf.speaker"""),format.raw/*19.46*/("""}"""),format.raw/*19.47*/("""}"""),format.raw/*19.48*/(""")</span>

    <button type="button" class="btn" data-ng-click="up(conf.id)"><i class="icon-plus"></i> Awesome!</button>
    <button type="button" class="btn" data-ng-click="down(conf.id)"><i class="icon-minus"></i> Not so good...</button>

  </li>
</ul>"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Mar 29 10:28:40 CET 2013
                    SOURCE: /Users/Paul/Work/projects/devoxx/app/views/index.scala.html
                    HASH: 5277b0a635578f9a9cea00c33d5cb82efeadd8b7
                    MATRIX: 498->1|576->3|1256->655|1285->656|1357->700|1386->701|1432->718|1462->719|1492->720|1530->729|1560->730|1590->731|1650->763|1679->764|1708->765|1745->774|1774->775|1803->776|1870->815|1899->816|1928->817|1968->829|1997->830|2026->831
                    LINES: 19->1|22->1|37->16|37->16|37->16|37->16|37->16|37->16|37->16|37->16|37->16|37->16|39->18|39->18|39->18|39->18|39->18|39->18|40->19|40->19|40->19|40->19|40->19|40->19
                    -- GENERATED --
                */
            