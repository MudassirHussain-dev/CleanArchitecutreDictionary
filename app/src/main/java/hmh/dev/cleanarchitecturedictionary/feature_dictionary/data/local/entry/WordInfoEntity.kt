package hmh.dev.cleanarchitecturedictionary.feature_dictionary.data.local.entry

import androidx.room.Entity
import androidx.room.PrimaryKey
import hmh.dev.cleanarchitecturedictionary.feature_dictionary.domain.model.Meaning
import hmh.dev.cleanarchitecturedictionary.feature_dictionary.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    val word: String,
    val phonetic: String,
    val origin: String,
    val meanings: List<Meaning>,
    @PrimaryKey val id: Int? = null
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meanings = meanings,
            word = word,
            origin = origin,
            phonetic = phonetic
        )
    }
}
