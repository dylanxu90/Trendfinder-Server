package club.doanything.trendfinder.admin.service.impl;

import club.doanything.trendfinder.admin.dao.SysUserMapper;
import club.doanything.trendfinder.api.entity.SysUser;
import club.doanything.trendfinder.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

//    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser selectById(int id) {
        return SysUser.builder().id(100).userName("admin").password("admin").realName("tom").build();
//        return sysUserMapper.selectById(id);
    }
}
