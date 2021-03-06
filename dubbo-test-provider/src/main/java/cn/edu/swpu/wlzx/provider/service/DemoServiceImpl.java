package cn.edu.swpu.wlzx.provider.service;

import org.apache.dubbo.config.annotation.Service;
import cn.edu.swpu.wlzx.api.user.DemoService;
import org.apache.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gongsir
 * @date 2020/3/21 14:44
 * 编码不要畏惧变化，要拥抱变化
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public String sayHello(String name) {
        logger.info("Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }

}
