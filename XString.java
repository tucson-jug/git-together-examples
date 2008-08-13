public class XString {
	private String value;

	public String getValue() {
		return value;
	}
	
	public XString(String value) {
		this.value = value;
	}
	
	public String transform(String spec) {
		for (String tform: spec.split("/")) {
			String parts[] = tform.split(":");
			String command = parts[0];
			if (command.equals("rev"))
				reverse();
			else if (command.equals("repl"))
				repl(parts);
		}
		
		return getValue();
	}
	
	private void reverse() {
		value = new StringBuffer(value).reverse().toString();
	}
	
	private void repl(String parts[]) {
		StringBuffer result = new StringBuffer();
		
		int n = Integer.parseInt(parts[1]);
		for (int i = 1; i <=n; i++)	
			result.append(value);
		
		value = result.toString();
	}
}
