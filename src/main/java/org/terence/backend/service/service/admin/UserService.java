package org.terence.backend.service.service.admin;

import org.terence.backend.dao.entity.admin.User;
import org.terence.backend.service.vo.admin.UserVo;
import org.terence.backend.service.vo.base.ParamsVo;
import org.terence.backend.service.vo.base.TableData;

import java.util.List;

/**
 * @author terence
 * @since 2019/2/25 15:21
 */
public interface UserService {

    User getUserByUsername(String username);

    User registerUser(User user);

    UserVo getUserInfo(String accessToken);

    boolean verifyUsername(String username);

    TableData<UserVo> getList(int page, int size, List<ParamsVo> paramsVoList);

    void addUser(UserVo userVo);

    void deleteUserById(long id);

    void updateUser(UserVo userVo);

    User getUserById(long id);
}
