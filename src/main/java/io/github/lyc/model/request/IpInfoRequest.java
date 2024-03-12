package io.github.lyc.model.request;

import io.github.lyc.model.enums.RequestMethodEnum;
import io.github.lyc.model.params.IpInfoParams;
import io.github.lyc.model.response.NameResponse;
import io.github.lyc.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @Author: LiangYuChao
 * @Date: 2023/09/22 09:04:04
 * @Version: 1.0
 * @Description: 获取ip地址
 */
@Accessors(chain = true)
public class IpInfoRequest extends BaseRequest<IpInfoParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/ipInfo";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link NameResponse}>
     */
    @Override
    public Class<ResultResponse> getResponseClass() {
        return ResultResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
