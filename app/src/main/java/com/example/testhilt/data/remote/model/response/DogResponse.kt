package com.example.testhilt.data.remote.model.response

/*
{
    "message": "https://images.dog.ceo/breeds/mexicanhairless/n02113978_147.jpg",
    "status": "success"
}
*/

data class DogResponse(
    val message: String,
    val status: String
)