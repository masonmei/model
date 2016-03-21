package com.baidu.iop.m4.custom.audit;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.auditing.AuditingHandler;
import org.springframework.data.domain.Auditable;
import org.springframework.util.Assert;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

/**
 * @author mason
 */
@Configurable
public class CustomAuditingEntityListener {

    private ObjectFactory<AuditingHandler> handler;

    /**
     * Configures the {@link AuditingHandler} to be used to set the current auditor on the domain types touched.
     *
     * @param auditingHandler must not be {@literal null}.
     */
    public void setAuditingHandler(ObjectFactory<AuditingHandler> auditingHandler) {

        Assert.notNull(auditingHandler, "AuditingHandler must not be null!");
        this.handler = auditingHandler;
    }

    /**
     * Sets modification and creation date and auditor on the target object in case it implements {@link Auditable} on
     * persist events.
     *
     * @param target
     */
    @PrePersist
    public void touchForCreate(Object target) {
        if (handler != null) {
            handler.getObject()
                    .markModified(target);
        }
    }

    /**
     * Sets modification and creation date and auditor on the target object in case it implements {@link Auditable} on
     * update events.
     *
     * @param target
     */
    @PreUpdate
    public void touchForUpdate(Object target) {
        if (handler != null) {
            handler.getObject()
                    .markModified(target);
        }
    }
}
