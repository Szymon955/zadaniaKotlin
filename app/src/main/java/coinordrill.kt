// Interfejs dla narzędzi do rzucania
interface RollingTool {
    fun roll(): String
}

// Klasa Coin implementująca RollingTool
class Coin : RollingTool {
    override fun roll(): String {
        return if (Math.random() < 0.5) "Heads" else "Tails"
    }
}

// Klasa Dice implementująca RollingTool
class Dice : RollingTool {
    override fun roll(): String {
        return (1..6).random().toString()
    }
}

// Funkcja główna, która umożliwia wybór między rzutem monetą a rzutem kością
fun main() {
    println("Wybierz opcję (1 - rzut monetą, 2 - rzut kością):")
    val choice = readLine()?.toIntOrNull()

    val rollingTool: RollingTool = when (choice) {
        1 -> Coin()
        2 -> Dice()
        else -> {
            println("Nieprawidłowy wybór. Zakończenie aplikacji.")
            return
        }
    }

    println("Wynik rzutu: ${rollingTool.roll()}")
}
