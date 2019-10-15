package com.dashuai.eurekaconsumerfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Da Shuai
 * @since 2019-10-14 17:06
 */
@FeignClient(value = "eureka-client",fallbackFactory = HystrixClientFallbackFactory.class)
public interface DcClient {

    @GetMapping("/dc")
    String consumer();
}
