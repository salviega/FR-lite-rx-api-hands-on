package io.pivotal.literx;

import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

/**
 * Learn how to create Flux instances.
 *
 * @author Sebastien Deleuze
 * @see <a href="https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Flux.html">Flux Javadoc</a>
 */
public class Part01Flux {

//========================================================================================

	// TODO Return an empty Flux
	Flux<String> emptyFlux() {
		return Flux.empty();
	}

//========================================================================================

	// TODO Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
	Flux<String> fooBarFluxFromValues() {
		return Flux.just("foo", "bar");
	}

//========================================================================================

	// TODO Create a Flux from a List that contains 2 values "foo" and "bar"
	Flux<String> fooBarFluxFromList() {
		List<String> people = new ArrayList<>();
		people.add("foo");
		people.add("bar");
		return Flux.fromIterable(people);
	}

//========================================================================================

	// TODO Create a Flux that emits an IllegalStateException
	private void foobar() {
		System.out.println("method private");
	}
	Flux<String> errorFlux() {
		List<String> people = new ArrayList<>();
		people.add("foo");
		people.add("bar");

		return Flux.error(new IllegalStateException());
	}

//========================================================================================

		// TODO Create a Flux that emits increasing values from 0 to 9 each 100ms
	Flux<Long> counter() {
		return Flux.range(0,10)
				.map(number -> number.longValue());
	}

}
