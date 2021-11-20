package hmh.dev.cleanarchitecturedictionary.feature_dictionary.presentation

import hmh.dev.cleanarchitecturedictionary.feature_dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)
