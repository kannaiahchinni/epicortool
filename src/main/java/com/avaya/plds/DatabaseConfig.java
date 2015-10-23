/*package com.avaya.plds;


import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@EnableAutoConfiguration
//@MapperScan(basePackages="com.avaya.plds.dao")
public class DatabaseConfig {

    @Autowired
    DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        System.out.println("datasources "+ dataSource);
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setTypeAliasesPackage("com.avaya.plds.beans");
        PathMatchingResourcePatternResolver resolver=new PathMatchingResourcePatternResolver();
        sessionFactory.setMapperLocations(resolver.getResources("classpath:com/avaya/plds/persistance/PLDSPluginDAO.xml"));
        return sessionFactory.getObject();
    }

}
*/