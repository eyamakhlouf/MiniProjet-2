/*package com.eya.livres;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class LivresApplication {
	public static void main(String[] args) {
		SpringApplication.run(LivresApplication.class, args);
	}
}*/

package com.eya.livres;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.eya.livres.entities.Livre;

import com.eya.livres.service.LivreService;
//
//public class LivresApplication implements CommandLineRunner {
////@Autowired
////LivreService livreService;
////public static void main(String[] args) {
////SpringApplication.run(LivresApplication.class, args);
////}
////@Override
////public void run(String... args) throws Exception {
////livreService.saveLivre(new Livre("PC Dell","bbb", 2600.0, new Date()));
////livreService.saveLivre(new Livre("PC Asus", "ccc",2800.0, new Date()));
////livreService.saveLivre(new Livre("Imprimante Epson","ddd", 900.0, new Date()));
////}
////}
@SpringBootApplication

public class LivresApplication{
	

	public static void main(String[] args) {
		SpringApplication.run(LivresApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		repositoryRestConfiguration.exposeIdsFor(Livre.class);
//	}
}
