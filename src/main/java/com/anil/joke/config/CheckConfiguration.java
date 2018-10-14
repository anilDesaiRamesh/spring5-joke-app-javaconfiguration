/**
 * 
 */
package com.anil.joke.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author Anil_Ramesh
 *
 */
@Configuration
public class CheckConfiguration {

	@Bean
	public ChuckNorrisQuotes getChuckNorrisQuotesObj() {
		return new ChuckNorrisQuotes();
	}

}
