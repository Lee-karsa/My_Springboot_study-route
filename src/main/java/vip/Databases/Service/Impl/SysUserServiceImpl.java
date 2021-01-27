package vip.Databases.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import vip.Databases.DAO.SysUserDao;
import vip.Databases.Entity.SysUser;
import vip.Databases.Service.SysUserService;
import vip.Databases.Service.tool.PageQuery;

import java.util.List;
import java.util.Optional;

/**
 * @author hc
 * @description: TODO 实现了service层接口的实现类
 * @date 2021/1/25 17:11
 */
@Service//EXPOUND：service层标注
public class SysUserServiceImpl implements SysUserService {

    @Autowired//EXPOUND：spring自动注入
    private SysUserDao sysUserDao;

    @Override
    public SysUser findByName(String name) {
        return sysUserDao.findByName(name);
    }

    @Override
    public Optional<SysUser> findById(Integer id) {
        return sysUserDao.findById(id);
    }

    @Override
    public void save(SysUser user) {
        sysUserDao.save(user);
    }

    @Override
    public void delete(SysUser user) {
        sysUserDao.delete(user);
    }

    @Override
    public List<SysUser> findAll() {
        return sysUserDao.findAll();
    }

    @Override
    public Object findPage(PageQuery pageQuery) {
        return sysUserDao.findAll(PageRequest.of(pageQuery.getPage(),
                pageQuery.getSize()));
    }
}
