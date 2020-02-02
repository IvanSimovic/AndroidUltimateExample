package com.ivan.todoengine.data.api

import retrofit2.Response
import retrofit2.http.*

interface ActivityApi {

    @GET("activities")
    suspend fun list(): Response<List<ActivityDM>>

    @GET("activities/{id}")
    suspend fun details(@Path("id") id: String): Response<ActivityDM>

    @POST("activities")
    suspend fun create(
        @Body activity: ActivityDM
    ): Response<Unit>

    @PUT("activities/{id}")
    suspend fun update(
        @Path("id") id: String,
        @Body activity: ActivityDM
    ): Response<Unit>

    @DELETE("activities/{id}")
    suspend fun delete(
        @Path("id") id: String
    ): Response<Unit>

}