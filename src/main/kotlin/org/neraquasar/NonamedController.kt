package org.neraquasar

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class NonamedController {

    @RequestMapping("nonamed")
    fun run(@RequestParam input: String): String {
        return input;
    }
}
