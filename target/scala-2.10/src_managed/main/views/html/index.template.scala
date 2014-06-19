
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
<meta charset="utf-8">
<div class="jumbotron">
	<div class="container">
		<h1>Hack</h1>
		<p>Descrição geral</p>
		<button class="btn btn-success">Criar Evento</button>
	</div>
</div>
<div class="container">
	<div class="row">
	"""),_display_(Seq[Any](/*14.3*/if(hackFest.size() == 0)/*14.27*/{_display_(Seq[Any](format.raw/*14.28*/("""
	<div class="col-md-12">
		<div class="alert alert-success">
		<h2>Não há nenhum evento registrado</h2>
		</div>
	</div>
	
	""")))}/*21.3*/else/*21.7*/{_display_(Seq[Any](format.raw/*21.8*/("""
	"""),_display_(Seq[Any](/*22.3*/for(listHack <- hackFest) yield /*22.28*/{_display_(Seq[Any](format.raw/*22.29*/("""
		<div class="col-md-4">
			<div class="alert alert-info">
				<h4>"""),_display_(Seq[Any](/*25.10*/listHack/*25.18*/.getTitleHack())),format.raw/*25.33*/("""</h4>
				<p>"""),_display_(Seq[Any](/*26.9*/listHack/*26.17*/.getParticipantes().size())),format.raw/*26.43*/(""" participantes - <b>"""),_display_(Seq[Any](/*26.64*/listHack/*26.72*/.getDate())),format.raw/*26.82*/("""</b></p>
			</div>
			<p>"""),_display_(Seq[Any](/*28.8*/listHack/*28.16*/.getDescription())),format.raw/*28.33*/("""</p>
			<button class="btn btn-info">Mais informações</button>
			<button class="btn btn-success">Cadastrar-se</button>
		</div>
		""")))}))))})),format.raw/*32.5*/("""
	</div>

</div>


""")))})),format.raw/*38.2*/("""
"""))}
    }
    
    def render(hackFest:List[EventHack],metaForm:Form[EventHack]): play.api.templates.HtmlFormat.Appendable = apply(hackFest,metaForm)
    
    def f:((List[EventHack],Form[EventHack]) => play.api.templates.HtmlFormat.Appendable) = (hackFest,metaForm) => apply(hackFest,metaForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 19 15:12:09 BRT 2014
                    SOURCE: C:/Users/Wesley/Dropbox/workspaces/workspaceJEE/si1-lab2-P3/app/views/index.scala.html
                    HASH: 2eaf5826da2bb7b8328f8123da022d7a280a137c
                    MATRIX: 799->1|947->55|984->58|1008->74|1047->76|1312->306|1345->330|1384->331|1528->457|1540->461|1578->462|1616->465|1657->490|1696->491|1801->560|1818->568|1855->583|1904->597|1921->605|1969->631|2026->652|2043->660|2075->670|2136->696|2153->704|2192->721|2360->854|2411->874
                    LINES: 26->1|29->1|31->3|31->3|31->3|42->14|42->14|42->14|49->21|49->21|49->21|50->22|50->22|50->22|53->25|53->25|53->25|54->26|54->26|54->26|54->26|54->26|54->26|56->28|56->28|56->28|60->32|66->38
                    -- GENERATED --
                */
            