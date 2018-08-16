/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.mydsl.MyDslRuntimeModule
import org.xtext.example.mydsl.MyDslStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class MyDslIdeSetup extends MyDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new MyDslRuntimeModule, new MyDslIdeModule))
	}
	
}
