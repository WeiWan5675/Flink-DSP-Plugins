package com.weiwan.dsp.kafka.connector.config;

import com.weiwan.dsp.api.config.core.PluginConfigs;
import com.weiwan.dsp.api.plugin.PluginConfig;
import com.weiwan.dsp.common.config.ConfigOption;
import com.weiwan.dsp.common.config.ConfigOptions;

import java.util.Properties;

/**
 * @Author: xiaozhennan
 * @Date: 2022/4/4 20:08
 * @Package: com.weiwan.dsp.kafka.connector.config
 * @ClassName: KafkaConnectorOutputPluginConfig
 * @Description:
 **/
public class KafkaConnectorOutputPluginConfig extends PluginConfig {

    ConfigOption<String> BOOTSTRAP_SERVERS = ConfigOptions.key("bootstrapServers")
            .defaultValue("127.0.0.1")
            .description("Kafka链接的servers")
            .required(true)
            .ok(String.class);

    ConfigOption<String> TOPIC = ConfigOptions.key("topic")
            .defaultValue("")
            .description("Kafka链接的servers")
            .required(true)
            .ok(String.class);

    public String getBootstrapServers() {
        return this.getVal(BOOTSTRAP_SERVERS);
    }

    public Properties getKafkaProperties() {
        Properties properties = new Properties();
        PluginConfigs pluginConfigs = this.getPluginConfigs();
        for (String key : pluginConfigs.keySet()) {
            properties.put(key, pluginConfigs.getStringVal(key));
            // TODO 这里有bug
        }
        return properties;
    }

    public String getTopic() {
        return this.getVal(TOPIC);
    }

}
