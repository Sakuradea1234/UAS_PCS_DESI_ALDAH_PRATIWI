package id.desialpra.githubuser.api

import id.desialpra.githubuser.data.model.DetailUserResponse
import id.desialpra.githubuser.data.model.User
import id.desialpra.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 9d53b6ff63edfd76c355e47c1480023a0950905c")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 9d53b6ff63edfd76c355e47c1480023a0950905c")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 9d53b6ff63edfd76c355e47c1480023a0950905c")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 9d53b6ff63edfd76c355e47c1480023a0950905c")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}