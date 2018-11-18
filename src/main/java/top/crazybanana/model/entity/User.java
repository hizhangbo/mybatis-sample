package top.crazybanana.model.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zhangbo
 * Date: 2018/11/18
 * Time: 15:31
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class User implements Serializable {
    private Long userId;
    private String userName;
    private String password;
    private Long deptId;
    private String email;
    private String mobile;
    private Character status;
    private LocalDateTime crateTime;
    private LocalDateTime modifyTime;
    private LocalDateTime lastLoginTime;
    private Character ssex;
    private String theme;
    private String avatar;
    private String description;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", deptId=" + deptId +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", status='" + status + '\'' +
                ", createTime=" + crateTime +
                ", modifyTime=" + modifyTime +
                ", lastLoginTime=" + lastLoginTime +
                ", ssex='" + ssex + '\'' +
                ", theme='" + theme + '\'' +
                ", avatar='" + avatar + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}