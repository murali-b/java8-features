# java8-features
1. Java 8 – Lambda Expression
   //Syntax of lambda expression
   (parameter_list) -> {function_body}
   Lambda expression only has body and parameter list.
   1. No name – function is anonymous so we don’t care about the name
   2. Parameter list
   3. Body – This is the main part of the function.
   4. No return type – The java 8 compiler is able to infer the return type by checking the code. you need not to mention it explicitly.
2. Java 8 – Method references
   Method reference is a short and concise way to call methods, static methods and even constructors without any lengthy syntax. 
   Method references help to point to methods by their names even without specifying the arguments. Arguments are passed by the lambda expression. A method reference is described using "::" symbol.
3. Java 8 – Functional interfaces
4. Java 8 – Interface changes: Default and static methods
5. Java 8 – Streams
   The java.util.stream.Stream is a Java interface, and the specific classes that implement it are part of the internal, non-public API of the Java Development Kit (JDK). You typically do not interact with these concrete implementation classes directly. Instead, you create Stream instances using various factory methods or from existing data sources.
   Standard ways to obtain a Stream instance
   You obtain Stream instances through methods on other Java classes and interfaces, such as:
   From Collections: Using the stream() or parallelStream() methods on any class that implements the Collection interface (like ArrayList, HashSet).
   List<String> list = Arrays.asList("a", "b");
   Stream<String> stream = list.stream();
   From Arrays: Using the Arrays.stream() static method.
   String[] array = {"a", "b"};
   Stream<String> stream = Arrays.stream(array);
   From Static Factory Methods: Using methods like Stream.of() or Stream.iterate().
   Stream<String> stream = Stream.of("a", "b");
   From I/O channels: Using methods like Files.lines(Path path) which returns a Stream of lines from a file.
   From Primitive Specialized Streams: Java provides specialized interfaces for primitive types:
   IntStream for int values.
   LongStream for long values.
   DoubleStream for double values.
   The actual underlying classes that implement the Stream interface are internal to the JDK and their names or behavior are not part of the public API, meaning they can change between Java versions. The design focuses on using the Stream interface and its operations abstractly.
6. Java 8 – Stream filter
7. Java 8 – forEach()
8. Java 8 – Collectors class with example
9. Java 8 – StringJoiner class with example
10. Java 8 – Optional class with example
11. Java 8 – Arrays Parallel Sort