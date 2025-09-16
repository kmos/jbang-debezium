package org.acme;

import io.debezium.engine.RecordChangeEvent;
import io.debezium.runtime.Capturing;
import jakarta.enterprise.context.ApplicationScoped;
import org.apache.kafka.connect.source.SourceRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class DebeziumListener {

    private final Logger logger = LoggerFactory.getLogger(DebeziumListener.class);

    @Capturing()
    public void capture(RecordChangeEvent<SourceRecord> event) throws Exception {
        logger.info("capturing event {}", event.record());
    }
}
