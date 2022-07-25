package com.jptadros.jpsnewsnewyorktimes.JsontoKotlin

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

object Wrapper {

    @JsonClass(generateAdapter = true)
    data class Wrapper(@Json(name = "list") val list: List<NewsData>)
}