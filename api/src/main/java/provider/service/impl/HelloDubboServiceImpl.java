package provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import provider.service.IHelloDubboService;


@Service(interfaceClass=IHelloDubboService.class)
@Component
public class HelloDubboServiceImpl implements IHelloDubboService{

	@Override
	public String helloDubbo() {
		return "Hello, spring boot dubbo project!!!";
	}

}
