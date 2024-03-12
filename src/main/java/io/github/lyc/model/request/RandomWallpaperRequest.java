package io.github.lyc.model.request;

import io.github.lyc.model.enums.RequestMethodEnum;
import io.github.lyc.model.params.RandomWallpaperParams;
import io.github.lyc.model.response.RandomWallpaperResponse;
import io.github.lyc.model.response.ResultResponse;
import lombok.experimental.Accessors;

/**
 * @Author: LiangYuChao
 * @Date: 2023年09月17日 08:38
 * @Version: 1.0
 * @Description: 获取随机壁纸
 */
@Accessors(chain = true)
public class RandomWallpaperRequest extends BaseRequest<RandomWallpaperParams, RandomWallpaperResponse> {
    @Override
    public String getPath() {
        return "/randomWallpaper";
    }

    /**
     * 获取响应类
     *
     * @return {@link Class}<{@link ResultResponse}>
     */
    @Override
    public Class<RandomWallpaperResponse> getResponseClass() {
        return RandomWallpaperResponse.class;
    }


    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }
}
