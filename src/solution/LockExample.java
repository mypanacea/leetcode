package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LockExample {

	@Service
	public class ServiceTest {

		@Transactional
		public void test1 {
			test2();
		}

		@Transactional(propagation = Propagation.REQUIRES_NEW)
		public void test2() {
		}

	}

}