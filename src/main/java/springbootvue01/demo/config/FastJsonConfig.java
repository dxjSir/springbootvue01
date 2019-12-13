package springbootvue01.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class FastJsonConfig implements WebMvcConfigurer{


    @Qualifier("gsonHttpMessageConverter")
    @Autowired
    private GsonHttpMessageConverter gsonHttpMessageConverter;

}
