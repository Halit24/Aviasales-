package com.aviasales.demo;

import com.aviasales.demo.entity.Opersales;
import com.aviasales.demo.service.Aviasales;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		Aviasales bean = ctx.getBean(Aviasales.class);

		//Добавление новой оперы
		bean.addNewOper(new Opersales("Норма", "Лирическая трагедия в двух актах", "14+", 20));
		bean.addNewOper(new Opersales("Евгений Онегин", "Роман", "0", 15));

		//Вывод всех опер или по одной
		bean.printAllOpersales();
		bean.viewOpera("Евгений Онегин");

		// изменение информации
		bean.changeInfo(bean.getConcert("Евгений Онегин"), "name", "Евгений Аньтипов");
		bean.printAllOpersales();

		//покупка и возврат билета
		bean.bayTickets("Норма");
		bean.ticketRefund("Норма");

		//удаление оперы
		bean.removeByOper("Норма");
		bean.printAllOpersales();
	}

}
