package top.crazybanana.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import top.crazybanana.model.entity.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zhangbo
 * Date: 2018/11/18
 * Time: 15:56
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Mapper
@Repository
public interface UserMapper {
    User findByEmail(String email);
}