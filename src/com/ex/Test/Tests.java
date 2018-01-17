package com.ex.Test;

import com.ex.Dao;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.junit.Test;

/**
 * Created by August Duet on 6/1/2017.
 */
public class Tests {

    @Mock
    Dao dao;

    @Rule
    MockitoRule junit = MockitoJUnit.rule();

    @BeforeClass
    public void initTest(){
        Mockito.when(dao.getAges()).thenReturn(new int[]{25, 31, 18, 17, 76});
    }

    @Test
    public void testAverageAge(){
        int[] ages = dao.getAges();
        System.out.println(ages);
    }
}
