package xmlAula2019;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import xmlAula2019.model.Cidade;
import xmlAula2019.model.Endereco;
import xmlAula2019.model.Pessoa;
import xmlAula2019.model.Pessoas;
import xmlAula2019.model.Uf;

public class Main {

	public static void main(String[] args) {
		
		Cidade xanxere = new Cidade("Xanxere", new Uf("Santa Catarina" , "SC"));
		
		Endereco endereco = new Endereco("Rua teste 1", "bairro 1", xanxere);
		Endereco endereco2 = new Endereco("Rua teste 12", "bairro 12", xanxere);
		
		Pessoa pessoa = new Pessoa("Bruno", 060476, endereco);
		Pessoa pessoa2 = new Pessoa("Bruno2", 0604762, endereco2);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(pessoa);
		pessoas.add(pessoa2);
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Pessoa.class, Pessoas.class, Cidade.class, Uf.class, Endereco.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.marshal(pessoa, new File("pessoa.xml"));
			
			Unmarshaller unMarshaller = jaxbContext.createUnmarshaller();
			Pessoa pessoaOBJ = (Pessoa) unMarshaller.unmarshal(new File("pessoa.xml"));
			
			System.out.println(pessoaOBJ);
			
			Marshaller marshaller2 = jaxbContext.createMarshaller();
			StringWriter stringWriter = new StringWriter();
			marshaller2.marshal(pessoa, stringWriter);
			String xml = stringWriter.toString();
			System.out.println(xml);
			
			Marshaller marshallerPessoas = jaxbContext.createMarshaller();
			stringWriter = new StringWriter();
			marshallerPessoas.marshal(new Pessoas(pessoas), stringWriter);
			xml = stringWriter.toString();
			System.out.println(xml);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
