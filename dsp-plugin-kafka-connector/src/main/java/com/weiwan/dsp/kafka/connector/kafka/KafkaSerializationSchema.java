package com.weiwan.dsp.kafka.connector.kafka;

import com.alibaba.fastjson.JSONObject;
import com.weiwan.dsp.core.pub.DataRecord;
import org.apache.flink.api.common.serialization.SerializationSchema;

/**
 * @Author: xiaozhennan
 * @Date: 2022/4/4 20:14
 * @Package: com.weiwan.dsp.kafka.connector.kafka
 * @ClassName: KafkaSerializationSchema
 * @Description:
 **/
public class KafkaSerializationSchema implements SerializationSchema<DataRecord> {
    @Override
    public byte[] serialize(DataRecord dataRecord) {
        return JSONObject.toJSONBytes(dataRecord);
    }
}
