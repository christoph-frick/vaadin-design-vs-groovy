package app.ui
import com.vaadin.ui.Button
import com.vaadin.ui.Notification
import com.vaadin.ui.TextField
import groovy.transform.CompileStatic

import java.time.Instant

@CompileStatic
class GroovyForm extends BaseForm {

    GroovyForm() {
        // seems not to work at all super(spacing: true)
        spacing = true
        // must be used instead of width = "100%", because groovy can not deduce the right setter
        setWidth("100%")
        addComponents(
                nameField = new TextField(caption: "Name", width: "100%"),
                emailField = new TextField(caption: "Email", width: "100%"),
                button = new Button(caption: "Save").with {
                    it.addClickListener({
                        Notification.show("Saved ${nameField.value} and ${emailField.value} at ${Instant.now()}")
                    })
                    it // return here is ugly, because there is no variant of `with` that returns the object itself
                }
        )
    }
}
