package provider.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import provider.dto.UserParam;
import provider.model.User;

import java.util.List;

/**
 * Created by yangguiyun on 2017/6/1.
 */

@Mapper
public interface UserMapper {

    int insertUser(User user);
    List<User> getUserList(UserParam userParam);

    User getUserById(UserParam userParam);

    Integer getUserCount(UserParam userParam);

    User findByName(@Param("name") String name);
}
