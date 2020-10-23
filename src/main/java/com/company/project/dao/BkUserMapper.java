package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.BkUser;

import java.util.List;
import java.util.Map;

public interface BkUserMapper extends Mapper<BkUser> {
    List<Map<String, Object>> test1();
}