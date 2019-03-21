package net.person.dao;



import net.person.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by admin on 2019/3/15.
 */
@Repository
@Mapper
public interface TestDao {
    public List<TestEntity> getAllTest();
}
