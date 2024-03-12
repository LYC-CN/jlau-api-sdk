package io.github.lyc.model.request;

import io.github.lyc.model.enums.RequestMethodEnum;
import io.github.lyc.model.params.HoroscopeParams;
import io.github.lyc.model.response.NameResponse;
import io.github.lyc.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @Author: LiangYuChao
 * @Date: 2023年09月17日 08:38
 * @Version: 1.0
 * @Description: 获取星座运势
 */
@Accessors(chain = true)
public class HoroscopeRequest extends BaseRequest<HoroscopeParams, ResultResponse> {

    @Override
    public String getPath() {
        return "/horoscope";
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
