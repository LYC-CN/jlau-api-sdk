package io.github.lyc.model.request;

import io.github.lyc.model.enums.RequestMethodEnum;
import io.github.lyc.model.params.NameParams;
import io.github.lyc.model.response.NameResponse;
import lombok.experimental.Accessors;

/**
 * @Author: LiangYuChao
 * @Date: 2023年09月17日 08:38
 * @Version: 1.0
 * @Description: 获取输入名字
 */
@Accessors(chain = true)
public class NameRequest extends BaseRequest<NameParams, NameResponse> {

    @Override
    public String getPath() {
        return "/name";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<NameResponse> getResponseClass() {
        return NameResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
