import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_com_estacionamientoeditar_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/estacionamiento/editar.gsp" }
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
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
invokeTag('textField','g',16,['style':("display:none"),'name':("id"),'value':(id)],-1)
printHtmlPart(10)
invokeTag('textField','g',19,['name':("nombre"),'value':(estacionamiento.nombre)],-1)
printHtmlPart(11)
invokeTag('textField','g',22,['name':("direccionStr"),'value':(estacionamiento.ubicacion?.direccionStr)],-1)
printHtmlPart(12)
invokeTag('textField','g',25,['name':("localidad"),'value':(estacionamiento.ubicacion?.localidad)],-1)
printHtmlPart(13)
invokeTag('textField','g',28,['name':("pais"),'value':(estacionamiento.ubicacion?.pais)],-1)
printHtmlPart(14)
invokeTag('submitButton','g',30,['name':("actualizar"),'value':("Guardar Cambios")],-1)
printHtmlPart(1)
})
invokeTag('form','g',31,['action':("actualizar")],2)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',33,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1406159930572L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
