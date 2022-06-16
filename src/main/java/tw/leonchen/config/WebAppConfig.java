package tw.leonchen.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//@Configuration
//@ComponentScan(basePackages = "tw.leonchen")
//@EnableWebMvc
import org.springframework.web.servlet.view.InternalResourceViewResolver;



//@Configuration
//@ComponentScan(basePackages = "tw.leonchen")
//@EnableWebMvc

//    /* 上面三個等於下面三個設定
//<context:annotation-config/>
//<context:component-scan base-package="tw.leonchen"/>
//<mvc:annotation-driven/>
public class WebAppConfig implements WebMvcConfigurer {

	@Override  
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	public InternalResourceViewResolver irViewResolver() {
		InternalResourceViewResolver irve1 = new InternalResourceViewResolver();
		irve1.setPrefix("/WEB-INF/pages/");
		irve1.setSuffix(".jsp");
		irve1.setOrder(6);
		return irve1;
	}

}
