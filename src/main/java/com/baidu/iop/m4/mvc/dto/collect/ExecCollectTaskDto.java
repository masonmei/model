package com.baidu.iop.m4.mvc.dto.collect;

import com.baidu.iop.m4.domain.entity.collect.ExecCollectTask;
import com.baidu.iop.m4.mvc.dto.common.Dto;

import java.util.Date;

/**
 * Data translate object of ExecCollectTask.
 *
 * @author mason
 */
public class ExecCollectTaskDto implements Dto<ExecCollectTask> {

    private Long id;
    private String lastModifiedBy;
    private Date lastModifiedDate;
    private int version;
    private String productName;
    private String appName;
    private String name;

    @Override
    public void fromModel(ExecCollectTask execCollectTask) {
        this.id = execCollectTask.getId();
        this.productName = execCollectTask.getProductName();
        this.appName = execCollectTask.getAppName();
        this.name = execCollectTask.getName();
        this.lastModifiedBy = execCollectTask.getLastModifiedBy();
        this.lastModifiedDate = execCollectTask.getLastModifiedDate();
        this.version = execCollectTask.getVersion();
    }

    @Override
    public void toModel(ExecCollectTask execCollectTask) {
        execCollectTask.setProductName(productName);
        execCollectTask.setAppName(appName);
        execCollectTask.setName(name);

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
