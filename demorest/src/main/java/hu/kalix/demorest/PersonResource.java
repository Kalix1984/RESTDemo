package hu.kalix.demorest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("persons")
public class PersonResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Person getPerson() {
		System.out.println("GET meghívva");
		Person p1 = new Person();
		p1.setName("Kalix");
		p1.setAge(35);
		
		return p1;
	}
	
	
}
