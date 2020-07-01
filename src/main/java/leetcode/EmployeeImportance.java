package leetcode;

import java.util.List;

public class EmployeeImportance {
	public static void main(String[] args) {

	}

	class Employee {
		public int id;
		public int importance;
		public List<Integer> subordinates;
	};

	public int getImportance(List<Employee> employees, int id) {
		int result = 0;
		Employee target = employees.stream().filter(employee -> employee.id == id).findFirst().get();
		result += target.importance;
		if (!target.subordinates.isEmpty()) {
			for (Integer subordinate : target.subordinates) {
				result += getImportance(employees, subordinate);
			}
		}
		return result;
	}

}
