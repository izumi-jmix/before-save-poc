package org.izumi.prepersistpoc.screen.child2;

import io.jmix.ui.screen.*;
import org.izumi.prepersistpoc.entity.Child2;


/**
  * @author Aiden Izumi (aka Flamesson).
 */
@UiController("Child2.browse")
@UiDescriptor("child2-browse.xml")
@LookupComponent("child2sTable")
public class Child2Browse extends StandardLookup<Child2> {
}