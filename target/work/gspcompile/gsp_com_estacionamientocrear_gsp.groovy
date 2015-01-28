import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_com_estacionamientocrear_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/estacionamiento/crear.gsp" }
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
invokeTag('textField','g',15,['name':("nombre"),'value':(estacionamiento.nombre)],-1)
printHtmlPart(7)
invokeTag('textField','g',18,['name':("direccionStr"),'value':(estacionamiento.ubicacion.direccionStr)],-1)
printHtmlPart(8)
invokeTag('textField','g',21,['name':("localidad"),'value':(estacionamiento.ubicacion.localidad)],-1)
printHtmlPart(9)
invokeTag('textField','g',24,['name':("pais"),'value':(estacionamiento.ubicacion.pais)],-1)
printHtmlPart(10)
invokeTag('textField','g',27,['name':("numCocheras"),'value':(estacionamiento.numCocheras?:1)],-1)
printHtmlPart(11)
invokeTag('textField','g',30,['name':("precioCocheraHora"),'value':(precioCocheraHora?precioCocheraHora:null)],-1)
printHtmlPart(12)
invokeTag('textField','g',33,['name':("precioCocheraFraccion"),'value':(precioCocheraFraccion?precioCocheraFraccion:null)],-1)
printHtmlPart(13)
invokeTag('submitButton','g',35,['name':("crear"),'value':("Crear el Estacionamiento")],-1)
printHtmlPart(14)
})
invokeTag('form','g',37,['class':("formulario"),'action':("guardar")],2)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',40,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1406159930554L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
