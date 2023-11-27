fun main(args: Array<String>) {
    val scanner = Copy(System.`in`)
    println("Выбирите действие для персонажа: 1 - атака, 0 - защита")
    println("-----------------------")
    println("Номер персонажа:")
    val action = scanner.nextInt()
    when (action) {
        0 -> {
            val warrior = Character.Warrior("смог защититься")
            val mage = Character.Mage("защититься используя")
            val archer = Character.Archer("смогла защититься")
            CharacterCommon.defend(warrior)
            CharacterCommon.defend(mage)
            CharacterCommon.defend(archer)
        }
        1 -> {
            val warrior = Character.Warrior("замахнулся Мечем")
            val mage = Character.Mage("используя - Посох")
            val archer = Character.Archer("выстрелила из Лука")
            CharacterCommon.attack(warrior)
            CharacterCommon.attack(mage)
            CharacterCommon.attack(archer)
            val hill = object {
                val name = "Фея"
                fun hill() {
                    println("$name Вылечила всю команду")
                }
            }
            hill.hill()
        }
    }
}