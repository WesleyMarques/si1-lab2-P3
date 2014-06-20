
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object moreInfo extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[EventHack,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(hackFest: EventHack):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""
<meta charset="utf-8">
<div class="modal fade" id="info_"""),_display_(Seq[Any](/*3.35*/hackFest/*3.43*/.getId())),format.raw/*3.51*/("""" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title" id="myModalLabel">"""),_display_(Seq[Any](/*8.52*/hackFest/*8.60*/.getTitleHack())),format.raw/*8.75*/("""</h4>
      </div>
      <div class="modal-body">
        <p>
	  		"""),_display_(Seq[Any](/*12.7*/hackFest/*12.15*/.getDate())),format.raw/*12.25*/("""
        </p>
        """),_display_(Seq[Any](/*14.10*/hackFest/*14.18*/.getDescription())),format.raw/*14.35*/("""
        <br><br>
	    <p><b>Temas:</b>
	    """),_display_(Seq[Any](/*17.7*/for(tema <- hackFest.getAssociated()) yield /*17.44*/ {_display_(Seq[Any](format.raw/*17.46*/("""
	    	<a href="#">"""),_display_(Seq[Any](/*18.20*/tema)),format.raw/*18.24*/(""" </a> 
	    """)))})),format.raw/*19.7*/("""
	    <p>
      </div>
      <div class="modal-footer" style="text-align: left;">
      <h4>Confirmaram presença: </h4><br>
      <ul>
        """),_display_(Seq[Any](/*25.10*/for(nome <- hackFest.getParticipantes()) yield /*25.50*/ {_display_(Seq[Any](format.raw/*25.52*/("""
        	<p><b><li>"""),_display_(Seq[Any](/*26.21*/nome/*26.25*/.getName)),format.raw/*26.33*/("""</li></b></p>
        """)))})),format.raw/*27.10*/("""
       </ul>
      </div>
    </div>
  </div>
</div>"""))}
    }
    
    def render(hackFest:EventHack): play.api.templates.HtmlFormat.Appendable = apply(hackFest)
    
    def f:((EventHack) => play.api.templates.HtmlFormat.Appendable) = (hackFest) => apply(hackFest)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 20 09:27:26 BRT 2014
                    SOURCE: C:/Users/Wesley/Dropbox/workspaces/workspaceJEE/si1-lab2-P3/app/views/moreInfo.scala.html
                    HASH: ad85219174d6765f31ffc6eb9f9b2f95d59fc4c3
                    MATRIX: 780->1|895->22|990->82|1006->90|1035->98|1402->430|1418->438|1454->453|1561->525|1578->533|1610->543|1671->568|1688->576|1727->593|1811->642|1864->679|1904->681|1961->702|1987->706|2032->720|2218->870|2274->910|2314->912|2372->934|2385->938|2415->946|2471->970
                    LINES: 26->1|29->1|31->3|31->3|31->3|36->8|36->8|36->8|40->12|40->12|40->12|42->14|42->14|42->14|45->17|45->17|45->17|46->18|46->18|47->19|53->25|53->25|53->25|54->26|54->26|54->26|55->27
                    -- GENERATED --
                */
            