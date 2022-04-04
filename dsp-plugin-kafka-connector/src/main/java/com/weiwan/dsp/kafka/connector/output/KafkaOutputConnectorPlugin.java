package com.weiwan.dsp.kafka.connector.output;

import com.weiwan.dsp.core.plugin.flink.ConnectorOutputPlugin;
import com.weiwan.dsp.core.pub.DataRecord;
import com.weiwan.dsp.kafka.connector.config.KafkaConnectorOutputPluginConfig;
import com.weiwan.dsp.kafka.connector.kafka.KafkaDeserializationSchema;
import com.weiwan.dsp.kafka.connector.kafka.KafkaSerializationSchema;
import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.streaming.api.functions.sink.SinkFunction;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer011;

import java.util.Properties;

/**
 * @Author: xiaozhennan
 * @Date: 2022/4/4 20:07
 * @Package: com.weiwan.dsp.kafka.connector.output
 * @ClassName: KafkaOutputConnectorPlugin
 * @Description:
 **/
public class KafkaOutputConnectorPlugin extends ConnectorOutputPlugin<KafkaConnectorOutputPluginConfig> {
    @Override
    public SinkFunction<DataRecord> getWriterSink(KafkaConnectorOutputPluginConfig kafkaConnectorOutputPluginConfig) {
        Properties kafkaProperties = kafkaConnectorOutputPluginConfig.getKafkaProperties();
        FlinkKafkaProducer flinkKafkaProducer = new FlinkKafkaProducer(kafkaConnectorOutputPluginConfig.getTopic(), new KafkaSerializationSchema(), kafkaProperties);
        return flinkKafkaProducer;
    }
}
