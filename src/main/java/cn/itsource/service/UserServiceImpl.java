package cn.itsource.service;
import cn.itsource.entity.User;
import cn.itsource.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserServiceImpl {
    @Autowired
    UserMapper userMapper;
    //查询全部
    public List<User> queryAll() {
        return userMapper.selectList(null);
    }
}

