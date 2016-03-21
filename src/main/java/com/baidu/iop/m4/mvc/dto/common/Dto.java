package com.baidu.iop.m4.mvc.dto.common;

import java.io.Serializable;

/**
 * @author mason
 */
public interface Dto<T> extends Serializable {

    /**
     * Copy value from model to Dto.
     *
     * @param model the database entity.
     */
    void fromModel(T model);

    /**
     * Copy value to model.
     *
     * @param model the database entity.
     */
    void toModel(T model);
}
