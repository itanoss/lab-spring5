package kr.itanoss.lab.spring5

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.BodyInserters.fromObject
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.router

@Configuration
class Router {
    @Bean
    fun routeExample(handler: HelloWorldHandler) : RouterFunction<ServerResponse> = router {
        GET("/") {
            ok().body(fromObject("It works!!"))
        }
        GET("/person", handler::helloWorld)
    }
}