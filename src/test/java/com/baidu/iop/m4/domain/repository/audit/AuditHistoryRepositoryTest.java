package com.baidu.iop.m4.domain.repository.audit;

import static org.junit.Assert.assertNotNull;

import com.baidu.iop.m4.Application;
import com.baidu.iop.m4.domain.entity.alert.Policy;
import com.baidu.iop.m4.domain.entity.audit.ActionType;
import com.baidu.iop.m4.domain.entity.audit.AuditHistory;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import java.util.Calendar;

/**
 * Test cases for class AuditHistoryRepository.
 *
 * @author mason
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class})
//@DatabaseSetup(DATASET)
//@DatabaseTearDown(type = DELETE_ALL, value = {DATASET})
@DirtiesContext
//@ActiveProfiles(TEST)
public class AuditHistoryRepositoryTest {

    @Autowired
    private AuditHistoryRepository auditHistoryRepository;

    @Test
    public void testSaveAuditHistory() throws Exception {
        AuditHistory auditHistory = new AuditHistory();
        auditHistory.setAction(ActionType.CREATED);
        auditHistory.setActionDate(Calendar.getInstance()
                .getTime());
        auditHistory.setProductName("productName");
        auditHistory.setAppName("appName");
        auditHistory.setName("name");
        auditHistory.setEntityName("policy");
        auditHistory.setAuthor("mason");
        Policy details = new Policy();
        details.setAppName("test");
        auditHistory.setDetailObject(details);

        AuditHistory saved = auditHistoryRepository.save(auditHistory);
        assertNotNull(saved.getId());
    }
}