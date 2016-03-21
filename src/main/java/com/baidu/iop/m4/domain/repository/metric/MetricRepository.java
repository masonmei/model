package com.baidu.iop.m4.domain.repository.metric;

import com.baidu.iop.m4.domain.entity.metric.Metric;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author mason
 */
public interface MetricRepository extends JpaRepository<Metric, Long> {
}
