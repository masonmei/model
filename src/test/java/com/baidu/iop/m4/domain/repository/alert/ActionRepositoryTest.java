package com.baidu.iop.m4.domain.repository.alert;

import static org.junit.Assert.assertNotNull;

import com.baidu.iop.m4.Application;
import com.baidu.iop.m4.domain.entity.alert.Action;
import com.baidu.iop.m4.domain.entity.alert.ActionConfig;
import com.baidu.iop.m4.domain.entity.alert.Notification;
import com.baidu.iop.m4.domain.entity.alert.TimeRange;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Time;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Test cases for class .
 *
 * @author mason
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ActionRepositoryTest {

    @Autowired
    private ActionRepository actionRepository;

    @Test
    public void testCreateAction() throws Exception {
        Action action = new Action();
        action.setProductName("productName");
        action.setAppName("appName");
        action.setName("actionName");
        ActionConfig actionConfig = new ActionConfig();
        actionConfig.setAlertThreshold(10);
        Set<TimeRange> diabledTimes = new HashSet<>();
        TimeRange time = new TimeRange();
        time.setFrom(Time.valueOf(LocalTime.of(1, 2, 3)));
        time.setTo(Time.valueOf(LocalTime.of(1, 3, 4)));

        diabledTimes.add(time);
        time = new TimeRange();
        time.setFrom(Time.valueOf(LocalTime.of(2, 2, 3)));
        time.setTo(Time.valueOf(LocalTime.of(2, 3, 4)));

        diabledTimes.add(time);
        actionConfig.setDisabledTimes(diabledTimes);
        action.setConfig(actionConfig);
        Set<Notification> notifications = new HashSet<>();
        Notification notification = new Notification();
        notification.setType("sms");
//        ReceiverCallback receiver = new ReceiverCallback();
//        receiver.setName("callback-reveiver");
//        receiver.setProductName("productName");
//        receiver.setCallbackUri(new URI("http://www.baidu.com"));
//        receiver.setNeedCredential(false);
        notification.setReceiverId(0L);
        notifications.add(notification);
        action.setNotifications(notifications);

        Action save = actionRepository.save(action);
        assertNotNull(save.getId());
    }

    @Test
    public void testQueryAction() throws Exception {
        List<Action> all = actionRepository.findAll();
        System.out.println(all);
    }

}