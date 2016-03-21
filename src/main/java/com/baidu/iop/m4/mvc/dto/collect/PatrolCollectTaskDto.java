package com.baidu.iop.m4.mvc.dto.collect;

import com.baidu.iop.m4.domain.entity.collect.PatrolCollectTask;
import com.baidu.iop.m4.mvc.dto.common.Dto;

import java.util.Date;

/**
 * Data translate object of PatrolCollectTask.
 *
 * @author mason
 */
public class PatrolCollectTaskDto implements Dto<PatrolCollectTask> {

    private Long id;
    private String lastModifiedBy;
    private Date lastModifiedDate;
    private int version;
    private String productName;
    private String appName;
    private String name;

    @Override
    public void fromModel(PatrolCollectTask patrolCollectTask) {
        this.id = patrolCollectTask.getId();
        this.productName = patrolCollectTask.getProductName();
        this.appName = patrolCollectTask.getAppName();
        this.name = patrolCollectTask.getName();
        this.lastModifiedBy = patrolCollectTask.getLastModifiedBy();
        this.lastModifiedDate = patrolCollectTask.getLastModifiedDate();
        this.version = patrolCollectTask.getVersion();
    }

    @Override
    public void toModel(PatrolCollectTask patrolCollectTask) {
        patrolCollectTask.setProductName(productName);
        patrolCollectTask.setAppName(appName);
        patrolCollectTask.setName(name);

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
