package vip.Databases.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vip.Databases.Entity.SysUser;

import java.io.Serializable;
import java.util.List;

/**
 * 通过此类来获取数据库连接，将JpaRepository作为接口，与实体类Entity进行一一对应，以此链接数据库
 * 也可通过自定义方法，然后通过接口实现
 * @author hc
 * @description: TODO 这个类是连接数据库的
 * @date 2021/1/25 16:58
 */
@Repository//EXPOUND：用来标识这是个springbootJPA的数据库
public interface SysUserDao extends JpaRepository<SysUser,Integer> ,Serializable {

    SysUser findByName(String name);

}
