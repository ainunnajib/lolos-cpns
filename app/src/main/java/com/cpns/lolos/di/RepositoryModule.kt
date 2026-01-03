package com.cpns.lolos.di

import com.cpns.lolos.data.repository.AiRepositoryImpl
import com.cpns.lolos.data.repository.QuestionRepositoryImpl
import com.cpns.lolos.data.repository.QuizRepositoryImpl
import com.cpns.lolos.data.repository.UserRepositoryImpl
import com.cpns.lolos.domain.repository.AiRepository
import com.cpns.lolos.domain.repository.QuestionRepository
import com.cpns.lolos.domain.repository.QuizRepository
import com.cpns.lolos.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindQuestionRepository(
        questionRepositoryImpl: QuestionRepositoryImpl
    ): QuestionRepository

    @Binds
    @Singleton
    abstract fun bindUserRepository(
        userRepositoryImpl: UserRepositoryImpl
    ): UserRepository

    @Binds
    @Singleton
    abstract fun bindQuizRepository(
        quizRepositoryImpl: QuizRepositoryImpl
    ): QuizRepository

    @Binds
    @Singleton
    abstract fun bindAiRepository(
        aiRepositoryImpl: AiRepositoryImpl
    ): AiRepository
}
