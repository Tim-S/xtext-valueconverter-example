/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl

import org.eclipse.xtext.conversion.IValueConverterService
import org.xtext.example.mydsl.conversion.MyDslValueConverterService

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class MyDslRuntimeModule extends AbstractMyDslRuntimeModule {
	override Class<? extends IValueConverterService> bindIValueConverterService() {
        return MyDslValueConverterService;
    }
}