/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.xtext.example.mydsl.AbstractMyDslRuntimeModule;
import org.xtext.example.mydsl.conversion.MyDslValueConverterService;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class MyDslRuntimeModule extends AbstractMyDslRuntimeModule {
  @Override
  public Class<? extends IValueConverterService> bindIValueConverterService() {
    return MyDslValueConverterService.class;
  }
}