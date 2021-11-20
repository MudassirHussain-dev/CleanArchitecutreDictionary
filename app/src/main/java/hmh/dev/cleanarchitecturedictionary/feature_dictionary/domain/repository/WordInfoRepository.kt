package hmh.dev.cleanarchitecturedictionary.feature_dictionary.domain.repository

import hmh.dev.cleanarchitecturedictionary.dectionary.util.Resource
import hmh.dev.cleanarchitecturedictionary.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}