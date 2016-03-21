package com.baidu.iop.m4.domain.repository.alert;

import com.baidu.iop.m4.domain.entity.alert.Policy;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mason
 */
public interface PolicyRepository extends JpaRepository<Policy, Long> {
}
