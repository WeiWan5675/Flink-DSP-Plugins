package com.weiwan.dsp.kafka.connector.kafka;

import com.alibaba.fastjson.JSONObject;
import com.weiwan.dsp.api.pojo.DataRecord;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;

import java.io.IOException;

/**
 * @Author: xiaozhennan
 * @Date: 2022/4/4 20:15
 * @Package: com.weiwan.dsp.kafka.connector.kafka
 * @ClassName: KafkaDeserializationSchema
 * @Description:
 **/
public class KafkaDeserializationSchema implements DeserializationSchema<DataRecord> {
    @Override
    public DataRecord deserialize(byte[] bytes) throws IOException {
        return JSONObject.parseObject(bytes, DataRecord.class);
    }

    @Override
    public boolean isEndOfStream(DataRecord dataRecord) {
        return false;
    }

    @Override
    public TypeInformation<DataRecord> getProducedType() {
        return TypeInformation.of(DataRecord.class);
    }
}
