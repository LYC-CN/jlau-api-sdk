package io.github.lyc.service;

import cn.hutool.http.HttpResponse;
import io.github.lyc.client.QiApiClient;
import io.github.lyc.exception.ApiException;
import io.github.lyc.model.request.*;
import io.github.lyc.model.response.LoveResponse;
import io.github.lyc.model.response.PoisonousChickenSoupResponse;
import io.github.lyc.model.response.RandomWallpaperResponse;
import io.github.lyc.model.response.ResultResponse;

/**
 * @Author: LiangYuChao
 * @Date: 2023年09月17日 08:34
 * @Version: 1.0
 * @Description:
 */
public interface ApiService {
    /**
     * 通用请求
     *
     * @param request 要求
     * @return {@link HttpResponse}
     * @throws ApiException 业务异常
     */

    <O, T extends ResultResponse> T request(BaseRequest<O, T> request) throws ApiException;

    /**
     * 通用请求
     *
     * @param qiApiClient jlau api客户端
     * @param request     要求
     * @return {@link T}
     * @throws ApiException 业务异常
     */
    <O, T extends ResultResponse> T request(QiApiClient qiApiClient, BaseRequest<O, T> request) throws ApiException;


    /**
     * 获取随机鸡汤
     *
     * @return {@link PoisonousChickenSoupResponse}
     * @throws ApiException 业务异常
     */
    PoisonousChickenSoupResponse getPoisonousChickenSoup() throws ApiException;

    /**
     * 获取随机鸡汤
     *
     * @param qiApiClient jlau api客户端
     * @return {@link PoisonousChickenSoupResponse}
     * @throws ApiException 业务异常
     */
    PoisonousChickenSoupResponse getPoisonousChickenSoup(QiApiClient qiApiClient) throws ApiException;

    /**
     * 获取随机壁纸
     *
     * @param request 要求
     * @return {@link RandomWallpaperResponse}
     * @throws ApiException 业务异常
     */
    RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws ApiException;

    /**
     * 获取随机壁纸
     *
     * @param qiApiClient jlau api客户端
     * @param request     要求
     * @return {@link RandomWallpaperResponse}
     * @throws ApiException 业务异常
     */
    RandomWallpaperResponse getRandomWallpaper(QiApiClient qiApiClient, RandomWallpaperRequest request) throws ApiException;

    /**
     * 获取随机情话
     *
     * @return {@link LoveResponse}
     * @throws ApiException 业务异常
     */
    LoveResponse randomLoveTalk() throws ApiException;

    /**
     * 获取随机情话
     *
     * @param qiApiClient jlau api客户端
     * @return {@link LoveResponse}
     * @throws ApiException 业务异常
     */
    LoveResponse randomLoveTalk(QiApiClient qiApiClient) throws ApiException;

    /**
     * 获取星座运势
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse horoscope(HoroscopeRequest request) throws ApiException;

    /**
     * 获取星座运势
     *
     * @param qiApiClient jlau api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse horoscope(QiApiClient qiApiClient, HoroscopeRequest request) throws ApiException;

    /**
     * 获取ip信息
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getIpInfo(IpInfoRequest request) throws ApiException;

    /**
     * 获取ip信息
     *
     * @param qiApiClient jlau api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getIpInfo(QiApiClient qiApiClient, IpInfoRequest request) throws ApiException;

    /**
     * 获取天气信息
     *
     * @param request 要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getWeatherInfo(WeatherRequest request) throws ApiException;

    /**
     * 获取天气信息
     *
     * @param qiApiClient jlau api客户端
     * @param request     要求
     * @return {@link ResultResponse}
     * @throws ApiException 业务异常
     */
    ResultResponse getWeatherInfo(QiApiClient qiApiClient, WeatherRequest request) throws ApiException;
}
