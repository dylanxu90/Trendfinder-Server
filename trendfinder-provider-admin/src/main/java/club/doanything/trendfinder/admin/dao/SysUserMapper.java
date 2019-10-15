package club.doanything.trendfinder.admin.dao;

import club.doanything.trendfinder.api.entity.SysUser;

//@Mapper
public interface SysUserMapper {

    SysUser selectById(int id);
}
