package com.ivan.todoengine.networking.di

interface IApiFactory {
    fun <T> buildApi(type: Class<T>): T
}