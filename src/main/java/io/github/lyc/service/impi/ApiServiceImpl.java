package io.github.lyc.service.impi;

import io.github.lyc.client.QiApiClient;
import io.github.lyc.exception.ApiException;
import io.github.lyc.model.request.*;
import io.github.lyc.model.request.*;
import io.github.lyc.model.response.LoveResponse;
import io.github.lyc.model.response.PoisonousChickenSoupResponse;
import io.github.lyc.model.response.RandomWallpaperResponse;
import io.github.lyc.model.response.ResultResponse;
import io.github.lyc.service.ApiService;
import io.github.lyc.service.BaseService;
import lombok.extern.slf4j.Slf4j;


/**
 * @Author: LiangYuChao
 * @Date: 2023年09月17日 08:42
 * @Version: 1.0
 * @Description:
 */
@Slf4j
public class ApiServiceImpl extends BaseService implements ApiService {

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(request);
    }

    @Override
    public PoisonousChickenSoupResponse getPoisonousChickenSoup(QiApiClient qiApiClient) throws ApiException {
        PoisonousChickenSoupRequest request = new PoisonousChickenSoupRequest();
        return request(qiApiClient, request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public RandomWallpaperResponse getRandomWallpaper(QiApiClient qiApiClient, RandomWallpaperRequest request) throws ApiException {
        return request(qiApiClient, request);
    }

    @Override
    public LoveResponse randomLoveTalk() throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(request);
    }

    @Override
    public LoveResponse randomLoveTalk(QiApiClient qiApiClient) throws ApiException {
        LoveRequest request = new LoveRequest();
        return request(qiApiClient, request);
    }

    @Override
    public ResultResponse horoscope(HoroscopeRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse horoscope(QiApiClient qiApiClient, HoroscopeRequest request) throws ApiException {
        return request(qiApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(QiApiClient qiApiClient, IpInfoRequest request) throws ApiException {
        return request(qiApiClient, request);
    }

    @Override
    public ResultResponse getIpInfo(IpInfoRequest request) throws ApiException {
        return request(request);
    }

    @Override
    public ResultResponse getWeatherInfo(QiApiClient qiApiClient, WeatherRequest request) throws ApiException {
        return request(qiApiClient, request);
    }

    @Override
    public ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException {
        return request(request);
    }
}
