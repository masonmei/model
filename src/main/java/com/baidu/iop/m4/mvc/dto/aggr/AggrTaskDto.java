package com.baidu.iop.m4.mvc.dto.aggr;

import com.baidu.iop.m4.domain.entity.aggr.AggrTask;
import com.baidu.iop.m4.mvc.dto.common.Dto;

import java.util.Date;

/**
 * Data translate object of AggrTask.
 *
 * @author mason
 */
public class AggrTaskDto implements Dto<AggrTask> {

    private Long id;
    private String lastModifiedBy;
    private Date lastModifiedDate;
    private int version;
    private String productName;
    private String appName;
    private String name;
    private String comment;
    private String operation;
    private String tags;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public void toModel(AggrTask aggrTask) {
        aggrTask.setProductName(productName);
        aggrTask.setAppName(appName);
        aggrTask.setName(name);
        aggrTask.setComment(comment);
        aggrTask.setOperation(operation);
        aggrTask.setTags(tags);
    }

    @Override
    public void fromModel(AggrTask aggrTask) {
        this.id = aggrTask.getId();
        this.productName = aggrTask.getProductName();
        this.appName = aggrTask.getAppName();
        this.name = aggrTask.getName();
        this.lastModifiedBy = aggrTask.getLastModifiedBy();
        this.lastModifiedDate = aggrTask.getLastModifiedDate();
        this.version = aggrTask.getVersion();
        this.tags = aggrTask.getTags();
        this.comment = aggrTask.getComment();
        this.operation = aggrTask.getOperation();
    }
}
