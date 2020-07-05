package com.gm.mpm.data.api;


import com.gm.mpm.common.kit.IdKit;
import com.gm.mpm.data.mapper.FlowMapper;
import com.gm.mpm.data.model.Flow;
import com.gm.mpm.def.api.FlowApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
@Transactional
public class FlowData implements FlowApi {
    @Autowired
    FlowMapper flowMapper;

    @Override
    public Long initiate(Integer initiator) {
        Long id = IdKit.generateUuid();
        Flow flow = new Flow(id,true, new Date(), null, initiator);
        flowMapper.insert(flow);
        return id;
    }

    @Override
    public void close(Long id) {
        Flow flow = new Flow();
        flow.setId(id);
        flow.setState(false);
        flowMapper.updateByPrimaryKeySelective(flow);
    }
}
