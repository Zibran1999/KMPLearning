package domain.todoapp

import io.realm.kotlin.types.RealmObject
import org.mongodb.kbson.ObjectId

class ToDoTask : RealmObject {
    var _id: ObjectId = ObjectId()
    var title: String = ""
    var description: String = ""
    var favorite: Boolean = false
    var completed: Boolean = false
}