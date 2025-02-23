package gg.scala.spa

import gg.scala.commons.ExtendedScalaPlugin
import gg.scala.commons.core.plugin.*

/**
 * @author Topu
 * @date 2/24/2025
 */
@Plugin(
    name = "SPA",
    version = "%remote%/%branch%/%id%"
)
@PluginAuthor("Scala")
@PluginWebsite("https://scala.gg")
@PluginDependencyComposite(
    PluginDependency("scala-commons")
)
class SPA : ExtendedScalaPlugin()