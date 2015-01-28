import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_com_estacionamientomostrar_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/estacionamiento/mostrar.gsp" }
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
expressionOut.print(estacionamiento.nombre)
printHtmlPart(6)
expressionOut.print(estacionamiento.numCocheras)
printHtmlPart(7)
expressionOut.print(cocherasLibres)
printHtmlPart(8)
if(true && ((cocherasLibres!=0))) {
printHtmlPart(9)
createClosureForHtmlPart(10, 3)
invokeTag('link','g',14,['controller':("reserva"),'action':("crear"),'id':(estacionamiento.id)],3)
printHtmlPart(11)
}
printHtmlPart(12)
expressionOut.print(estacionamiento.id)
printHtmlPart(13)
expressionOut.print(estacionamiento.ubicacion?.direccionStr)
printHtmlPart(14)
expressionOut.print(estacionamiento.fechaAlta)
printHtmlPart(15)
expressionOut.print(estacionamiento.fechaModificacion)
printHtmlPart(16)
expressionOut.print(estacionamiento.ubicacion?.direccionX)
printHtmlPart(17)
expressionOut.print(estacionamiento.ubicacion?.direccionY)
printHtmlPart(18)
expressionOut.print(estacionamiento.ubicacion?.direccionStr)
printHtmlPart(19)
expressionOut.print(estacionamiento.ubicacion?.localidad)
printHtmlPart(19)
expressionOut.print(estacionamiento.ubicacion?.pais)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',33,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1406159930570L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
