package com.haris

sealed class Result {
    sealed class Success(val data: Any) : Result()
    data class Error(val message: String) : Result()
    data object Loading : Result()
}

fun main() {
    when(val result : Result = Result.Error("oops!")) {
        is Result.Success -> {
            println("Success: ${result.data}")
        }
        is Result.Error -> {
            println("Error: ${result.message}")
        }
        is Result.Loading -> {
            println("Loading...")
        }
    }
}