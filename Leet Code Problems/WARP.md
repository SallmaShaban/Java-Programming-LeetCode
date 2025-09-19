# WARP.md

This file provides guidance to WARP (warp.dev) when working with code in this repository.

## Project Overview

This is a Java-based LeetCode problems repository designed for practicing and solving coding interview problems. The project uses IntelliJ IDEA as the primary IDE and is configured with Java 24 (OpenJDK).

## Repository Structure

```
Java-Programming-LeetCode/
├── .idea/                    # IntelliJ IDEA configuration
├── Leet Code Problems/       # Main module for LeetCode solutions
│   ├── src/                 # Source code directory
│   │   └── Main.java        # Entry point (currently basic template)
│   └── Leet Code Problems.iml  # IntelliJ module file
└── Java Programming .iml     # Root IntelliJ module file
```

## Development Environment

- **Java Version**: OpenJDK 24 (preview features enabled)
- **IDE**: IntelliJ IDEA
- **Build System**: No formal build system (Maven/Gradle) - uses IntelliJ's built-in compilation
- **Project Structure**: Multi-module IntelliJ project with manual compilation

## Common Commands

### Compilation and Execution
```bash
# Navigate to source directory
cd "Leet Code Problems/src"

# Compile a single Java file
javac ClassName.java

# Run compiled class
java ClassName

# Compile and run Main.java (current entry point)
javac Main.java && java Main
```

### Development Workflow
```bash
# Create a new problem solution file
touch "Problem[Number]_[Name].java"

# Example: Create Two Sum problem solution
touch "Problem1_TwoSum.java"

# Compile and test a specific solution
javac Problem1_TwoSum.java && java Problem1_TwoSum
```

### IntelliJ IDEA Integration
```bash
# Open project in IntelliJ IDEA
idea .

# Or if idea command not available
open -a "IntelliJ IDEA" .
```

## Code Architecture

### Current Structure
- **Single Module Approach**: All LeetCode solutions are contained within the "Leet Code Problems" module
- **Flat Source Directory**: All Java files are placed directly in `src/` without package structure
- **Individual Problem Files**: Each LeetCode problem should be implemented as a separate Java class

### Recommended Development Patterns

#### Problem Solution Template
```java
public class Problem[Number]_[Name] {
    public static void main(String[] args) {
        Problem[Number]_[Name] solution = new Problem[Number]_[Name]();
        // Test cases here
    }
    
    // Solution method(s) here
    public ReturnType solutionMethod(Parameters params) {
        // Implementation
    }
}
```

#### Naming Conventions
- Class names: `Problem[Number]_[ProblemName]` (e.g., `Problem1_TwoSum`)
- Method names: Use descriptive names based on the problem or algorithm approach
- Test methods: Include test cases in the `main` method for quick verification

## Development Guidelines

### File Organization
- Create one Java file per LeetCode problem
- Include problem number and descriptive name in filename
- Add problem description and constraints as comments at the top of each file

### Testing Approach
- Use the `main` method in each problem class for testing
- Include multiple test cases to verify correctness
- Add edge cases and boundary conditions

### Code Structure for Solutions
- Include the original problem statement as a comment
- Implement multiple approaches when applicable (brute force, optimized)
- Add time and space complexity analysis as comments

## IDE Configuration Notes

- Project uses IntelliJ IDEA modules (`.iml` files)
- Java language level set to JDK 24 with preview features
- Output directory: `out/` (generated during compilation)
- No external dependencies or build tools configured

## Quick Start for New Problems

1. Navigate to the source directory: `cd "Leet Code Problems/src"`
2. Create new problem file: `touch Problem[X]_[Name].java`
3. Use the problem solution template above
4. Compile and test: `javac Problem[X]_[Name].java && java Problem[X]_[Name]`
5. Refine solution and add additional test cases

## Java Version Compatibility

This project is configured for Java 24 with preview features enabled. If working with different Java versions:
- Ensure compatibility with language features used
- Update `.idea/misc.xml` if changing Java version in IntelliJ
- Verify compilation works with `javac -version` and `java -version`