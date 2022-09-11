package club.yt

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

/**
 * 启动类
 *
 * @author 南编
 */
@SpringBootApplication
open class YtApplicationStartup

fun main(args: Array<String>) {
    SpringApplicationBuilder(YtApplicationStartup::class.java)
        .bannerMode(Banner.Mode.OFF)
        .profiles("default")
        .run(*args)
}