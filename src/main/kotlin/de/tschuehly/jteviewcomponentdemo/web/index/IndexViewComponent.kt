package de.tschuehly.jteviewcomponentdemo.web.index

import de.tschuehly.thymeleafviewcomponent.ViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewContext
import de.tschuehly.thymeleafviewcomponent.toProperty

@ViewComponent
class IndexViewComponent {

    fun render() = ViewContext(
        "model" toProperty DemoModel("Thomas")
    )

    class DemoModel(
        val test: String
    )
}