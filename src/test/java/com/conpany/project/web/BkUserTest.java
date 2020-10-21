package com.conpany.project.web;

import com.alibaba.fastjson.JSON;
import com.company.project.core.Result;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * @author bkunzh
 * @date 2020/10/22
 */
public class BkUserTest {
    RestTemplate restTemplate = new RestTemplate();

    @Test
    public void list() {
        URI uri = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/bk/user/list").queryParam("page", 1).queryParam("size", 5).build().toUri();
        Object result = restTemplate.postForObject(uri, null, Object.class);
        System.out.println(JSON.toJSONString(result));
    }
}
