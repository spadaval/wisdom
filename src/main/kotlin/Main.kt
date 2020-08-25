import react.*
import react.dom.*
import kotlin.browser.document

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div {
            h3 {
                +"Videos to watch"
            }

            h3 {
                +"Videos watched"
            }
        }
    }
}

fun main() {
    render(document.getElementById("root")) {
        child(App::class) {}
    }
}