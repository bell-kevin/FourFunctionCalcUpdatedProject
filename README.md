# FourFunctionCalcUpdatedProject
SDEV 1060 Project

In the last module's competency project, you created the Calculator project and added 4 unit tests, one for each calculation. Rather than run each individual test multiple times, you put multiple assert statements in each test. In this version of the project, you will use runners to provide data for multiple executions of the tests, and a test suite to run all of the tests with one command.

Make a COPY of the calculator project from Module 2. 

In the main project, overload all 4 calculation methods to work with doubles instead of integers. You should have 8 calculation methods, 4 that work with doubles and 4 that work with integers.

You already have some test cases for the integer calculations. The calculation methods using doubles require additional test cases. Create a complete set of test cases for the calculations that work with doubles. This needs to include the same types of checks listed in the Test Cases assignment in Module 1, plus you need to think about working with values with different numbers of decimal places. The numbers can range from -99.99 to 99.99, inclusive. Create these test cases in an Excel or Word document. There must be at least 10 test cases for each calculation.

(Java) In this new version of the project, each test method must be in its own file. When runners are providing data, there can be only one set of data that is used for all methods within that test file containing the runner. For the calculator operations, it is possible to use the same test data for addition and subtraction, and perhaps for multiplication, but any test with a value of zero will cause problems with the division operation. And the test data for integers differs from the test data for doubles. To practice runners more thoroughly, create different test files/classes for each operation and data type, and copy the data sets as appropriate. You can leave the existing test files from the previous project, or you can delete them with a refactor.

(Java) Once the test classes have runners, you could run each one individually, but it's so much faster to use a test suite. Add a test suite to the test package, and list the test methods for all of the calculator operations to run in that suite. Note that if you have the previous test files still in the package, all you have to do to remove them from the process is to leave them out of the list of files to run in the test suite. 

(C#) You can put all of the Data Test Methods in the same file. Each test method must have its own Data Rows. The data can be duplicated, just copy and paste, where appropriate. 

Run the tests and take a screenshot of the successful results.

Submission: table of test cases with new tests for doubles, screenshots of the successful run, and the root folder for the project.

== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
