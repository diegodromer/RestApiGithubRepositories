package br.com.diegolima.app.repositories.data.services

import br.com.diegolima.app.repositories.data.model.Repo
import retrofit2.http.Path
import retrofit2.http.GET

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String): List<Repo>
}