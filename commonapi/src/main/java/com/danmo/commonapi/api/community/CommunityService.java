package com.danmo.commonapi.api.community;

import com.danmo.commonapi.bean.community.CommunityListItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface CommunityService {
    @GET
    Call<List<CommunityListItem>> getCommunityCategory(@Url String url);

    @GET
    Call<List<CommunityListItem>> getCommunityListNewest(@Url String url);

    @GET
    Call<List<CommunityListItem>> getCommunityListHotest(@Url String url);

    @GET("post")
    Call<List<CommunityListItem>> getCommunityCategoryList(@Query("categoryid") String categoryid,
                                                           @Query("type") String type,
                                                           @Query("orderTime") String orderTime,
                                                           @Query("visistCount") String visistCount,
                                                           @Query("pageLength") String pageLength);
}
