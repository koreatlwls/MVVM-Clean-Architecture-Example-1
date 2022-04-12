package com.example.tmdbclient.data


import com.example.tmdbclient.data.Movie
import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("results")
    val movies: List<Movie>
)