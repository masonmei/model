package com.baidu.iop.m4.mvc.rest.audit;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import com.baidu.iop.m4.domain.entity.audit.AuditHistory;
import com.baidu.iop.m4.domain.repository.audit.AuditHistoryRepository;
import com.baidu.iop.m4.mvc.dto.audit.AuditHistoryDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

;

/**
 * @author mason
 */
@RestController
@RequestMapping("products/{productName}/apps/{appName}/auditHistory")
public class AuditHistoryController {
    private static final Logger LOG = LoggerFactory.getLogger(AuditHistoryController.class);

    @Autowired
    private AuditHistoryRepository auditHistoryRepository;

    @RequestMapping(method = POST)
    public AuditHistory createAuditHistory(@PathVariable("productName") String productName,
            @PathVariable("appName") String appName, @RequestBody AuditHistoryDto auditHistoryDto) {
        LOG.debug("Create AuditHistory for productName: {} and appName: {} with AuditHistoryDto: {}", productName,
                appName, auditHistoryDto);

        return null;
    }

    @RequestMapping(value = "{taskName}", method = DELETE)
    public void deleteAuditHistory(@PathVariable("productName") String productName,
            @PathVariable("appName") String appName, @PathVariable("taskName") String taskName) {
        LOG.debug("Delete AuditHistory {}.{}.{} ", productName, appName, taskName);

    }

    @RequestMapping(method = GET)
    public List<AuditHistory> findAuditHistorys(@PathVariable("productName") String productName,
            @PathVariable("appName") String appName) {
        LOG.debug("Finding AuditHistorys with productName: {} and appName: {}", productName, appName);

        return null;
    }

    @RequestMapping(value = "{taskName}", method = PUT)
    public AuditHistory updateAuditHistory(@PathVariable("productName") String productName,
            @PathVariable("appName") String appName, @PathVariable("taskName") String taskName,
            @RequestBody AuditHistoryDto auditHistoryDto) {
        LOG.debug("Update AuditHistory {}.{}.{} with AuditHistoryDto: {}", productName, appName, taskName,
                auditHistoryDto);

        return null;
    }

}
