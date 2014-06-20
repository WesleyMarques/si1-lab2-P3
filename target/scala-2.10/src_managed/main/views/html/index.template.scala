
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
		<h1>Hackfest of programming</h1>
		<p>É uma área destinada a todos os amantes do mundo da programação, onde você encontrará<br>
		   uma vasta lista de eventos de grande relevância na área de computação. NÃO PERCA!</p>
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
								"""),_display_(Seq[Any](/*21.10*/form(routes.Application.newEvent())/*21.45*/ {_display_(Seq[Any](format.raw/*21.47*/("""
							"""),_display_(Seq[Any](/*22.9*/inputText(eventForm("titleHack"), 
								'_label -> "Nome", 
								'_help -> "Obrigatório",
								'class -> "form-control", 
								'required -> "required" ))),format.raw/*26.34*/(""" 
							"""),_display_(Seq[Any](/*27.9*/inputText(eventForm("description"), 
								'_label -> "Descrição", 
								'class ->"form-control" ))),format.raw/*29.34*/(""" 
							"""),_display_(Seq[Any](/*30.9*/inputText(eventForm("date"), 
								'_label -> "Data",
								'_help -> "yyyy-mm-dd", 
								'class -> "form-control", 
								'pattern ->"[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]", 
								'required -> "required" ))),format.raw/*35.34*/("""
									<a data-toggle="collapse" data-parent="#accordion"
										href="#collapseOne" class="btn btn-success">Fechar</a>
									<button type="submit" class="btn btn-primary">Criar</button>

								</div>
								<div class="col-md-6">
									<h4>Temas:</h4>
									<input type="checkbox" name="associated[]"
										value="Engenharia de Software">Engenharia de Software<br>
									<input type="checkbox" name="associated[]"
										value="Inteligência Artificial">Inteligência
									Artificial<br> <input type="checkbox" name="associated[]"
										value="Grafos">Grafos<br> <input type="checkbox"
										name="associated[]" value="Algoritmos">Algoritmos<br>
									<input type="checkbox" name="associated[]" value="Música">Música<br>
									<input type="checkbox" name="associated[]" value="Criptografia">Criptografia<br>
								</div>
							</div>
							""")))})),format.raw/*54.9*/("""
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="container">
	<div class="row">
		"""),_display_(Seq[Any](/*64.4*/if(hackFest.size() == 0)/*64.28*/{_display_(Seq[Any](format.raw/*64.29*/("""
		<div class="col-md-12">
			<div class="alert alert-success">
				<h2>Não há nenhum evento registrado</h2>
			</div>
		</div>

		""")))}/*71.4*/else/*71.8*/{_display_(Seq[Any](format.raw/*71.9*/(""" 
		"""),_display_(Seq[Any](/*72.4*/for(listHack <- hackFest) yield /*72.29*/{_display_(Seq[Any](format.raw/*72.30*/("""
		"""),_display_(Seq[Any](/*73.4*/moreInfo(listHack))),format.raw/*73.22*/("""
		<div class="col-md-4">
			<div class="alert alert-info">
				<h4>"""),_display_(Seq[Any](/*76.10*/listHack/*76.18*/.getTitleHack())),format.raw/*76.33*/("""</h4>
				<p>
					"""),_display_(Seq[Any](/*78.7*/listHack/*78.15*/.getParticipantes().size())),format.raw/*78.41*/(""" participantes - <b>"""),_display_(Seq[Any](/*78.62*/listHack/*78.70*/.getDate())),format.raw/*78.80*/("""</b>
				</p>
			</div>
			<div style="height:125px;"><p>"""),_display_(Seq[Any](/*81.35*/listHack/*81.43*/.getDescription())),format.raw/*81.60*/("""</p></div>
			<p>
				Assunto relacionados:
				"""),_display_(Seq[Any](/*84.6*/for(assuntos <- listHack.getAssociated()) yield /*84.47*/{_display_(Seq[Any](format.raw/*84.48*/(""" 
				<a href="#">"""),_display_(Seq[Any](/*85.18*/assuntos)),format.raw/*85.26*/(""" </a> 
				""")))})),format.raw/*86.6*/(""" 
				<br>
			<div class="panel-group" id="accordion">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title">
						<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#info_"""),_display_(Seq[Any](/*92.93*/listHack/*92.101*/.getId())),format.raw/*92.109*/("""">Mais informações</button>
							<a data-toggle="collapse" data-parent="#accordion"
								href="#collapse"""),_display_(Seq[Any](/*94.25*/listHack/*94.33*/.getId())),format.raw/*94.41*/("""" class="btn btn-success">Cadastrar-se</a>
						</h4>
						<div id="collapse"""),_display_(Seq[Any](/*96.25*/listHack/*96.33*/.getId())),format.raw/*96.41*/("""" class="panel-collapse collapse">
							<div class="panel-body">
							"""),_display_(Seq[Any](/*98.9*/form(routes.Application.addUser(listHack.getId()))/*98.59*/ {_display_(Seq[Any](format.raw/*98.61*/("""
							"""),_display_(Seq[Any](/*99.9*/inputText(userForm("name"), 
								'_label -> "Nome", 
								'_help -> "Obrigatório",
								'class -> "form-control", 
								'required -> "required" ))),format.raw/*103.34*/(""" 
							"""),_display_(Seq[Any](/*104.9*/inputText(userForm("email"), 
								'_label -> "Email", 
								'class ->"form-control" ))),format.raw/*106.34*/("""
									<button type="submit" class="btn btn-primary">Criar</button>
									
									""")))})),format.raw/*109.11*/("""						
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		""")))}))))})),format.raw/*116.5*/("""
		</div>
		</div>
""")))})),format.raw/*119.2*/("""
"""))}
    }
    
    def render(hackFest:List[EventHack],eventForm:Form[EventHack],userForm:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(hackFest,eventForm,userForm)
    
    def f:((List[EventHack],Form[EventHack],Form[User]) => play.api.templates.HtmlFormat.Appendable) = (hackFest,eventForm,userForm) => apply(hackFest,eventForm,userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 20 09:31:08 BRT 2014
                    SOURCE: C:/Users/Wesley/Dropbox/workspaces/workspaceJEE/si1-lab2-P3/app/views/index.scala.html
                    HASH: 37b29a2eff8e435acccfed81d005e7bc632063ef
                    MATRIX: 810->1|998->78|1035->99|1059->115|1097->116|1861->844|1905->879|1945->881|1989->890|2175->1054|2220->1064|2345->1167|2390->1177|2636->1401|3557->2291|3709->2408|3742->2432|3781->2433|3931->2565|3943->2569|3981->2570|4021->2575|4062->2600|4101->2601|4140->2605|4180->2623|4285->2692|4302->2700|4339->2715|4394->2735|4411->2743|4459->2769|4516->2790|4533->2798|4565->2808|4659->2866|4676->2874|4715->2891|4799->2940|4856->2981|4895->2982|4950->3001|4980->3009|5023->3021|5308->3270|5326->3278|5357->3286|5503->3396|5520->3404|5550->3412|5665->3491|5682->3499|5712->3507|5822->3582|5881->3632|5921->3634|5965->3643|6146->3801|6192->3811|6307->3903|6431->3994|6547->4074|6599->4094
                    LINES: 26->1|30->1|31->3|31->3|31->3|49->21|49->21|49->21|50->22|54->26|55->27|57->29|58->30|63->35|82->54|92->64|92->64|92->64|99->71|99->71|99->71|100->72|100->72|100->72|101->73|101->73|104->76|104->76|104->76|106->78|106->78|106->78|106->78|106->78|106->78|109->81|109->81|109->81|112->84|112->84|112->84|113->85|113->85|114->86|120->92|120->92|120->92|122->94|122->94|122->94|124->96|124->96|124->96|126->98|126->98|126->98|127->99|131->103|132->104|134->106|137->109|144->116|147->119
                    -- GENERATED --
                */
            