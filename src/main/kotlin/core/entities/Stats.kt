package core.entities

data class Stats(
    val hp: Int = 0,
    val shld: Int = 0,
    val def: Int = 0,
    val atk: Int = 0,
    val stg: Int = 0,
    val critRate: Int = 0,
    val critDmg: Int = 0,
) {
    operator fun plus(other: Stats): Stats {
        val newHp = this.hp + other.hp
        val newShld = this.shld + other.shld
        val newDef = this.def + other.def
        val newAtk = this.atk + other.atk
        val newStg = this.stg + other.stg
        val newCritRate = this.critRate + other.critRate
        val newCritDmg = this.critDmg + other.critDmg
        return Stats(
            hp = newHp,
            shld = newShld,
            def = newDef,
            atk = newAtk,
            stg = newStg,
            critRate = newCritRate,
            critDmg = newCritDmg
        )
    }

    operator fun minus (other: Stats): Stats {
        val newHp = this.hp - other.hp
        val newShld = this.shld - other.shld
        val newDef = this.def - other.def
        val newAtk = this.atk - other.atk
        val newStg = this.stg - other.stg
        val newCritRate = this.critRate - other.critRate
        val newCritDmg = this.critDmg - other.critDmg
        return Stats(
            hp = newHp,
            shld = newShld,
            def = newDef,
            atk = newAtk,
            stg = newStg,
            critRate = newCritRate,
            critDmg = newCritDmg
        )
    }
}