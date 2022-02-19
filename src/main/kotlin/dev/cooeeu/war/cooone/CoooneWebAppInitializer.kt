package dev.cooeeu.war.cooone

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer

class CoooneWebAppInitializer : AbstractAnnotationConfigDispatcherServletInitializer() {
    override fun getServletMappings(): Array<String> {
        return arrayOf("/")
    }

    override fun getRootConfigClasses(): Array<Class<*>> {
        return arrayOf()
    }

    override fun getServletConfigClasses(): Array<Class<*>> {
        return arrayOf(CoooneWebConfig::class.java)
    }
}