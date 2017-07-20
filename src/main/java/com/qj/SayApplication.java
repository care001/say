package com.qj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan
@MapperScan("com.qj.mybatis.mapper")
public class SayApplication {

//	//DataSource配置
//	@Bean
//	@Primary
//	@ConfigurationProperties(prefix = "spring.datasource")
//	public DataSource dataSource(){
//		return new org.apache.tomcat.jdbc.pool.DataSource();
//	}
//
//	//提供SqlSeesion
//	@Bean
//	public SqlSessionFactory sqlSessionFactoryBean() throws Exception{
//		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//		sqlSessionFactoryBean.setDataSource(dataSource());
//		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//		sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatis/*.xml"));
//		return sqlSessionFactoryBean.getObject();
//	}
//
//	@Bean
//	public PlatformTransactionManager transactionManager() {
//		return new DataSourceTransactionManager(dataSource());
//	}

	public static void main(String[] args) {
		SpringApplication.run(SayApplication.class, args);
	}
}
