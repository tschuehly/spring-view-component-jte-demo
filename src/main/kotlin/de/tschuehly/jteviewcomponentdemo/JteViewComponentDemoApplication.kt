package de.tschuehly.jteviewcomponentdemo

import de.tschuehly.jteviewcomponentdemo.web.index.IndexViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewContext
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class JteViewComponentDemoApplication

fun main(args: Array<String>) {
    runApplication<JteViewComponentDemoApplication>(*args)
}

@Controller
class IndexController(private val indexViewComponent: IndexViewComponent) {
    @GetMapping("/")
    fun index(): ViewContext {
         return indexViewComponent.render()
    }

    @GetMapping("/jte")
    fun jte(
        model: Model
    ): String {
        model.addAttribute("model","Hello World")
        return "de/tschuehly/jteviewcomponentdemo/web/index/IndexViewComponent"
    }
}
