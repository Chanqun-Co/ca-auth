package io.sharing.server.caauth

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class CaAuthApplication

fun main(args: Array<String>) {
    runApplication<CaAuthApplication>(*args)
}
