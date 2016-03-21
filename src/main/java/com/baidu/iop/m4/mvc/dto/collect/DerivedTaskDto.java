package com.baidu.iop.m4.mvc.dto.collect;

import com.baidu.iop.m4.domain.entity.collect.DerivedTask;
import com.baidu.iop.m4.mvc.dto.common.Dto;

import java.util.Date;

/**
 * Data translate object of DerivedTask.
 *
 * @author mason
 */
public class DerivedTaskDto implements Dto<DerivedTask> {

    private Long id;
    private String lastModifiedBy;
    private Date lastModifiedDate;
    private int version;
    private String productName;
    private String appName;
    private String name;

    @Override
    public void fromModel(DerivedTask derivedTask) {
        this.id = derivedTask.getId();
        this.productName = derivedTask.getProductName();
        this.appName = derivedTask.getAppName();
        this.name = derivedTask.getName();
        this.lastModifiedBy = derivedTask.getLastModifiedBy();
        this.lastModifiedDate = derivedTask.getLastModifiedDate();
        this.version = derivedTask.getVersion();
    }

    @Override
    public void toModel(DerivedTask derivedTask) {
        derivedTask.setProductName(productName);
        derivedTask.setAppName(appName);
        derivedTask.setName(name);

    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
