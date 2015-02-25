package app.ui

import com.vaadin.annotations.DesignRoot
import com.vaadin.ui.Button
import com.vaadin.ui.Notification
import com.vaadin.ui.TextField
import com.vaadin.ui.VerticalLayout
import com.vaadin.ui.declarative.Design
import groovy.transform.CompileStatic

import java.time.Instant

@DesignRoot
@CompileStatic
class DesignForm extends VerticalLayout {

    // - inherited fields are not bound by Design, so can not use BaseForm
    // - field names must be matched by id (or luck, via caption -- goodbye i18n)
    TextField nameField
    TextField emailField
    Button button // button caption is not set from html, bug in vaadin?

    DesignForm() {
        // to catch errors early, one should check against the result
        Design.read(this)
        button.addClickListener({
            Notification.show("Saved ${nameField.value} and ${emailField.value} at ${Instant.now()}")
        })
    }
}
