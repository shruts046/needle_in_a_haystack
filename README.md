**Needle in a Haystack Project**

The Needle in a Haystack Project is a Java-based application designed for parsing and analyzing log files. The primary purpose of this project is to extract meaningful information from log entries, such as identifying suspicious activities or anomalies. It is particularly useful for system administrators, security analysts, and developers who need to monitor and analyze log data.

**Project Structure**

LogParser.java: Main class responsible for parsing log files. This class likely contains methods to read log files, extract relevant data, and identify patterns or anomalies.
SuspectEntry.java: Represents a data structure for suspect entries identified in the log files. This class may include attributes specific to suspicious activities.
LogParserTest.java: Unit tests for the LogParser class. These tests ensure the accuracy and reliability of the log parsing process.
SuspectEntryTest.java: Unit tests for the SuspectEntry class, validating the integrity and correctness of suspect entry data.

**Functionality**

Log Parsing: Analyzes log files to extract key information, focusing on identifying unusual or suspicious entries.
Data Representation: SuspectEntry class encapsulates the details of suspect activities, making it easier to manage and analyze them.
Testing and Validation: Comprehensive unit tests in LogParserTest and SuspectEntryTest ensure the robustness of the parsing process and data representation.

**How to Set Up**

Clone the repository to your local machine.
Ensure you have Java installed on your system. 
Open the project using a Java-compatible IDE.

**How to Run**

Execute LogParser.java to start the log parsing process.
Use the SuspectEntry class to handle and analyze suspect log entries.
Run the test cases in LogParserTest and SuspectEntryTest to validate the functionality.
