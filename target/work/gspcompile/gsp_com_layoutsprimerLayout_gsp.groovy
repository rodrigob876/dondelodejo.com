import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_com_layoutsprimerLayout_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/primerLayout.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
printHtmlPart(2)
invokeTag('layoutTitle','g',9,['default':("Grails")],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(1)
invokeTag('javascript','g',11,['library':("jquery")],-1)
printHtmlPart(3)
expressionOut.print(resource(dir: 'images', file: 'favicon.ico'))
printHtmlPart(4)
expressionOut.print(resource(dir: 'images', file: 'apple-touch-icon.png'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'images', file: 'apple-touch-icon-retina.png'))
printHtmlPart(6)
expressionOut.print(resource(dir: 'css', file: 'main.css'))
printHtmlPart(7)
expressionOut.print(resource(dir: 'css', file: 'mobile.css'))
printHtmlPart(7)
expressionOut.print(resource(dir: 'css', file: 'menu.css'))
printHtmlPart(8)
invokeTag('layoutHead','g',18,[:],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',19,[:],-1)
printHtmlPart(9)
})
invokeTag('captureHead','sitemesh',20,[:],1)
printHtmlPart(9)
createTagBody(1, {->
printHtmlPart(10)
expressionOut.print(resource(dir: 'images', file: 'dondelodejo_logo.png'))
printHtmlPart(11)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',27,['controller':("login"),'action':("home")],2)
printHtmlPart(13)
createClosureForHtmlPart(14, 2)
invokeTag('link','g',28,['controller':("estacionamiento"),'action':("listado")],2)
printHtmlPart(15)
createClosureForHtmlPart(16, 2)
invokeTag('link','g',29,['controller':("estacionamiento"),'action':("buscarPorDistancia")],2)
printHtmlPart(17)
if(true && (session.usuario)) {
expressionOut.print(session.usuario.toString())
printHtmlPart(18)
createClosureForHtmlPart(19, 3)
invokeTag('link','g',37,['controller':("login"),'action':("home")],3)
printHtmlPart(18)
createClosureForHtmlPart(20, 3)
invokeTag('link','g',37,['controller':("login"),'action':("logout")],3)
}
else {
printHtmlPart(21)
createClosureForHtmlPart(22, 3)
invokeTag('link','g',38,['controller':("login"),'action':("index")],3)
printHtmlPart(18)
createClosureForHtmlPart(23, 3)
invokeTag('link','g',38,['controller':("usuario"),'action':("create")],3)
}
printHtmlPart(24)
if(true && (flash.message)) {
printHtmlPart(25)
expressionOut.print(flash.message)
printHtmlPart(26)
}
printHtmlPart(1)
invokeTag('layoutBody','g',44,[:],-1)
printHtmlPart(27)
invokeTag('message','g',46,['code':("spinner.alt"),'default':("Loading&hellip;")],-1)
printHtmlPart(26)
invokeTag('javascript','g',47,['library':("application")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',48,[:],-1)
printHtmlPart(9)
})
invokeTag('captureBody','sitemesh',49,[:],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1406159930217L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
