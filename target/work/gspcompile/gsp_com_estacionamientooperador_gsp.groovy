import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_com_estacionamientooperador_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/estacionamiento/operador.gsp" }
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
expressionOut.print(estacionamiento.id)
printHtmlPart(6)
for( c in (estacionamiento.cocheras) ) {
printHtmlPart(7)
if(true && (c.estaOcupada())) {
printHtmlPart(8)
}
else {
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(3, {->
printHtmlPart(11)
expressionOut.print(c.numero)
printHtmlPart(12)
expressionOut.print(c.precioCocheraHora)
printHtmlPart(13)
expressionOut.print(c.precioCocheraFraccion)
printHtmlPart(14)
invokeTag('textField','g',26,['style':("display:none"),'name':("estacionamientoId"),'value':(estacionamiento.id)],-1)
printHtmlPart(15)
invokeTag('textField','g',27,['style':("display:none"),'name':("cocheraId"),'value':(c.id)],-1)
printHtmlPart(15)
if(true && (c.estaOcupada())) {
printHtmlPart(16)
invokeTag('submitButton','g',29,['name':("liberar"),'value':("LIBERAR")],-1)
printHtmlPart(17)
}
else {
printHtmlPart(16)
invokeTag('submitButton','g',32,['name':("ocupar"),'value':("OCUPAR")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
})
invokeTag('form','g',34,['action':("cambiarEstadoCochera")],3)
printHtmlPart(19)
if(true && ((c.numero % 10)==0)) {
printHtmlPart(20)
}
printHtmlPart(21)
}
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',44,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1406159930552L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
