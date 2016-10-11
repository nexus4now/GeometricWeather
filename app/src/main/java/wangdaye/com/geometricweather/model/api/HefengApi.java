package wangdaye.com.geometricweather.model.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import wangdaye.com.geometricweather.model.data.HefengResult;

/**
 * Hefeng api.
 * */

public interface HefengApi {

    String BASE_URL = "http://apis.baidu.com/heweather/weather/";
    String APP_KEY= "f8f22c028b3ad53163da5a7a0ca854b3";

    @GET("free")
    Call<HefengResult> getHefengWeather(@Query("city") String location);
}
