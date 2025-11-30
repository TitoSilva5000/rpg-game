package core.entity

import core.exceptions.ErrorType
import core.exceptions.InvalidStatException

/**
 * Represents the stats of an entity.
 * @property hp The hp of an entity.
 * @property shld **Shield**: Temporary health that absorbs damage before HP.
 * @property def **Defense**: Reduces incoming damage.
 * @property atk **Attack**: The raw power used to calculate damage dealt.
 * @property stg **Stagger**: Resistance to being interrupted or stunned.
 * @property critRate **Critical Rate**: The percentage chance (0-100) to land a critical hit.
 * @property critDmg **Critical Damage**: The percentage bonus damage (e.g., 50.0 = 150% total damage) on a critical hit.
 * @throws InvalidStatException if any provided statistic is negative.
 */
data class Stats(
    val hp: Int = 100,
    val shld: Int = 0,
    val def: Int = 50,
    val atk: Int = 50,
    val stg: Int = 0,
    val critRate: Double = 5.0,
    val critDmg: Double = 50.0,
) {
    init {
        require(hp >= 0) { InvalidStatException(
            message = "HP cannot be negative.",
            type = ErrorType.ERROR
        ) }
        require(shld >= 0) { InvalidStatException(
            message = "SHLD cannot be negative.",
            type = ErrorType.ERROR
        ) }
        require(def >= 0) { InvalidStatException(
            message = "DEF cannot be negative.",
            type = ErrorType.ERROR
        ) }
        require(atk >= 0) { InvalidStatException(
            message = "ATK cannot be negative.",
            type = ErrorType.ERROR
        ) }
        require(stg >= 0) { InvalidStatException(
            message = "STG cannot be negative.",
            type = ErrorType.ERROR
        ) }
        require(critRate >= 0) { InvalidStatException(
            message = "CRIT Rate cannot be negative.",
            type = ErrorType.ERROR
        ) }
        require(critDmg >= 0) { InvalidStatException(
            message = "CRIT DMG cannot be negative.",
            type = ErrorType.ERROR
        ) }
    }

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