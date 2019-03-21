package net.person.service;

import com.alibaba.fastjson.JSON;
import net.person.dao.TestDao;
import net.person.entity.TestEntity;
import net.person.model.PageHelper;
import net.person.utils.ResponseUtils;
import net.person.utils.StatusHouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by admin on 2019/3/15.
 */
@Service
@Transactional
public class TestServiceImpl implements  TestService{
    private TestDao testDao;
    @Autowired
    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }

    @Override
    public void getAllTest(HttpServletResponse response) {
        PageHelper<TestEntity> pageHelperModel = new PageHelper<TestEntity>();
        List<TestEntity> list=testDao.getAllTest();
        pageHelperModel.setRows(list);
        pageHelperModel.setStatusObject(StatusHouse.COMMON_STATUS_OK);
        pageHelperModel.setRows(list);
        pageHelperModel.setStatusObject(StatusHouse.COMMON_STATUS_OK);
        String responseText = JSON.toJSONString(pageHelperModel);
        ResponseUtils.renderJson(response, responseText);
    }
}
