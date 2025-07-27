package solution;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution1834 {

	public static int[] getOrder(int[][] tasks) {
		int[] retVal = new int[tasks.length];
		Task[] temp = new Task[tasks.length];
		for (int i = 0; i < tasks.length; i++) {
			temp[i] = new Task(i, tasks[i][0], tasks[i][1]);
		}
		Arrays.sort(temp, Comparator.comparingInt(Task::getQueuePosition));
		Queue<Task> availableTasks = new PriorityQueue<>();
		int time = 0;
		int j = 0;

		for (int i = 0; i < temp.length; i++) {

			if (temp[i].getQueuePosition() > time) {
				time = temp[i].getQueuePosition();
			}

			while (j < temp.length && temp[j].getQueuePosition() <= time) {
				availableTasks.add(temp[j]);
				j++;
			}
			if (!availableTasks.isEmpty()) {
				Task process = availableTasks.poll();
				retVal[i] = process.getPosition();
				time = time + process.getDuration();
			}
		}


		return retVal;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getOrder(new int[][]{{1, 2}, {2, 4}, {3, 2}, {4, 1}})));
	}

	static class Task implements Comparable<Task> {

		private final int position;

		private final int queuePosition;

		private final int duration;

		public Task(final int position, final int queuePosition, final int duration) {
			this.position = position;
			this.queuePosition = queuePosition;
			this.duration = duration;
		}

		@Override
		public int compareTo(final Task o) {
			int firstCondition = Integer.compare(duration, o.duration);
			if (firstCondition != 0) {
				return firstCondition;
			}

			return Integer.compare(position, o.position);
		}

		public int getPosition() {
			return position;
		}

		public int getQueuePosition() {
			return queuePosition;
		}

		public int getDuration() {
			return duration;
		}
	}
}
