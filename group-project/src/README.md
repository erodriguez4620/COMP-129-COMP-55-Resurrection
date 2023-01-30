# COMP 55 Resurrection Pt 2

## Description
With this assignment, there will be two main new features implemented: the dynamic recreation of the 
first level and the ability to edit a text file to change the level.

# Dynamic Creation of the First Level
Currently, the creation of the first level is static. In order to change the design of the first level, you
have to go into the src file and manually change it there. This new feature will make it so instead of
everything being determined (enemies, main character) in the FirstLevel.java src file, it will be in the
MainApplication.java file, where all of the screens are intialized.
## Pseudo Code
(Hard to create Pseudo Code for this features since it mostly involves moving things around)
Go into FirstLevel.java and remove all of the hardcoded variable declarations in FirstLevel.java. 
Create a constructor which takes enemies, images for the level design, and other level generation
Edit FirstLevel::generateLevel() to take the variables declared earlier above and use them to generate the level
Go into the MainApplication.java src file and create code which generates the FirstLevel variable

# Taking a Text File to Generate the Levels
To support non-programmer who would join the project, there will be a new feature which is introduced
which takes a text file with the information which is required to generate a level, parsed, and then
used in the construction of the first level.
## Psuedo Code
MainApplication::initializeFirstLevel("Text_file_name")

Open Textfile
While parsing through the text file:
  Read the first phrase and see what category it is trying to write to
    If it is an enemy, add to the enemies section
    If it is the level image, initialize it to the level Image
    etc.
  Create the First level using all of the information from above
