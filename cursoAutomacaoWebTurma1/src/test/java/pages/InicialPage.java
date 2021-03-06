package pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import map.InicialMap;

public class InicialPage {

	InicialMap inicialMap = new InicialMap();
	
	public void setPesquisa(CharSequence... valor) {
		inicialMap.pesquisa.sendKeys(valor);
	}

	public String getTituloLivro() {
		String livro = inicialMap.tituloLivro.getText();
		return livro;
	}

	public String getPreco() {
		return inicialMap.preco.getText();
	}

	public String getPrecoLista() {
		
		List<WebElement> livros = inicialMap.livros.getElements();

		for (WebElement elLivro : livros) {
			inicialMap.tituloLivroLista.setWebElement(elLivro);
			String tituloLivro = inicialMap.tituloLivroLista.getText();
			
			System.out.println(tituloLivro);

			if (tituloLivro.contains("Ajax com Java")) {
				inicialMap.precoLista.setWebElement(elLivro);

				return inicialMap.precoLista.getText();
			}
		}
		return null;
	}
	
	public void clickTitulo() {
		inicialMap.tituloLivro.click();
	}
	
	
	
	
	
	

}
