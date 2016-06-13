package br.jornal.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import br.jornal.interceptors.AutorizadorInterceptor;

@Configuration
public class AppConfig extends WebMvcAutoConfigurationAdapter {
	
	@Autowired
	private AutorizadorInterceptor interceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor);
	}
	
	
	
	
}
