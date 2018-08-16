package org.xtext.example.mydsl.conversion;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractToStringConverter;
import org.eclipse.xtext.nodemodel.INode;

@SuppressWarnings("all")
public class NumberValueConverter extends AbstractToStringConverter<BigDecimal> {
  @Override
  protected BigDecimal internalToValue(final String string, final INode node) throws ValueConverterException {
    boolean _startsWith = string.startsWith("0x");
    if (_startsWith) {
      String _substring = string.substring(2);
      BigInteger _bigInteger = new BigInteger(_substring, 16);
      return new BigDecimal(_bigInteger);
    }
    boolean _startsWith_1 = string.startsWith("0b");
    if (_startsWith_1) {
      String _substring_1 = string.substring(2);
      BigInteger _bigInteger_1 = new BigInteger(_substring_1, 2);
      return new BigDecimal(_bigInteger_1);
    }
    return new BigDecimal(string);
  }
}
