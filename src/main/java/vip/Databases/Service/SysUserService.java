package vip.Databases.Service;

import vip.Databases.Entity.SysUser;
import vip.Databases.Service.tool.PageQuery;

import java.util.List;
import java.util.Optional;

/**
 * @author hc
 * @description: TODO 这是个接口，需要IMPL来实现，设计思路是，代理模式
 * @date 2021/1/25 17:06
 */

public interface SysUserService {

    public SysUser findByName(String name);

    public Optional<SysUser> findById(Integer id);

    public void save(SysUser user);

    public void delete(SysUser user);

    public List<SysUser> findAll();

    public Object findPage(PageQuery pageQuery);

}
