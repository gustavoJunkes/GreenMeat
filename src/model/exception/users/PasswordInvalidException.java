package model.exception.users;

public class PasswordInvalidException extends Exception{
		
		private String password;

		
		
		public PasswordInvalidException(String password) {
			super();
			this.password = password;
			
			
		}
		

		public String toString() {
			return "Formato de senha inválido";
		}

	}