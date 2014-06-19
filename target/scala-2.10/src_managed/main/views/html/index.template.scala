
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[EventHack],Form[EventHack],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(hackFest: List[EventHack], metaForm: Form[EventHack]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.56*/(""" 

"""),_display_(Seq[Any](/*3.2*/main("Hackfest")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""
<div class="jumbotron">
	<div class="container">
		<h1>Hack</h1>
	</div>
</div>
<div class="continer">

</div>


""")))})),format.raw/*14.2*/("""
"""))}
    }
    
    def render(hackFest:List[EventHack],metaForm:Form[EventHack]): play.api.templates.HtmlFormat.Appendable = apply(hackFest,metaForm)
    
    def f:((List[EventHack],Form[EventHack]) => play.api.templates.HtmlFormat.Appendable) = (hackFest,metaForm) => apply(hackFest,metaForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 19 09:32:25 BRT 2014
                    SOURCE: C:/Users/Wesley/Dropbox/workspaces/workspaceJEE/si1-lab2-P3/app/views/index.scala.html
                    HASH: 3208871fae853af68ef034eec4c85cb3f931cfd6
                    MATRIX: 799->1|947->55|985->59|1009->75|1048->77|1194->192
                    LINES: 26->1|29->1|31->3|31->3|31->3|42->14
                    -- GENERATED --
                */
            