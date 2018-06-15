package kr.itanoss.lab.spring5

import kr.itanoss.lab.spring5.data.Person
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import reactor.core.publisher.Mono

@Component
class HelloWorldHandler {
    fun helloWorld(request: ServerRequest): Mono<ServerResponse> {
        val mono = Mono.just(Person(1, "Scott"))
        return ok().body(mono, Person::class.java)
    }
}
