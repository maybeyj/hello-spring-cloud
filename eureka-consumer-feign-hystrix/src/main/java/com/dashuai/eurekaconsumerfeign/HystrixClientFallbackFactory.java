package com.dashuai.eurekaconsumerfeign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author Da Shuai
 * @since 2019-10-15 11:34
 */
@Component
public class HystrixClientFallbackFactory implements FallbackFactory<DcClient> {

    @Override
    public DcClient create(Throwable throwable) {
        return new DcClient() {
            @Override
            public String consumer() {
                return "feign + hystrix ,提供者服务挂了";
            }
        };
    }
}
