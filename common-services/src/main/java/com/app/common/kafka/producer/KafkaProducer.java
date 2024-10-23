package com.app.common.kafka.producer;

import com.app.message.MessageRecord;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.UUID;
import java.util.concurrent.Future;

@Service
@Slf4j
@AllArgsConstructor
public class KafkaProducer {

    private final org.apache.kafka.clients.producer.KafkaProducer<String, MessageRecord> producer;

    @Value("${spring.kafka.topic}")
    private String topic;

    public Future<RecordMetadata> send(MessageRecord messageRecord) {
        ProducerRecord<String, MessageRecord> producerRecord = new ProducerRecord<>(
                topic,
                UUID.randomUUID().toString(),
                messageRecord);
        return producer.send(producerRecord);
    }

}
