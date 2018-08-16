# Creating ValueConverters in Xtext
A small xtext-grammar that parses Numbers in binary- and hexadecimal notation to show how to create ValueConverters for your Xtext Grammars:
```
// example.mydsl
0xC0deaffe 0b1010101 12.34 42
```

## Steps to create a custom ValueConverter
1. Describe Grammar (
[MyDsl.xtext](org.xtext.example.mydsl/src/org/xtext/example/mydsl/MyDsl.xtext) )
2. Implement IValueConverterService  ( [MyDslValueConverterService.xtend](org.xtext.example.mydsl/src/org/xtext/example/mydsl/conversion/MyDslValueConverterService.xtend) )
3. Bind your MyDslValueConverterService in RuntimeModule ( [MyDslRuntimeModule.xtend](org.xtext.example.mydsl/src/org/xtext/example/mydsl/MyDsl.xtextMyDslRuntimeModule.xtend) )

Now you can use your converted Values in your generators ( [MyDslGenerator.xtend](org.xtext.example.mydsl/src/org/xtext/example/mydsl/generator/MyDslGenerator.xtend) ).
