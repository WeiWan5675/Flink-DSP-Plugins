package com.weiwan.dsp.mysql.output;

import com.weiwan.dsp.api.pojo.DataRecord;
import com.weiwan.dsp.core.plugin.RichOutputPlugin;
import com.weiwan.dsp.mysql.config.MysqlOutputPluginConfig;

import java.util.List;

/**
 * @Author: xiaozhennan
 * @Date: 2022/4/2 18:28
 * @Package: com.weiwan.dsp.mysql.output
 * @ClassName: MysqlTableOutput
 * @Description: Mysql单表输出
 **/
public class MysqlTableOutput extends RichOutputPlugin<MysqlOutputPluginConfig> {
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
    public void init(MysqlOutputPluginConfig mysqlOutputPluginConfig) {

    }
}
