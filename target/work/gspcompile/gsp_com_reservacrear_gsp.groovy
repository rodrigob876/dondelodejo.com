import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_com_reservacrear_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/reserva/crear.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("primerLayout")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('textField','g',13,['style':("display:none"),'name':("estacionamientoId"),'value':(estacionamientoId)],-1)
printHtmlPart(7)
invokeTag('datePicker','g',17,['name':("horaDeInicio"),'value':(reservaFiltro?.horaDeInicio),'precision':("minute"),'years':([2014,2015])],-1)
printHtmlPart(8)
invokeTag('textField','g',19,['name':("horaDeInicio"),'value':(reservaFiltro?.horaDeInicio)],-1)
printHtmlPart(9)
invokeTag('textField','g',23,['name':("horasReservadas"),'value':(reservaFiltro?.horasReservadas)],-1)
printHtmlPart(10)
invokeTag('submitButton','g',26,['name':("crear"),'value':("Crear la Reserva")],-1)
printHtmlPart(11)
})
invokeTag('form','g',28,['class':("formulario"),'action':("alta")],2)
printHtmlPart(12)
for( r in (listadoReservas) ) {
printHtmlPart(13)
expressionOut.print(r.horaDeInicio)
printHtmlPart(14)
expressionOut.print(r.horasReservadas)
printHtmlPart(15)
expressionOut.print(r.estado)
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',44,['controller':("reserva"),'action':("borrar"),'id':(r.id)],3)
printHtmlPart(18)
}
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',50,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1406159930633L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
