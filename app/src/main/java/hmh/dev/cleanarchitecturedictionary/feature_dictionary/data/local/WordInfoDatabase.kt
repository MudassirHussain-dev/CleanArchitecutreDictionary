package hmh.dev.cleanarchitecturedictionary.feature_dictionary.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import hmh.dev.cleanarchitecturedictionary.feature_dictionary.data.local.entry.WordInfoEntity

@Database(
    entities = [WordInfoEntity::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class WordInfoDatabase : RoomDatabase() {
    abstract val dao: WordInfoDao
}