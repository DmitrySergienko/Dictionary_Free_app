package com.example.dictionary_free_app.domain

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("Response")
	val response: List<ResponseItem?>? = null
)

data class ResponseItem(

	@field:SerializedName("phonetic")
	val phonetic: String? = null,

	@field:SerializedName("origin")
	val origin: String? = null,

	@field:SerializedName("phonetics")
	val phonetics: List<PhoneticsItem?>? = null,

	@field:SerializedName("word")
	val word: String? = null,

	@field:SerializedName("meanings")
	val meanings: List<MeaningsItem?>? = null
)

data class DefinitionsItem(

	@field:SerializedName("synonyms")
	val synonyms: List<Any?>? = null,

	@field:SerializedName("antonyms")
	val antonyms: List<Any?>? = null,

	@field:SerializedName("definition")
	val definition: String? = null,

	@field:SerializedName("example")
	val example: String? = null
)

data class MeaningsItem(

	@field:SerializedName("partOfSpeech")
	val partOfSpeech: String? = null,

	@field:SerializedName("definitions")
	val definitions: List<DefinitionsItem?>? = null
)

data class PhoneticsItem(

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("audio")
	val audio: String? = null
)
