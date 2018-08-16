package org.xtext.example.mydsl.conversion

import java.math.BigDecimal
import java.math.BigInteger
import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractToStringConverter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.conversion.IValueConverter
import com.google.inject.Inject

class MyDslValueConverterService extends DefaultTerminalConverters {
	@Inject NumberValueConverter numberValueConverter;
	
	@ValueConverter(rule = "Number")
	def IValueConverter<BigDecimal> Number() { numberValueConverter }
}

class NumberValueConverter extends AbstractToStringConverter<BigDecimal>{
	
	override protected internalToValue(String string, INode node) throws ValueConverterException {
		if (string.startsWith("0x")) {
			return new BigDecimal(new BigInteger(string.substring(2), 16));
		}
		if (string.startsWith("0b")) {
			return new BigDecimal(new BigInteger(string.substring(2), 2));
		}
		return new BigDecimal(string);
	}
}