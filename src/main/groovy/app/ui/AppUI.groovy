package app.ui

import com.vaadin.annotations.Theme
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.HorizontalLayout
import com.vaadin.ui.Panel
import com.vaadin.ui.UI
import groovy.transform.CompileStatic
import org.vaadin.spring.annotation.VaadinUI

@VaadinUI
@Theme('app')
@CompileStatic
class AppUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new HorizontalLayout(
                new Panel("Declarative", new DesignForm()),
                new Panel("Imperative", new GroovyForm()),
        ))
    }

}
