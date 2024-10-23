package com.app.common.service;

import com.app.common.kafka.producer.KafkaProducer;
import com.app.message.MessageRecord;
import lombok.AllArgsConstructor;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@Service
@AllArgsConstructor
public class NotificationService {

    private final KafkaProducer producer;

    public Mono<String> send(MessageRecord message) {
        Future<RecordMetadata> record = producer.send(message);
        return Mono.fromFuture(CompletableFuture.supplyAsync(() -> message)).map(rec -> rec.toString());
    }

}
