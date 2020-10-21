package com.company.project.service.impl;

import com.company.project.dao.BkUserMapper;
import com.company.project.model.BkUser;
import com.company.project.service.BkUserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/10/22.
 */
@Service
@Transactional
public class BkUserServiceImpl extends AbstractService<BkUser> implements BkUserService {
    @Resource
    private BkUserMapper bkUserMapper;

}
