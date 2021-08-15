package adapter
interface Database {

    fun insert();
    fun update();
    fun select();
    fun delete();

    class DatabaseAdapter(
            private val database: SQLDatabase
    ) : Database {
        override fun insert() {
            database.insertData()
        }

        override fun update() {
            database.updateData()
        }

        override fun select() {
            database.fetchData()
        }

        override fun delete() {
            database.deleteData()
        }
    }

    interface SQLDatabase {
        fun insertData();
        fun updateData()
        fun fetchData()
        fun deleteData()

        open class Room : SQLDatabase {
            override fun insertData() {
                println("Insert data in room")
            }

            override fun updateData() {
                println("Update data data in room")
            }

            override fun fetchData() {
                println("Fetch data from room")

            }

            override fun deleteData() {
                println("Delete data from room")
            }
        }

        open class SQLite : SQLDatabase {
            override fun insertData() {
                println("Insert data in sqlite")
            }

            override fun updateData() {
                println("Update data data in sqlite")
            }

            override fun fetchData() {
                println("Fetch data from sqlite")

            }

            override fun deleteData() {
                println("Delete data from sqlite")
            }
        }
    }

}


fun main() {
    val sqlite = Database.DatabaseAdapter(Database.SQLDatabase.SQLite())
    val room = Database.DatabaseAdapter(Database.SQLDatabase.Room())
    val databases = listOf(sqlite,room)

    databases.forEach {
        it.insert()
        it.update()
        it.select()
        it.delete()
    }
}