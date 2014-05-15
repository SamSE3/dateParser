#Introduction
Mission statement.     
To provide a description of all testable and plan-able aspects of an intergalactic spaceship.

General Description.
The spaceship is intended to go on an intra-galactic voyage to and from planet ‘GJ 180 b’ that lies in the habitable zone. The spaceship is capable of near light speed (0.98c) and will take 12.37 light years to reach the planet. In between the two planetary systems the crew will be kept alive in a hibernated sleep through stasis pods. During this time the crafts guidance systems will take over and keep the spaceship on track. Please see the project plan for additional details (would exist if real)

Schedule (iterative every lab/work session).

|Half|what|
|--------------|--------------|
|1st| write test cases (as unit tests)|
|2nd| start writing code|

#Required resources
Physical

|What		|why|
|--------------|--------------|
|a spaceship tile|to perform heat and integrity test on|
|the spaceship hull|to perform integrity tests on|
|the spaceship wings|to perform integrity tests on|
|the spaceship tail fins|to perform integrity tests on|
|the engine|to perform integrity tests on|
|the hibernation pods|to perform integrity tests on|
|the telemetry antennas|to perform impact and long distance signal quality tests on|
|the primary generator|to tests is durability and consumption over its expected lifetime|
|the secondary generator| to tests is durability and consumption over its expected lifetime|
|the fuel| to see if there are any affects in leaving it still over the flight|
|the radio system|to calibrate interfences|
|the water recycler| to test its tolerance over the flight|
|an air filter|to test its tolerance over the flight|
|food| to test the consumption aboard the ship|
|the climate control|to test that it can work in the coldness of space even if turning on near 0k|
|the clothing warn onboard|to test their durability|
|the space suits|to test their movability and life support systems|
|backup parts to any of the above devices| estimate weights|

Software

|What		|why|
|--------------|--------------|
|various software compilers |to test the controller software|
|the guidance controller|
|the rocket controller|
|the climate controller|
|the generator controller|
|the atmosphere controller|
|the intra-ship communications|
|the communication controller|
|the water purifier controller|
|the stasis pod controllers|

|testTeam1 repository| to store the controller and test software|

Testing tools 

|What		|why|
|--------------|--------------|
|impact machine|test impacts|
|vacuum chamber small| to test small object individually|
|large vacuumed chamber| to test larger objects|
|interference generator|to test how the systems handle interference|

Staff

|What		|why|
|--------------|--------------|
|10 test subjects|to test food supplies, life support systems in flight simulations|
|100 coders| to write and perform the test|

#Testable aspects
Unit testing aspects
* Physical testable aspects
 * the reliability of any component over the expected 26 year flight. This will include how long it will be running, its expected use and its ability to wake up after years of inactivity.
 * wing, hull, tail and engine responses to strikes from space rock and debris
 * heat resistance tiles resist heat and other forces
 * how the communication system handles interferences
 * that everything hibernates while in between systems.
 * that pods can maintain stasis for long durations (over the flight)
 * that failures of systems are reported to the crew
 * that adequate information is provided to repair all systems on board by any member of the crew
 * the moveability of the space suits
 * that spacesuits life-support systems work effectively.
 * that all possible multiple component failures have the backup parts required to fix them.
* Software testable aspects
 * the guidance controller
  * verify the sensitivity of its inertial gyroscopes using GPS data, speedometers air speed tubes etc.
  * tests its rocket burst durations and angles against the physics required to make turns and other movements.
 * the rocket controller
  * tests thrust ratios against expected
  * test burn lengths against expected
  * test that thrust levels are sustained or are compensated
 * the climate controller
  * too hot cools down
  * too cold then warms up
  * sends warm air to cool areas
  * sends cold air to warm areas
 * the generator controller
  * power output does not fluctuate
  * power capacity is always within 10% of maximum
  * power output increase as draw increases 
 * the atmosphere controller
  * oxygen levels increase if CO2 becomes to high
  * nitrogen levels remain constant
  * carbon dioxide is always removed
  * alerts if CO2 is not being filtered
 * the intra-ship communications
  * all connections can be established
  * incoming communications don’t break current communications
 * the communication controller
  * can compress wave forms to account for going away from earth
  * can expand wave forms to account for going to earth
 * the water purifier controller
  * removes (or within tolerances) Suspended Particles, Colloids, Dissolved Inorganic Solids, Dissolved Organics, Dissolved Gases, Microorganisms, Pyrogens and Viruses and Nucleases and DNA
  * alerts when filters are clogged
 * the stasis pod controllers
  * can ‘freeze’ without shocking the subject
  * can maintain stasis within tolerances
  * can ‘unfreeze’ without shocking the subject

Integration testing aspects
* test how components perform in conjunction to each in vacuum under real test conditions.
* to make sure all subsystems respond and integrate as a whole.
* a unmanned test flight to mars to test all but life support component
* a manned test flight to Pluto and back to test all systems.
…

#Non Testable aspects
* any crew related aspects such as training, selection and ability

#Test Produced documents
* The specifics of each test, if those tests pass and the information and reason for their modification.

#Risks and dependencies
* That it is not possible to quickly analyse the effects of such a long voyage in such a short amount of time.
* That is it difficult to sustain near 0k temperatures long enough for test to be 100 valid.

#Project Criteria
Goals: The aim is that all possible types of input are tested and that the program passes these tests

Success and Failure measured by: Success will be measured based on the amount of tests that pass combined with their relevance to the core functionality of the program
	
#References
* Using outline as per http://www.wikihow.com/Write-a-Test-Plan
* Markdown as per https://help.github.com/articles/markdown-basics and https://help.github.com/articles/github-flavored-markdown
* http://exoplanet.eu/catalog/gj_180_b/
