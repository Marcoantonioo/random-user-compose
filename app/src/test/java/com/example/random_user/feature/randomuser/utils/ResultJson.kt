package com.example.random_user.feature.randomuser.utils

object ResultJson {
    fun getJson () = "{\n" +
            "   \"results\":[\n" +
            "      {\n" +
            "         \"gender\":\"Gender\",\n" +
            "         \"name\":{\n" +
            "            \"title\":\"Title\",\n" +
            "            \"first\":\"First\",\n" +
            "            \"last\":\"Last\"\n" +
            "         },\n" +
            "         \"email\":\"Email\",\n" +
            "         \"id\":{\n" +
            "            \"name\":\"Name\",\n" +
            "            \"value\":\"Value\"\n" +
            "         },\n" +
            "         \"picture\":{\n" +
            "            \"large\":\"Test\",\n" +
            "            \"medium\":\"Test\",\n" +
            "            \"thumbnail\":\"Test\"\n" +
            "         }\n" +
            "      }\n" +
            "   ]\n" +
            "}"
}