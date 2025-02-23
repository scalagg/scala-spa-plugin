package gg.scala.spa.feature

import gg.scala.cloudsync.shared.discovery.CloudSyncDiscoveryService
import gg.scala.commons.agnostic.sync.ServerSync
import gg.scala.commons.annotations.plugin.SoftDependency
import gg.scala.flavor.service.Configure
import gg.scala.flavor.service.Service
import gg.scala.flavor.service.ignore.IgnoreAutoScan

/**
 * @author Topu
 * @date 2/24/2025
 */
@Service
@IgnoreAutoScan
@SoftDependency("cloudsync")
object CloudSyncFeature
{
    @Configure
    fun configure() {
        CloudSyncDiscoveryService
            .discoverable.assets.add(
                "gg.scala.spa.plugin:scala-spa-plugin:spa${
                    if ("mipdev" in ServerSync.getLocalGameServer().groups) ":gradle-dev" else ""
                }"
            )
    }
}