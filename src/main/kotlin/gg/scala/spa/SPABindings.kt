package gg.scala.spa

import org.bukkit.Bukkit
import org.bukkit.entity.Player

/**
 * @author Topu
 * @date 2/24/2025
 */
object SPABindings
{
    fun setPlayerKnockback(player: Player, profile: String)
    {
        val customProfile = Bukkit.custom()
            .knockbackManager
            .profileManager
            .getProfile("default", profile)

        customProfile?.setKnockback(player)
    }
}