package io.github.lyc.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: LiangYuChao
 * @Date: 2023/09/15 08:41:51
 * @Version: 1.0
 * @Description: jlau api客户端
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QiApiClient {
    /**
     * 访问密钥
     */
    private String accessKey;

    /**
     * 密钥
     */
    private String secretKey;

}
