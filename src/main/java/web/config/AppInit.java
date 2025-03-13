package web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Метод, указывающий на класс конфигурации
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("Запуск Spring 2");
    return null;
//    return new Class<?>[]{RootConfig.class}; // Важно: Загружаем RootConfig!
    }

    // Добавление конфигурации, в которой инициализируем ViewResolver, для корректного отображения jsp.
    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("Запуск Spring 2");
        return new Class<?>[]{WebConfig.class};
    }


    /* Данный метод указывает url, на котором будет базироваться приложение */
    @Override
    protected String[] getServletMappings() {
        System.out.println("Запуск Spring 3");
        return new String[]{"/"};

    }
}