package com.pedrobit.mongocrud.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.pedrobit.mongocrud.domain.Order;
import com.pedrobit.mongocrud.domain.User;
import com.pedrobit.mongocrud.repository.OrderRepository;
import com.pedrobit.mongocrud.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		orderRepository.deleteAll();
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria", "maria@gmail.com");
		User gabriel = new User(null, "Gabriel", "gabriel@gmail.com");
		User pedro = new User(null, "Pedro", "pedro@gmail.com");

		userRepository.saveAll(Arrays.asList(maria, gabriel, pedro));
		
		Order order1 = new Order(null, sdf.parse("12/01/2019"), "Blusa Vermelha M", "Riachuelo", pedro);
		
		Order order2 = new Order(null, sdf.parse("23/03/2019"), "Calça Jeans G", "Renner", gabriel);
		
		Order order3 = new Order(null, sdf.parse("21/12/2018"), "Suéter Natalino P", "Riachuelo", maria);
		
		orderRepository.saveAll(Arrays.asList(order1, order2, order3));
	}
	
	

}
