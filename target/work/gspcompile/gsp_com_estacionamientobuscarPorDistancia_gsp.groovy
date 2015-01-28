import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_com_estacionamientobuscarPorDistancia_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/estacionamiento/buscarPorDistancia.gsp" }
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
invokeTag('textField','g',15,['name':("direccion"),'value':(direccion),'placeholder':("Escriba Aqui la direccion"),'required':("")],-1)
printHtmlPart(7)
invokeTag('textField','g',18,['name':("localidad"),'value':(localidad)],-1)
printHtmlPart(8)
invokeTag('textField','g',21,['name':("pais"),'value':(pais)],-1)
printHtmlPart(9)
invokeTag('field','g',24,['type':("number"),'name':("metros"),'value':(metros)],-1)
printHtmlPart(10)
invokeTag('submitButton','g',26,['name':("buscar"),'value':("Buscar para esta distancia")],-1)
printHtmlPart(11)
})
invokeTag('form','g',28,['class':("formulario"),'action':("buscarPorDistancia")],2)
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',31,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1406159930562L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
