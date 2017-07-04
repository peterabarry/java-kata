# java-kata 
#
## Overall approach:

**TDD rules** 

  1. Write the test.
  2. Make it Compile.
  3. Watch it Fail.
  4. Do Just Enough to make the tests pass.
  5. Refactor ( with some guidance below )
   
**Object Calisthenics Rules** 

  1. Use one level of indentation per method (one programming language branch/loop statement per method)
  2. Don’t use the else keyword (or switch)
  3. Wrap all primitives and strings (descriptive - not leaning on generic language primitives)
  4. Use only one dot per line (what about functional transformations).
  5. Don’t abbreviate
  6. Keep all entities small (methods 5 lines, classes 50 lines, package 50)
  7. Don’t use any classes with more than two instance variables
  8. Use first class collections (wrap collections treat them like primitives as per 3.)
  9. Don’t use any getters, setters or properties (HARDEST - POSSIBLY SLIP ON THIS UNTIL UNDERSTOOD BETTER)
    
**Code smells to look out for:**
    - Duplication, 
    - Violation of Calisthenics, 
    - DataEnvy, FeatureEnvy
    - Refactorings List (https://www.refactoring.com/catalog/).
    - Design Patterns List (http://wiki.c2.com/?DesignPatternsBook)
  
See Requirements.md
 
