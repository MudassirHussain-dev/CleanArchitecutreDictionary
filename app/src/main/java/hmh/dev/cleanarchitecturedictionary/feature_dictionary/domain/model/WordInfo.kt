package hmh.dev.cleanarchitecturedictionary.feature_dictionary.domain.model

import hmh.dev.cleanarchitecturedictionary.feature_dictionary.data.remote.dto.MeaningDto
import hmh.dev.cleanarchitecturedictionary.feature_dictionary.data.remote.dto.PhoneticDto

data class WordInfo(
    val meanings: List<Meaning>,
    val origin: String,
    val phonetic: String,
    val word: String
)
