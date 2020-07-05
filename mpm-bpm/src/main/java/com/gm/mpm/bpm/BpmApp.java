package com.gm.mpm.bpm;


import com.gm.mpm.data.mapper.FlowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Jason
 */
@SpringBootApplication
public class BpmApp {
    public static void main(String[] args) {
        SpringApplication.run(BpmApp.class, args);
    }
}
