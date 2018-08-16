package org.xtext.example.mydsl.conversion;

import com.google.inject.Inject;
import java.math.BigDecimal;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.xtext.example.mydsl.conversion.NumberValueConverter;

@SuppressWarnings("all")
public class MyDslValueConverterService extends DefaultTerminalConverters {
  @Inject
  private NumberValueConverter numberValueConverter;
  
  @ValueConverter(rule = "Number")
  public IValueConverter<BigDecimal> Number() {
    return this.numberValueConverter;
  }
}
