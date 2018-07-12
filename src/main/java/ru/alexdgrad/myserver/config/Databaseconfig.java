package ru.alexdgrad.myserver.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@Configuration
@EnableJpaRepositories("ru.alexdgrad.myserver.repository")
@EnableTransactionManagement
@ComponentScan("ru.alexdgrad.myserver")
@PropertySource("classpath:db.properties")
public class Databaseconfig {

    @Resource
    private Environment env;
}
