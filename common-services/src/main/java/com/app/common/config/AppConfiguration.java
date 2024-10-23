package com.app.common.config;

import com.app.message.MessageRecord;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.context.annotation.Configuration;
import java.util.Properties;

@Configuration
public class AppConfiguration {

    @Value("${spring.kafka.bootstrap-servers}")
    String bootstrapServer;
    @Value("${spring.kafka.producer.key-deserializer}") String keyDeserializer;
    @Value("${spring.kafka.producer.value-deserializer}") String valurDeserializer;
    @Value("${spring.kafka.producer.properties.schema.registry.url}") String url;

    @Bean
    public KafkaProducer<String, MessageRecord> getProducer() {
        return new KafkaProducer<>(getProperties());
    }

    public Properties getProperties() {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServer);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, keyDeserializer);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, valurDeserializer);
        props.put("schema.registry.url", url);
        return props;
    }

}
