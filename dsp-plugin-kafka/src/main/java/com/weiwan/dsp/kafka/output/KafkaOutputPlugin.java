package com.weiwan.dsp.kafka.output;

import com.weiwan.dsp.api.pojo.DataRecord;
import com.weiwan.dsp.core.plugin.RichOutputPlugin;
import com.weiwan.dsp.kafka.config.KafkaPluginConfig;

import java.util.List;

/**
 * @Author: xiaozhennan
 * @Date: 2022/4/2 18:37
 * @Package: com.weiwan.dsp.kafka.output
 * @ClassName: KafkaOutputPlugin
 * @Description: kafka输出插件
 **/
public class KafkaOutputPlugin extends RichOutputPlugin<KafkaPluginConfig> {
    @Override
    public void write(DataRecord dataRecord) throws Exception {

    }

    @Override
    public void batchWrite(List<DataRecord> list) throws Exception {

    }

    @Override
    public void stop() {

    }

    @Override
    public void init(KafkaPluginConfig kafkaPluginConfig) {

    }
}
