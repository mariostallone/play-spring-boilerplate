package config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.AbstractPlatformTransactionManager;

/**
 * Project : play-spring-boilerplate
 * Authors: mario
 * Date: 07/08/13
 * Time: 12:18 PM
 */
@Configuration
@EnableTransactionManagement
@ComponentScan({"com.dreamgains"})
public class HibernateConfig {
    @Bean
    public SessionFactory sessionFactory(){
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        return cfg.buildSessionFactory();
    }

    @Bean
    public AbstractPlatformTransactionManager transactionManager(){
        return new HibernateTransactionManager(sessionFactory());
    }
}
