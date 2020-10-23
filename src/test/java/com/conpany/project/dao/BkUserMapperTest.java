package com.conpany.project.dao;

import com.company.project.Application;
import com.company.project.dao.BkUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * @author bkunzh
 * @date 2020/10/23
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class BkUserMapperTest {
    @Autowired
    BkUserMapper bkUserMapper;

    @Test
    public void test1() {
        List<Map<String, Object>> list = bkUserMapper.test1();
        System.out.println(list.size());
        System.out.println(list);
    }
}
