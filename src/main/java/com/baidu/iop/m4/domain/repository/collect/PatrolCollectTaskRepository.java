package com.baidu.iop.m4.domain.repository.collect;

import com.baidu.iop.m4.domain.entity.collect.PatrolCollectTask;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mason
 */
public interface PatrolCollectTaskRepository extends JpaRepository<PatrolCollectTask, Long> {
}
