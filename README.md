# AutenticacaoBasicaSpringBootVersao2XX
Com a versão do springboot 2.XX se faz necessário uma alteração no método abaixo. Na vesão do sprinboot 1.XX este método é diferente:

Pacote :
br.com.sada.springsecurityautenticacaobasicav2.config

Classe:
SecurityConfig.java


Método : 
@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	    auth.inMemoryAuthentication()
		.withUser("admin").password("{noop}admin1").roles("ROLE").and()
		.withUser("usuario").password("{noop}usuario").roles("USER");
	
	}
