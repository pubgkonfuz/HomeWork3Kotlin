object CharacterCommon {
    fun attack(character: Character) {
        when(character) {
            is Character.Archer -> {
            println("${character.name} ${character.ability} применил способность ${character.weaponType.weapon}")
            }
            is Character.Mage -> {
                println("${character.name} ${character.spell} применил колдовство ${character.weaponType.weapon}")
            }
            is Character.Warrior -> {
                println("${character.name} ${character.ability} применил способность ${character.weaponType.weapon}")
            }
        }
    }
    fun defend(character: Character) {
        when (character) {
            is Character.Archer -> {
                println("${character.name} ${character.ability} использовала способность Скорости ")
            }

            is Character.Mage -> {
                println("${character.name} ${character.spell} колдовство Тёмного посоха")
            }

            is Character.Warrior -> {
                println("${character.name} ${character.ability} использовал способность Азгарда")
            }
        }
    }
}