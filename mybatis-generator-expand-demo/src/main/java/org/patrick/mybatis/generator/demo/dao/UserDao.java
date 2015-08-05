package org.patrick.mybatis.generator.demo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.patrick.mybatis.generator.demo.po.User;
import org.patrick.mybatis.generator.demo.po.UserCriteria;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    int countByCriteria(UserCriteria example);

    int deleteByCriteria(UserCriteria example);

    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByCriteria(UserCriteria example);

    User selectByPrimaryKey(String userId);

    int updateByCriteriaSelective(@Param("record") User record, @Param("example") UserCriteria example);

    int updateByCriteria(@Param("record") User record, @Param("example") UserCriteria example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}