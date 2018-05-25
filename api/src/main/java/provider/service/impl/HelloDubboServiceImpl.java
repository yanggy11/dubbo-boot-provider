package provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import provider.dto.UserParam;
import provider.mapper.UserMapper;
import provider.service.IHelloDubboService;

import javax.annotation.Resource;


@Service(interfaceClass=IHelloDubboService.class)
@Component
public class HelloDubboServiceImpl implements IHelloDubboService{

	@Resource
	private UserMapper userMapper;

	@Override
	public String helloDubbo() {
		UserParam userParam = new UserParam();
		userParam.setUserId(190056795536699392L);
		System.out.println(userMapper.getUserById(userParam));
		return "Hello, spring boot dubbo project!!!";
	}

}
