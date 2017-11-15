package com.yy.yyshop.testDao;


import com.yy.yyshop.dao.TbUserMapper;
import com.yy.yyshop.pojo.po.TbUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * User: Frogzec
 * Date: 2017/11/15
 * Time: 10:35
 * Version:V1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao-test.xml"})
public class TestDao {

    @Autowired
    private TbUserMapper userDao;
    /**
     * 测试反向工程
     */
    @Test
    public void test1() {
        TbUser tbUser = userDao.selectByPrimaryKey(1L);
        System.out.println(tbUser.getUsername());
    }

}
