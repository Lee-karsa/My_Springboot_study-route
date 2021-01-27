package vip.Databases.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author hc
 * @description: TODO 实体类。用来与数据库表头一一对应
 * @date 2021/1/25 17:01
 */
@Data//EXPOUND：Lombok的注解
@AllArgsConstructor
@NoArgsConstructor//EXPOUND:同上
@Entity//EXPOUND:用来解释这是个实体类
@Table(name = "user")//EXPOUND：对应数据库的表
public class SysUser {

    @Id//EXPOUND:对应实体的主键，也就是说要对应数据库的主键
    @GeneratedValue//EXPOUND：唯一主键约束
    private Integer id;
    @Column
    private String name;
    @Column
    private String address;

}
