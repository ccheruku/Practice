public class UserInput {

	public static class TextInput {

		String value;

		public void add(char i) {
			if (Character.isDigit(Character.toString(i).charAt(0))|| Character.isAlphabetic(Character.toString(i).charAt(0))) {
				if(getValue() != null) {
					setValue(getValue() + Character.toString(i));
				} else {
					setValue(Character.toString(i));
				}
			}
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}


	}

	public static class NumericInput  extends TextInput {

		String value;

		public void add(char i) {
			if (Character.isDigit(Character.toString(i).charAt(0))
					) {
				if(getValue() != null) {
					setValue(getValue() + Character.toString(i));
				} else {
					setValue(Character.toString(i));
				}
			}
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

	}

	public static void main(String[] args) {
		TextInput input = new NumericInput();
		input.add('1');
		input.add('a');
		input.add('0');
		System.out.println(input.getValue());
	}
}
