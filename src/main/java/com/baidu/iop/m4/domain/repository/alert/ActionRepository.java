package com.baidu.iop.m4.domain.repository.alert;

import com.baidu.iop.m4.domain.entity.alert.Action;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mason
 */
public interface ActionRepository extends JpaRepository<Action, Long> {
}
