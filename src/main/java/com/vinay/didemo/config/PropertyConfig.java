package com.vinay.didemo.config;

import com.vinay.didemo.beans.FakeDataSource;
import com.vinay.didemo.beans.FakeJMSBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class PropertyConfig {

    @Value("${vinay.username}")
    private String user;

    @Value("${vinay.password}")
    private String password;

    @Value("${vinay.dburl}")
    private String url;

    @Value("${vinay.jms.username}")
    private String  jmsUserName;

    @Value("${vinay.jms.password}")
    private String jmsPassword;

    @Value("${vinay.jms.dburl}")
    private String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return  fakeDataSource;
    }

    @Bean
    public FakeJMSBroker fakeJMSBroker(){
        FakeJMSBroker fakeJMSBroker = new FakeJMSBroker();
        fakeJMSBroker.setUserName(jmsUserName);
        fakeJMSBroker.setPassword(jmsPassword);
        fakeJMSBroker.setUrl(jmsUrl);
        return fakeJMSBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer poperties(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
