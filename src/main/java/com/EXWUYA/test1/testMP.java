package com.EXWUYA.test1;

import com.EXWUYA.dao.mapper.TestMapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import com.EXWUYA.domian.Test1;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testMP {

    @Autowired
   private TestMapper testMapper;

    @Test
    public void testInsert(){
        Test1 test1 =new Test1();
//        test1.setId(4);
        test1.setName("こ");
        test1.setUpdateTime(new Date());
//        test1.setCreateTime(new Date());
        testMapper.insert(test1);
    }

    @Test
    public void testSelect(){
          System.out.println(testMapper.selectById(1).toString());
//          throw new RuntimeException();

    }

    @Test
    public void testLongText(){
      Test1 test1=  new Test1() ;
//     test1.setId(50000);
        test1.setName("测试长文本");
        test1.setContent(new String("aaaaaaaaaaaaaaaannnnnnnnnnnnnnns,dm,mand,an,dn,an,dna,dn,mand,nad,naaaaaaaaaaaaaaaaaaaaaaaaaaaasmmmmmmmmmmmmmmmmmmmdn,and,na,nds,na,dnkwbkcweickshcjksdhhsakdhkHKASHUDHLSAGD2LNDKLHWIODNODHLQHDIUNKJSHEHDGIUQBKDUQQHDIUHQUWDYOUDYASORHDOUWGROUDWQGUODWQGKJAGDSGKAGD会计师卡萨按施工队杭师大阿萨德口干口こここここここ１こちらこそよろしくお願いします"));
        testMapper.insert(test1);
             System.out.println("id:"+test1.getId());
            List<Test1> test1List=testMapper.selectList(new QueryWrapper<Test1>().eq("id",test1.getId()) );

        System.out.println("插入+查询完毕");
             System.out.println(test1List.toString());

    }




}
