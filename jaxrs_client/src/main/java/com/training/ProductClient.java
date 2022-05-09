package com.training;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ProductClient {

	public static void main(String[] args) {
		
		Client client=ClientBuilder.newClient();
		
		WebTarget target=client.target("http://localhost:8083/products");
		
		Invocation.Builder builder=target.request(MediaType.APPLICATION_JSON);
		
		Response resp=builder.get();
		
		//System.out.println(resp);
		
		int ch=2;
		
		if(ch==1) {
			
			Product[] list=resp.readEntity(Product[].class);
			
			for(Product eachProduct:list) {
				System.out.println(eachProduct);
			}
		
		}
		
		
		if(ch==2) {
			
		
		String object=resp.readEntity(String.class);
		
	
		System.out.println(object);
	
		}
		
		if(ch==3) {
		
			WebTarget findByIdTarget= target.path("/srch/105");
			
			Invocation.Builder builder2 = 
					findByIdTarget.request(MediaType.APPLICATION_JSON);
			
			Response findByResp = builder2.get();
			
			Product object=findByResp.readEntity(Product.class);
			
			System.out.println(object);
			
			}
		
		if(ch==4) {
			
		
		Product toAdd=new Product(78, "adc",700.0);
		
		Response response= builder.post(Entity.entity(toAdd,MediaType.APPLICATION_JSON));
		
	
		System.out.println(response.getStatus());
	
		System.out.println(response.readEntity(String.class));
		
		}
	}
}
