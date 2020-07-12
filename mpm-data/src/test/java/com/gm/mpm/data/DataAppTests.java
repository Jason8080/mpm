package com.gm.mpm.data;

import com.gm.mpm.data.config.MybatisConfig;
import com.gm.mpm.data.mapper.FlowMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisConfig.class)
public class DataAppTests {
    @Autowired
    FlowMapper flowMapper;

    @Test
    public void testAuto(){
        System.out.println(flowMapper.selectByPrimaryKey(1L));
    }
}
