
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[EventHack],Form[EventHack],Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(hackFest: List[EventHack], eventForm: Form[EventHack], userForm: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 


Seq[Any](format.raw/*1.79*/(""" 
"""),_display_(Seq[Any](/*3.2*/main("Hackfest")/*3.18*/{_display_(Seq[Any](format.raw/*3.19*/("""
<meta charset="utf-8">
<div class="jumbotron">
	<div class="container">
		<h1>Hack</h1>
		<p>Descrição geral</p>
		<div class="panel-group" id="accordion">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion"
							href="#collapseOne" class="btn btn-success">Criar Evento</a>
					</h4>
					<div id="collapseOne" class="panel-collapse collapse">
						<div class="panel-body">
							<div class="row">
								<div class="col-md-6">
								"""),_display_(Seq[Any](/*20.10*/form(routes.Application.newEvent())/*20.45*/ {_display_(Seq[Any](format.raw/*20.47*/("""
							"""),_display_(Seq[Any](/*21.9*/inputText(eventForm("titleHack"), 
								'_label -> "Nome", 
								'_help -> "Obrigatório",
								'class -> "form-control", 
								'required -> "required" ))),format.raw/*25.34*/(""" 
							"""),_display_(Seq[Any](/*26.9*/inputText(eventForm("description"), 
								'_label -> "Descrição", 
								'class ->"form-control" ))),format.raw/*28.34*/(""" 
							"""),_display_(Seq[Any](/*29.9*/inputText(eventForm("date"), 
								'_label -> "Data",
								'_help -> "yyyy-mm-dd", 
								'class -> "form-control", 
								'pattern ->"[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]", 
								'required -> "required" ))),format.raw/*34.34*/("""
									<a data-toggle="collapse" data-parent="#accordion"
										href="#collapseOne" class="btn btn-success">Fechar</a>
									<button type="submit" class="btn btn-primary">Criar</button>

								</div>
								<div class="col-md-6">
									<h4>Temas:</h4>
									<input type="checkbox" name="temas[]"
										value="Engenharia de Software">Engenharia de Software<br>
									<input type="checkbox" name="temas[]"
										value="Inteligência Artificial">Inteligência
									Artificial<br> <input type="checkbox" name="temas[]"
										value="Grafos">Grafos<br> <input type="checkbox"
										name="temas[]" value="Algoritmos">Algoritmos<br>
									<input type="checkbox" name="temas[]" value="Música">Música<br>
									<input type="checkbox" name="temas[]" value="Criptografia">Criptografia<br>
								</div>
							</div>
							""")))})),format.raw/*53.9*/("""
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="container">
	<div class="row">
		"""),_display_(Seq[Any](/*63.4*/if(hackFest.size() == 0)/*63.28*/{_display_(Seq[Any](format.raw/*63.29*/("""
		<div class="col-md-12">
			<div class="alert alert-success">
				<h2>Não há nenhum evento registrado</h2>
			</div>
		</div>

		""")))}/*70.4*/else/*70.8*/{_display_(Seq[Any](format.raw/*70.9*/(""" 
		"""),_display_(Seq[Any](/*71.4*/for(listHack <- hackFest) yield /*71.29*/{_display_(Seq[Any](format.raw/*71.30*/("""
		<div class="col-md-4">
			<div class="alert alert-info">
				<h4>"""),_display_(Seq[Any](/*74.10*/listHack/*74.18*/.getTitleHack())),format.raw/*74.33*/("""</h4>
				<p>
					"""),_display_(Seq[Any](/*76.7*/listHack/*76.15*/.getParticipantes().size())),format.raw/*76.41*/(""" participantes - <b>"""),_display_(Seq[Any](/*76.62*/listHack/*76.70*/.getDate())),format.raw/*76.80*/("""</b>
				</p>
			</div>
			<p>"""),_display_(Seq[Any](/*79.8*/listHack/*79.16*/.getDescription())),format.raw/*79.33*/("""</p>
			<p>
				Assunto relacionados:"""),_display_(Seq[Any](/*81.27*/for(assuntos <- listHack.getAssociated()) yield /*81.68*/{_display_(Seq[Any](format.raw/*81.69*/(""" <a href="#">"""),_display_(Seq[Any](/*81.83*/assuntos)),format.raw/*81.91*/(""" </a> """)))})),format.raw/*81.98*/(""" 
				<br>
			<div class="panel-group" id="accordion">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
						<button class="btn btn-info">Mais informações</button>
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapseTwo" class="btn btn-success">Cadastrar-se</a>
						</h4>
						<div id="collapseTwo" class="panel-collapse collapse">
							<div class="panel-body">
							"""),_display_(Seq[Any](/*93.9*/form(routes.Application.addUser(listHack.getId()))/*93.59*/ {_display_(Seq[Any](format.raw/*93.61*/("""
							"""),_display_(Seq[Any](/*94.9*/inputText(userForm("name"), 
								'_label -> "Nome", 
								'_help -> "Obrigatório",
								'class -> "form-control", 
								'required -> "required" ))),format.raw/*98.34*/(""" 
							"""),_display_(Seq[Any](/*99.9*/inputText(userForm("email"), 
								'_label -> "Email", 
								'class ->"form-control" ))),format.raw/*101.34*/("""
									<button type="submit" class="btn btn-primary">Criar</button>
									
									""")))})),format.raw/*104.11*/("""						
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		""")))}))))})),format.raw/*111.5*/("""
		</div>
		</div>
""")))})),format.raw/*114.2*/("""
"""))}
    }
    
    def render(hackFest:List[EventHack],eventForm:Form[EventHack],userForm:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(hackFest,eventForm,userForm)
    
    def f:((List[EventHack],Form[EventHack],Form[User]) => play.api.templates.HtmlFormat.Appendable) = (hackFest,eventForm,userForm) => apply(hackFest,eventForm,userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 19 17:23:07 BRT 2014
                    SOURCE: C:/Users/Wesley/Dropbox/workspaces/workspaceJEE/si1-lab2-P3/app/views/index.scala.html
                    HASH: cf4184d6904f2ce24329cdcb7e4700a10dfa3dee
                    MATRIX: 810->1|998->78|1035->99|1059->115|1097->116|1681->664|1725->699|1765->701|1809->710|1995->874|2040->884|2165->987|2210->997|2456->1221|3347->2081|3499->2198|3532->2222|3571->2223|3721->2355|3733->2359|3771->2360|3811->2365|3852->2390|3891->2391|3996->2460|4013->2468|4050->2483|4105->2503|4122->2511|4170->2537|4227->2558|4244->2566|4276->2576|4342->2607|4359->2615|4398->2632|4472->2670|4529->2711|4568->2712|4618->2726|4648->2734|4687->2741|5180->3199|5239->3249|5279->3251|5323->3260|5503->3418|5548->3428|5663->3520|5787->3611|5903->3691|5955->3711
                    LINES: 26->1|30->1|31->3|31->3|31->3|48->20|48->20|48->20|49->21|53->25|54->26|56->28|57->29|62->34|81->53|91->63|91->63|91->63|98->70|98->70|98->70|99->71|99->71|99->71|102->74|102->74|102->74|104->76|104->76|104->76|104->76|104->76|104->76|107->79|107->79|107->79|109->81|109->81|109->81|109->81|109->81|109->81|121->93|121->93|121->93|122->94|126->98|127->99|129->101|132->104|139->111|142->114
                    -- GENERATED --
                */
            