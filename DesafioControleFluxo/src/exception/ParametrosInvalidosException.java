package exception;

public class ParametrosInvalidosException extends Exception{

	private static final long serialVersionUID = 1L;

	public ParametrosInvalidosException() {
		super("Ocorreu um erro desconhecido!");
	}

	public ParametrosInvalidosException(String mensagem) {
		super(mensagem);
	}
	
}
