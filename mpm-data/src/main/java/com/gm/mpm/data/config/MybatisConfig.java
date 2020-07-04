package com.gm.mpm.data.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.gm.mpm.data.mapper")
public class MybatisConfig {
}
