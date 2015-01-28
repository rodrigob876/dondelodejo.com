import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_com_estacionamientolistadoPorDistancia_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/estacionamiento/listadoPorDistancia.gsp" }
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
expressionOut.print(direccion)
printHtmlPart(6)
expressionOut.print(metros)
printHtmlPart(7)
for( e in (resultados) ) {
printHtmlPart(8)
expressionOut.print(e.nombre)
printHtmlPart(9)
expressionOut.print(e.ubicacion.direccionStr)
printHtmlPart(10)
expressionOut.print(e.fechaAlta)
printHtmlPart(11)
expressionOut.print(e.fechaModificacion)
printHtmlPart(12)
expressionOut.print(e.fechaBaja)
printHtmlPart(13)
expressionOut.print(e.ubicacion.direccionX)
printHtmlPart(14)
expressionOut.print(e.ubicacion.direccionY)
printHtmlPart(15)
expressionOut.print(e.id)
printHtmlPart(16)
}
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',35,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1406159930564L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}