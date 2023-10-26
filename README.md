# Calculator Library

[![Bugs](http://localhost:9000/api/project_badges/measure?project=com.levik.demolibrary%3Ademolibrary&metric=bugs&token=sqb_eb855980d655c16e95be054b0abbc49ea26ef508)](http://localhost:9000/dashboard?id=com.levik.demolibrary%3Ademolibrary)
[![Code Smells](http://localhost:9000/api/project_badges/measure?project=com.levik.demolibrary%3Ademolibrary&metric=code_smells&token=sqb_eb855980d655c16e95be054b0abbc49ea26ef508)](http://localhost:9000/dashboard?id=com.levik.demolibrary%3Ademolibrary)
[![Duplicated Lines (%)](http://localhost:9000/api/project_badges/measure?project=com.levik.demolibrary%3Ademolibrary&metric=duplicated_lines_density&token=sqb_eb855980d655c16e95be054b0abbc49ea26ef508)](http://localhost:9000/dashboard?id=com.levik.demolibrary%3Ademolibrary)
[![Lines of Code](http://localhost:9000/api/project_badges/measure?project=com.levik.demolibrary%3Ademolibrary&metric=ncloc&token=sqb_eb855980d655c16e95be054b0abbc49ea26ef508)](http://localhost:9000/dashboard?id=com.levik.demolibrary%3Ademolibrary)
[![Quality Gate Status](http://localhost:9000/api/project_badges/measure?project=com.levik.demolibrary%3Ademolibrary&metric=alert_status&token=sqb_eb855980d655c16e95be054b0abbc49ea26ef508)](http://localhost:9000/dashboard?id=com.levik.demolibrary%3Ademolibrary)

This is a simple Java library that provides basic arithmetic operations. The library is designed to be easy to use and includes the following functionality:

- Addition
- Subtraction
- Multiplication
- Division

## Installation

To use this library, you can include the JAR file in your Java project. You can either build the JAR file from the provided source code or download a pre-built JAR file. Here are the steps for both options:

### Option 1: Build from Source

1. Clone or download this repository to your local machine.

2. Open a terminal or command prompt and navigate to the project directory.

3. Build the JAR file using Maven by running the following command:

   ```
   ./mvnw package
   ```

4. The JAR file will be generated in the `target` directory of the project.

5. Add the JAR file to your Java project as an external library.
6. Build the javadoc files using Maven by running the following command:

   ```
   ./mvnw javadoc:javadoc
   ```
7. The javadoc files will be generated in the `target/site/apidocs` directory of the project and open index.html

### Option 2: Download Pre-built JAR

1. Visit the [releases page](link-to-releases) on this repository.

2. Download the latest release JAR file.

3. Add the downloaded JAR file to your Java project as an external library.

## Usage

Here's a quick guide on how to use the Calculator library in your Java project:

1. Import the `Calculator` class in your Java file:

   ```java
   import com.levik.Calculator;
   ```

2. Create an instance of the `Calculator` class:

   ```java
   Calculator calculator = new SimpleCalculator();
   ```

3. Use the provided methods for arithmetic operations:

   ```java
   int sum = calculator.add(5, 3);
   int difference = calculator.subtract(10, 4);
   int product = calculator.multiply(6, 7);
   double quotient = calculator.divide(8, 2);
   ```

4. You can now use the calculated results in your application as needed.

## Example

Here's an example of using the Calculator library in a simple Java program:

```java
import com.example.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.add(5, 3);
        int difference = calculator.subtract(10, 4);
        int product = calculator.multiply(6, 7);
        double quotient = calculator.divide(8, 2);

        System.out.println("5 + 3 = " + sum);
        System.out.println("10 - 4 = " + difference);
        System.out.println("6 * 7 = " + product);
        System.out.println("8 / 2 = " + quotient);
    }
}
```

## License

This Calculator library is provided under the [MIT License](LICENSE). Feel free to use, modify, and distribute it as needed. If you find any issues or have suggestions for improvements, please [open an issue](link-to-issues) on this repository.

## Contact

If you have any questions or need assistance, please feel free to contact the author:

Author: Your Name
Email: your@email.com
GitHub: [Your GitHub Profile](link-to-your-github)
