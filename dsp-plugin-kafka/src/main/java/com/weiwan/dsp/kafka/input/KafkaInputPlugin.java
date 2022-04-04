package com.weiwan.dsp.kafka.input;

import com.weiwan.dsp.core.plugin.RichInputPlugin;
import com.weiwan.dsp.core.pub.DataRecord;
import com.weiwan.dsp.kafka.config.KafkaPluginConfig;

import java.util.List;

/**
 * @Author: xiaozhennan
 * @Date: 2022/4/2 18:37
 * @Package: com.weiwan.dsp.kafka.input
 * @ClassName: KafkaInputPlugin
 * @Description: kafka输入插件
 **/
public class KafkaInputPlugin extends RichInputPlugin<KafkaPluginConfig> {

    @Override
    protected DataRecord read() throws Exception {

        return null;
    }

    @Override
    protected List<DataRecord> batchRead() throws Exception {
        return null;
    }

    @Override
    protected boolean readEnd() throws Exception {
        return false;
    }

    @Override
    public void stop() {

    }

    @Override
    public void init(KafkaPluginConfig kafkaPluginConfig) {

    }
}
