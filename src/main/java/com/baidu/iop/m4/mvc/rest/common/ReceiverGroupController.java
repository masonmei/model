package com.baidu.iop.m4.mvc.rest.common;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import com.baidu.iop.m4.domain.entity.common.ReceiverGroup;
import com.baidu.iop.m4.domain.repository.common.ReceiverGroupRepository;
import com.baidu.iop.m4.mvc.dto.common.ReceiverGroupDto;

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
@RequestMapping("products/{productName}/apps/{appName}/groups")
public class ReceiverGroupController {
    private static final Logger LOG = LoggerFactory.getLogger(ReceiverGroupController.class);

    @Autowired
    private ReceiverGroupRepository receiverGroupRepository;

    @RequestMapping(method = POST)
    public ReceiverGroup createReceiverGroup(@PathVariable("productName") String productName,
            @PathVariable("appName") String appName, @RequestBody ReceiverGroupDto receiverGroupDto) {
        LOG.debug("Create ReceiverGroup for productName: {} and appName: {} with ReceiverGroupDto: {}", productName,
                appName, receiverGroupDto);

        return null;
    }

    @RequestMapping(value = "{taskName}", method = DELETE)
    public void deleteReceiverGroup(@PathVariable("productName") String productName,
            @PathVariable("appName") String appName, @PathVariable("taskName") String taskName) {
        LOG.debug("Delete ReceiverGroup {}.{}.{} ", productName, appName, taskName);

    }

    @RequestMapping(method = GET)
    public List<ReceiverGroup> findReceiverGroups(@PathVariable("productName") String productName,
            @PathVariable("appName") String appName) {
        LOG.debug("Finding ReceiverGroups with productName: {} and appName: {}", productName, appName);

        return null;
    }

    @RequestMapping(value = "{taskName}", method = PUT)
    public ReceiverGroup updateReceiverGroup(@PathVariable("productName") String productName,
            @PathVariable("appName") String appName, @PathVariable("taskName") String taskName,
            @RequestBody ReceiverGroupDto receiverGroupDto) {
        LOG.debug("Update ReceiverGroup {}.{}.{} with ReceiverGroupDto: {}", productName, appName, taskName,
                receiverGroupDto);

        return null;
    }

}
