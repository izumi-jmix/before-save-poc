package org.izumi.prepersistpoc.screen.child1;

import io.jmix.ui.screen.*;
import org.izumi.prepersistpoc.entity.Child1;


/**
  * @author Aiden Izumi (aka Flamesson).
 */
@UiController("Child1.browse")
@UiDescriptor("child1-browse.xml")
@LookupComponent("child1sTable")
public class Child1Browse extends StandardLookup<Child1> {
}