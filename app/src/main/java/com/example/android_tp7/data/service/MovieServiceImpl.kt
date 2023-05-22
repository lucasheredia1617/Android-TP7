package com.example.android_tp7.data.service

class MovieServiceImpl(private val api:MovieRequestGenerator):MovieService {
    override suspend fun getMovies(): CoroutineResult<List<Movie>> {
        try {
            val callResponse = api.createService(MovieClient::class.java).getPopularMovies()
            val response = callResponse.execute()
            if (response.isSuccessful){
                response.body()?.let{
                    return CoroutineResult.Success(it.transformToList())
                }
            }
        }catch (e : Exception){
            return CoroutineResult.Failure(e)
        }
        return CoroutineResult.Failure(java.lang.Exception())
    }
}