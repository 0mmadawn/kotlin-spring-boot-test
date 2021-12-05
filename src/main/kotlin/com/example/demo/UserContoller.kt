package com.example.demo

import com.example.demo.web.api.controller.UsersApi
import com.example.demo.web.api.model.*
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController


@RestController
class SampleController {
    @GetMapping("/")
    fun getHello() :String {
        return "Hello World"
    }
}

@RestController
class UserController : UsersApi {
    override fun createUser(request: CreateUserRequest): ResponseEntity<CreateUserResponse> {
        TODO("Not yet implemented")
    }

    @ResponseBody
    override fun findUsers(): ResponseEntity<FindUsersResponse> {
        val users = listOf(
            User(name = "aaa", id = 1),
            User(name = "neko", id = 2)
        )
        val response = FindUsersResponse(users)
        return ResponseEntity(response, HttpStatus.OK)
    }

    override fun findUserById(id: Long): ResponseEntity<FindUserResponse> {
        TODO("Not yet implemented")
    }

    override fun deleteUser(id: Long): ResponseEntity<Unit> {
        TODO("Not yet implemented")
    }
}