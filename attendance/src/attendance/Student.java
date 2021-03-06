package attendance;

public class Student implements Attendee{
	private boolean inClass;
	private String first;
	private String last;
	
	public Student(String firstName, String lastName) {
		inClass = false;
		first = firstName;
		last = lastName;
	}
	
	public boolean isPresent() {
		return inClass;
	}
	
	public void setPresent(boolean present) {
		if(present == true) {
			this.inClass = true;
		}
		else {
			this.inClass = false;
		}
	}
	
	public String getFirstName() {
		return this.first;
	}
	
	public String getLastName() {
		return this.last;
	}
	
	public boolean mathces(String first, String last) {
		if(first.toLowerCase().equals(getFirstName().toLowerCase())){
			if(last.toLowerCase().equals(getLastName())) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean matches(String last) {
		return last.toLowerCase().equals(getLastName().toLowerCase());
	}
	
	public String getReportString() {
		String result = "";
		
		if(getLastName().length() > 17) {
			for(int i = 0; i < 17; i++) {
				result += getLastName().substring(i,i+1);
			}
			
			result += "...";
		}
		else {
			result += getLastName();
			
			while(result.length() < 20) {
				result += " ";
			}
		}
		
		if(getFirstName().length() > 17) {
			for(int i = 0; i < 17; i++) {
				result += getFirstName().substring(i,i+1);
			}
			
			result += "...";
		}
		else {
			result += getFirstName();
			
			while(result.length() < 40) {
				result += " ";
			}
		}
		
		if(inClass) {
			result += "PRESENT";
		}
		else {
			result += "ABSENT";
		}
		
		return result;
	}
}
