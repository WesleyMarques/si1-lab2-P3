
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
		<p>Descri��o geral</p>
		<button class="btn btn-success">Criar Evento</button>
	</div>
</div>
<div class="container">
	<div class="row">
		<div class="col-md-4">
			<div class="alert alert-info">
				<h4>T�tulo</h4>
				<p>n participantes - <b>DD/MM/AAAA</b></p>
			</div>
			<p>conteudo</p>
			<button class="btn btn-info">Mais informa��es</button>
			<button class="btn btn-success">Cadastrar-se</button>
		</div>
		<div class="col-md-4">teste</div>
		<div class="col-md-4">teste</div>
		<div class="col-md-4">test</div>

	</div>

</div>


""")))})),format.raw/*31.2*/("""
"""))}
    }
    
    def render(hackFest:List[EventHack],metaForm:Form[EventHack]): play.api.templates.HtmlFormat.Appendable = apply(hackFest,metaForm)
    
    def f:((List[EventHack],Form[EventHack]) => play.api.templates.HtmlFormat.Appendable) = (hackFest,metaForm) => apply(hackFest,metaForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 19 14:58:18 BRT 2014
                    SOURCE: C:/Users/Wesley/Dropbox/workspaces/workspaceJEE/si1-lab2-P3/app/views/index.scala.html
                    HASH: 93061abe6d35bf68da33eea5268702eb64384fd0
                    MATRIX: 799->1|947->55|984->58|1008->74|1047->76|1689->687
                    LINES: 26->1|29->1|31->3|31->3|31->3|59->31
                    -- GENERATED --
                */
            