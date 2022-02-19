package dev.cooeeu.war.cooone

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer
import org.springframework.web.servlet.view.freemarker.FreeMarkerView
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver

@Configuration
@EnableWebMvc
@ComponentScan("dev.cooeeu.war.cooone")
open class CoooneWebConfig: WebMvcConfigurer {

    override fun configureViewResolvers(registry: ViewResolverRegistry) {
        registry.viewResolver(viewResolver())
    }

    @Bean
    open fun freeMarkerConfigurer(): FreeMarkerConfigurer = FreeMarkerConfigurer().apply {
        setTemplateLoaderPath("/WEB-INF/freemarker")
        setDefaultEncoding("UTF-8")
    }

    @Bean
    open fun viewResolver(): FreeMarkerViewResolver = FreeMarkerViewResolver().apply {
        setViewClass(FreeMarkerView::class.java)
        setSuffix(".ftl")
        isCache = true
        setContentType("text/html;charset=UTF-8")
    }
}