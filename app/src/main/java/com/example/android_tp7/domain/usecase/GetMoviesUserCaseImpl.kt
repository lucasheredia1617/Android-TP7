package com.example.android_tp7.domain.usecase

interface GetMovieUseCase{
    suspend operator fun invoke(): CoroutineResult<List<Movie>>
}
class GetMoviesUserCaseImpl(
    private val movieService:MovieService,
    private val db: MovieDataBase
): GetMovieUseCase{
    override suspend operator fun invoke(): CoroutineResult<List<Movie>> {
        return when (val serviceResult = movieService.getMovies()){
            is CoroutineResult.Success -> {
                db.insertMovies(serviceResult.data)
                db.getAllMovies()
            }
            is CoroutineResult.Failure -> {
                db.getAllMovies()
            }
        }
    }
}