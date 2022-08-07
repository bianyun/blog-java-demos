package blog.wisecoder.demo.mybatisplus.enumtypehandler.config;

import blog.wisecoder.demo.mybatisplus.enumtypehandler.enums.converter.StringToEnumConverterFactory;
import org.springframework.format.FormatterRegistry;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 应用 WEB 设置
 *
 * @author bianyun
 */
@Component
public class AppWebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverterFactory(new StringToEnumConverterFactory());
    }
}
