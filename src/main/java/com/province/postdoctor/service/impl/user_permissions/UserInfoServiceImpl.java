package com.province.postdoctor.service.impl.user_permissions;

import com.province.postdoctor.entity.user_permissions.UserInfo;
import com.province.postdoctor.mapper.user_permissions.UserInfoMapper;
import com.province.postdoctor.service.user_permissions.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YRC
 * @since 2020-09-13
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
