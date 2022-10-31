package org.izumi.prepersistpoc.screen.child1;

import io.jmix.ui.screen.*;
import org.izumi.prepersistpoc.entity.Child1;


/**
  * @author Aiden Izumi (aka Flamesson).
 */
@UiController("Child1.edit")
@UiDescriptor("child1-edit.xml")
@EditedEntityContainer("child1Dc")
public class Child1Edit extends StandardEditor<Child1> {
}