package springbook.user.dao;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class SelfJUnitTest {
	@Autowired
	private ApplicationContext ctx;
	
	private static Set<SelfJUnitTest> set = new HashSet<>();
	private static ApplicationContext staticContext;
	
	@Test
	public void test1() {
		assertThat(set, not(hasItem(this)));
		set.add(this);
	}

	@Test
	public void test2() {
		assertThat(set, not(hasItem(this)));
		set.add(this);
	}
	
	@Test
	public void test3() {
		assertThat(set, not(hasItem(this)));
		set.add(this);
	}
}