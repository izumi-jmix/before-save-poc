package org.izumi.prepersistpoc.listener;

import java.util.Collection;

import io.jmix.core.DataManager;
import io.jmix.core.security.SystemAuthenticator;
import org.izumi.prepersistpoc.entity.Child1;
import org.izumi.prepersistpoc.entity.Parent;
import io.jmix.core.event.EntitySavingEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ParentEventListener {
    private static final Logger log = LoggerFactory.getLogger(ParentEventListener.class);
    private final SystemAuthenticator authenticator;
    private final DataManager dataManager;

    @Autowired
    public ParentEventListener(SystemAuthenticator authenticator, DataManager dataManager) {
        this.authenticator = authenticator;
        this.dataManager = dataManager;
    }

    @EventListener
    public void onParentSaving(EntitySavingEvent<? extends Parent> event) {
        if (event.isNewEntity()) {
            checkNewEntity(event.getEntity());
        }
    }

    protected void checkNewEntity(Parent entity) {
        authenticator.begin();
        try {
            final Collection<?> all = dataManager.load(Child1.class).all().list();
            log.info("{} entities", all.size());

            if (entity.getName().equals("Forbidden")) {
                throw new IllegalStateException("Forbidden name");
            }
        } finally {
            authenticator.end();
        }
    }
}