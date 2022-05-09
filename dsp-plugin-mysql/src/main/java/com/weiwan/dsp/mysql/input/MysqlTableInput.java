package com.weiwan.dsp.mysql.input;

import com.weiwan.dsp.api.pojo.DataRecord;
import com.weiwan.dsp.core.plugin.RichInputPlugin;
import com.weiwan.dsp.mysql.config.MysqlBatchInputConfig;

import java.util.List;

/**
 * @Author: xiaozhennan
 * @Date: 2022/4/2 18:25
 * @Package: com.weiwan.dsp.mysql.input
 * @ClassName: MysqlTableInput
 * @Description: Mysql批量输入插件
 **/
public class MysqlTableInput extends RichInputPlugin<MysqlBatchInputConfig> {
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
    public void init(MysqlBatchInputConfig mysqlBatchInputConfig) {

    }
}
