object CharacterCommon {
    fun attack(character: Character) {
        with(character){
        when(character) {
            is Character.Archer -> {
            println("$name ${character.ability} применил способность ${weaponType.weapon}")
            }
            is Character.Mage -> {
                println("$name ${character.spell} применил колдовство ${weaponType.weapon}")
            }
            is Character.Warrior -> {
                println("$name ${character.ability} применил способность ${weaponType.weapon}")
            }
        }
        }
    }
    fun defend(character: Character) {
        with(character){
        when (character) {
            is Character.Archer -> {
                println("$name ${character.ability} использовала способность Скорости ")
            }

            is Character.Mage -> {
                println("$name ${character.spell} колдовство Тёмного посоха")
            }

            is Character.Warrior -> {
                println("$name ${character.ability} использовал способность Азгарда")
            }
        }
        }
    }
}