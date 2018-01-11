package vn.viettuts.action;

public class HelloWorldAction {
	private String name;
	
	public String execute() throws Exception {
		return "success";
	}
	
	public String getname(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}
