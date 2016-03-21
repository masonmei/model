package com.baidu.iop.m4.mvc.dto.common;

import com.baidu.iop.m4.domain.entity.common.ReceiverGroup;

import java.util.Date;
import java.util.Set;

/**
 * Data translate object of ReceiverGroup.
 *
 * @author mason
 */
public class ReceiverGroupDto implements Dto<ReceiverGroup> {

    private Long id;
    private String lastModifiedBy;
    private Date lastModifiedDate;
    private int version;
    private String productName;
    private String name;
    private String description;
    private Set<String> members;

    @Override
    public void fromModel(ReceiverGroup receiverGroup) {
        this.id = receiverGroup.getId();
        this.productName = receiverGroup.getProductName();
        this.name = receiverGroup.getName();
        this.lastModifiedBy = receiverGroup.getLastModifiedBy();
        this.lastModifiedDate = receiverGroup.getLastModifiedDate();
        this.version = receiverGroup.getVersion();
        this.description = receiverGroup.getDescription();
        this.members = receiverGroup.getMembers();
    }

    @Override
    public void toModel(ReceiverGroup receiverGroup) {
        receiverGroup.setProductName(productName);
        receiverGroup.setName(name);
        receiverGroup.setDescription(description);
        receiverGroup.setMembers(members);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<String> getMembers() {
        return members;
    }

    public void setMembers(Set<String> members) {
        this.members = members;
    }
}
