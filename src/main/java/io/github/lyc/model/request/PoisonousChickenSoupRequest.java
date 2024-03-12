package io.github.lyc.model.request;

import io.github.lyc.model.enums.RequestMethodEnum;
import io.github.lyc.model.params.PoisonousChickenSoupParams;
import io.github.lyc.model.response.PoisonousChickenSoupResponse;
import lombok.experimental.Accessors;

/**
 * @Author: LiangYuChao
 * @Date: 2023年09月17日 08:38
 * @Version: 1.0
 * @Description: 获取随机鸡汤
 */
@Accessors(chain = true)
public class PoisonousChickenSoupRequest extends BaseRequest<PoisonousChickenSoupParams, PoisonousChickenSoupResponse> {

    @Override
    public String getPath() {
        return "/poisonousChickenSoup";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link PoisonousChickenSoupResponse}>
     */
    @Override
    public Class<PoisonousChickenSoupResponse> getResponseClass() {
        return PoisonousChickenSoupResponse.class;
    }

    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
