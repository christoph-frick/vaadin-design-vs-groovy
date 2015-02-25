package app.ui
import com.vaadin.ui.Button
import com.vaadin.ui.TextField
import com.vaadin.ui.VerticalLayout
import groovy.transform.CompileStatic
import groovy.transform.InheritConstructors

@CompileStatic
@InheritConstructors
class BaseForm extends VerticalLayout {

    TextField nameField
    TextField emailField
    Button button

}
