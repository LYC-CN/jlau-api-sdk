package io.github.lyc.config;

import io.github.lyc.client.QiApiClient;
import io.github.lyc.service.ApiService;
import io.github.lyc.service.impi.ApiServiceImpl;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: LiangYuChao
 * @Date: 2023年08月17日 21:09
 * @Version: 1.0
 * @Description:
 */
@Data
@Configuration
@ConfigurationProperties("qi.api.client")
@ComponentScan
public class QiApiClientConfig {
    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 秘密密钥
     */
    private String secretKey;

    /**
     * 网关
     */
    private String host;

    @Bean
    public QiApiClient qiApiClient() {
        return new QiApiClient(accessKey, secretKey);
    }

    @Bean
    public ApiService apiService() {
        ApiServiceImpl apiService = new ApiServiceImpl();
        apiService.setQiApiClient(new QiApiClient(accessKey, secretKey));
        if (StringUtils.isNotBlank(host)) {
            apiService.setGatewayHost(host);
        }
        return apiService;
    }
}
