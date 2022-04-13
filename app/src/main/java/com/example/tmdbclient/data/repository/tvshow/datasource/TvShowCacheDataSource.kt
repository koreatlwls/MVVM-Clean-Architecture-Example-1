package com.example.tmdbclient.data.repository.tvshow.datasource

import com.example.tmdbclient.data.model.tvshow.TvShow

interface TvShowCacheDataSource {
    suspend fun getTvshowsFromCache():List<TvShow>
    suspend fun saveTvshowsToCache(tvShows:List<TvShow>)
}