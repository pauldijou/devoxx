
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
  <p class="link hidden-phone">
    <i class=" icon-dashboard icon-2x"></i>
    <a href="http://devoxx-pdi.rhcloud.com">http://devoxx-pdi.rhcloud.com</a>
  </p>
  <p class="link hidden-phone">
    <i class=" icon-github icon-2x"></i>
    <a href="https://github.com/pauldijou/devoxx">https://github.com/pauldijou/devoxx</a>
  </p>
</div>

<div class="row row-search">
  <div class="col-span-12">
    <h4>Filters:</h2>
  </div>
  <div class="col-span-4"><input type="text" placeholder="All" data-ng-model="data.search.$"/></div>
  <div class="col-span-4"><input type="text" placeholder="Conference name" data-ng-model="data.search.name"/></div>
  <div class="col-span-4"><input type="text" placeholder="Speaker(s)" data-ng-model="data.search.speaker"/></div>
</div>

<div class="conferences">
  <h4>Conferences:</h4>

  <ul class="list-unstyled conferences">
    <li data-ng-repeat="conf in data.conferences | filter:data.search | orderBy:'-note':false">
      <span class="label" data-ng-class=""""),format.raw/*29.42*/("""{"""),format.raw/*29.43*/("""true: 'label-success', false: 'label-danger'"""),format.raw/*29.87*/("""}"""),format.raw/*29.88*/("""[conf.note > 0]">"""),format.raw/*29.105*/("""{"""),format.raw/*29.106*/("""{"""),format.raw/*29.107*/("""conf.note"""),format.raw/*29.116*/("""}"""),format.raw/*29.117*/("""}"""),format.raw/*29.118*/("""</span>

      <button type="button" class="btn" data-ng-click="up(conf.id)" tooltip-placement="top" tooltip="Awesome!">
        <i class="icon-plus"></i>
      </button>
      <button type="button" class="btn" data-ng-click="down(conf.id)" tooltip-placement="top" tooltip="Not so good...">
        <i class="icon-minus"></i>
      </button>

      <span class="name">"""),format.raw/*38.26*/("""{"""),format.raw/*38.27*/("""{"""),format.raw/*38.28*/("""conf.name"""),format.raw/*38.37*/("""}"""),format.raw/*38.38*/("""}"""),format.raw/*38.39*/("""</span>
      <span class="speaker"> (by """),format.raw/*39.34*/("""{"""),format.raw/*39.35*/("""{"""),format.raw/*39.36*/("""conf.speaker"""),format.raw/*39.48*/("""}"""),format.raw/*39.49*/("""}"""),format.raw/*39.50*/(""")</span>
    </li>
  </ul>
</div>"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Mar 31 15:23:15 CEST 2013
                    SOURCE: /Users/Paul/Work/projects/devoxx/app/views/index.scala.html
                    HASH: fe459821d1a8c065621387a186055657d62bf12a
                    MATRIX: 498->1|576->3|1788->1187|1817->1188|1889->1232|1918->1233|1964->1250|1994->1251|2024->1252|2062->1261|2092->1262|2122->1263|2518->1631|2547->1632|2576->1633|2613->1642|2642->1643|2671->1644|2740->1685|2769->1686|2798->1687|2838->1699|2867->1700|2896->1701
                    LINES: 19->1|22->1|50->29|50->29|50->29|50->29|50->29|50->29|50->29|50->29|50->29|50->29|59->38|59->38|59->38|59->38|59->38|59->38|60->39|60->39|60->39|60->39|60->39|60->39
                    -- GENERATED --
                */
            