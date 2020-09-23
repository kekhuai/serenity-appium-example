package com.nexterdigitals.nextershop.automationtest.login

import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Question
import net.serenitybdd.screenplay.questions.TextContent

object HeaderTop {
    fun displayedName(): Question<String> {
        return Question { actor: Actor? -> TextContent.of(HeaderTopDisplayedName.DISPLAYED_NAME).viewedBy(actor).asString() }
    }
}
