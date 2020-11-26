package com.constructor_arg;

public class Foo {
	
	private Bar bar;
	private Baz baz;
	
	public Foo(Bar bar, Baz baz) {
		this.bar = bar;
		this.baz = baz;
		System.out.println("public Foo(Bar bar, Baz baz)");
	}

	public Foo( Baz baz, Bar bar) {
		this.baz = baz;
		this.bar = bar;
		System.out.println("public Foo( Baz baz, Bar bar)");
	}
}
