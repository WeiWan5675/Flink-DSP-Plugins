package com.weiwan.dsp.kafka.connector.input;

import com.weiwan.dsp.core.plugin.flink.ConnectorInputPlugin;
import com.weiwan.dsp.core.pub.DataRecord;
import com.weiwan.dsp.kafka.connector.config.KafkaConnectorInputPluginConfig;
import com.weiwan.dsp.kafka.connector.kafka.KafkaDeserializationSchema;
import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.streaming.api.functions.source.SourceFunction;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;

import java.util.Properties;

/**
 * @Author: xiaozhennan
 * @Date: 2022/4/4 19:30
 * @Package: com.weiwan.dsp.kafka.connector.input
 * @ClassName: KafkaInputConnectorPlugin
 * @Description: kafak连接器插件
 **/
public class KafkaInputConnectorPlugin extends ConnectorInputPlugin<KafkaConnectorInputPluginConfig> {

    @Override
    public SourceFunction<DataRecord> getReaderSource(KafkaConnectorInputPluginConfig pluginConfig) {
        Properties properties = pluginConfig.getKafkaProperties();
        String topic = pluginConfig.getTopic();
        FlinkKafkaConsumer kafkaConsumer = new FlinkKafkaConsumer(topic, new KafkaDeserializationSchema(), properties);
        return kafkaConsumer;
    }
}
