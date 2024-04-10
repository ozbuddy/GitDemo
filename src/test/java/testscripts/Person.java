package testscripts;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	 @JsonProperty("email")
	    private String email;

	    @JsonProperty("password")
	    private String password;

	    @JsonProperty("product")
	    private String product;

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getProduct() {
			return product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

}
