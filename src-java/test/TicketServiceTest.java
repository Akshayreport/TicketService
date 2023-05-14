package com.example.demo;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


@Test
class TicketServiceTest {


	@Test
	public void testTicketPrices_DisplayCorrectly() {
		String input = "2\n3\n1\n"; // Simulate user input: 2 adult tickets, 3 child tickets, 1 infant ticket
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);

		// Redirect console output for testing
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(outputStream);
		System.setOut(printStream);

		// Run the main method
		TicketService.main(new String[]{});

		// Retrieve the console output
		String consoleOutput = outputStream.toString();

		// Verify if the correct prices are displayed
		Assertions.assertTrue(consoleOutput.contains("Payment completed"));
		Assertions.assertTrue(consoleOutput.contains("You paid £70")); // 2 adult tickets * £20 + 3 child tickets * £10
	}

}
