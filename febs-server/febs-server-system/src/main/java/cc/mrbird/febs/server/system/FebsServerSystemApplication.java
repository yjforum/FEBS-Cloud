package cc.michael.febs.server.system;

import cc.michael.febs.common.security.starter.annotation.EnableFebsCloudResourceServer;
import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author michael
 */
@EnableAsync
@SpringBootApplication
@EnableFebsCloudResourceServer
@EnableTransactionManagement
@EnableDistributedTransaction
@MapperScan("cc.michael.febs.server.system.mapper")
public class FebsServerSystemApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FebsServerSystemApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
