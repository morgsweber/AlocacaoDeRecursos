package com.pucrs.alocacaorecursos.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Profile("local")
public class DataSourceConfiguration {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.h2.datasource")
    public DataSourceProperties h2DBProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @Qualifier("h2Datasource")
    public DataSource h2DataSource(@Qualifier("h2DBProperties") DataSourceProperties h2DBProperties) {
        return h2DBProperties.initializeDataSourceBuilder().build();
    }

}
