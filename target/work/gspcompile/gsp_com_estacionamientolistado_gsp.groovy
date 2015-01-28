import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_com_estacionamientolistado_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/estacionamiento/listado.gsp" }
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
if(true && (session.usuario)) {
printHtmlPart(4)
if(true && (!session.usuario.esAdministrador())) {
printHtmlPart(5)
}
printHtmlPart(6)
}
else {
printHtmlPart(7)
}
printHtmlPart(8)
})
invokeTag('captureHead','sitemesh',16,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(9)
for( e in (estacionamientoInstanciaListado) ) {
printHtmlPart(10)
expressionOut.print(e.nombre)
printHtmlPart(11)
expressionOut.print(e.ubicacion?.direccionStr)
printHtmlPart(12)
expressionOut.print(e.fechaAlta)
printHtmlPart(13)
expressionOut.print(e.fechaModificacion)
printHtmlPart(14)
expressionOut.print(e.fechaBaja)
printHtmlPart(15)
expressionOut.print(e.ubicacion?.direccionX)
printHtmlPart(16)
expressionOut.print(e.ubicacion?.direccionY)
printHtmlPart(17)
expressionOut.print(e.id)
printHtmlPart(18)
createClosureForHtmlPart(19, 3)
invokeTag('link','g',46,['controller':("estacionamiento"),'action':("editar"),'id':(e.id)],3)
printHtmlPart(20)
createClosureForHtmlPart(21, 3)
invokeTag('link','g',47,['controller':("estacionamiento"),'action':("borrar"),'id':(e.id)],3)
printHtmlPart(20)
createClosureForHtmlPart(22, 3)
invokeTag('link','g',48,['controller':("estacionamiento"),'action':("operador"),'id':(e.id)],3)
printHtmlPart(23)
}
printHtmlPart(24)
expressionOut.print(estacionamientoInstanciaTotal)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',61,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1406159930558L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
