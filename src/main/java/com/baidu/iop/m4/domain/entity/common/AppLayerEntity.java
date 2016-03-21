package com.baidu.iop.m4.domain.entity.common;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

/**
 * @author mason
 */
@MappedSuperclass
public abstract class AppLayerEntity<PK extends Serializable> extends ProductLayerEntity<PK> {

    private static final long serialVersionUID = -4602485729212686560L;

    @NotNull
    @Column(name = "`app_name`", length = 128, nullable = false)
    private String appName;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

}
