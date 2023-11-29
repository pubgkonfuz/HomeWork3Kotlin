sealed class Character(
    val name: Text,
    val weaponType: WeaponType
) {

    class Warrior(val ability: String) : Character(WARRIOR_NAME, WeaponType.SWORD)
    class Mage(val spell: String) : Character(MAGE_NAME, WeaponType.STICK)
    class Archer(val ability: String) : Character(ARCHER_NAME, WeaponType.BOW)

    companion object {
        const val WARRIOR_NAME = "Каспер"
        const val MAGE_NAME = "Аслан"
        const val ARCHER_NAME = "Астрит"
    }
}