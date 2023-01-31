# COMP-129-COMP-55-Resurrection
A fork of the groupproject-team-4-hobby-lobby repository

## Description
This program is a 2-D dungeon crawler game where you go explore the map and defeat enemies. <br>
Controls for the Game:
- Use the arrow keys to move
- Press left-click to attack once you are close enough to the enemy
<br>
The health of your character can be seen in the top left of the screen.

## Editing the Level
In the current implementation, there is only one playable level. 
With the most recent changes to the program, there is now a new feature where you are able
to edit this one level. You can change things like the map layout (the walls),
the enemies which are on screen, and the stats of the character that you are playing. And you could
do all of this without programming experience. To do this, you must edit the 
`src/FirstLevelGeneration.txt` file. 

### Layout of the file
This is the layout for the following categories: Floor, TopWall, BottomWall, LeftWall, RightWall, InStairs, and OutStairs
<br>
`category:image-file-name.png,x-position,y-position,width,height` 
<br>

For the Enemy category: 
<br>
`Enemy:Enemy-type,enemy-hp,enemy-damage-stat,isVertical,x-pos,y-pos,direction`
<br>
Where Enemy-type has the following categories:
- Goblin
- Slime
- Boss
- Deadenemy
- Chest <br>
and isVertical refers to whether the enemy is moving on the x or y axis. <br>
You can have up to 100 enemies.
<br>

The following format is use to create the main character:
`MainCharacter:hero-image-name.png,x-pos,y-pos,dx,dy,playerHP`
where dx and dy are the amount of spaces the character can move in the x or y position.
<br>
Note: when editing the text-file, make sure to not include any spaces and some of the attributes
are case sensitive (the ones which are not numbers)

### Implementing the issues
The first part of the issue involved making it so the levels were dynamic. In the current implementation,
they were all static and the only way to change the photo of a wall or an enemy was to go into the
source code and edit the FirstLevel class attributes. The first change which was made was creating
a constructor for the class where you could see the different objects and attributes, so that you
could easily create multiple, unique levels if wanted.
<br>
The second level to the issues was to make it so someone with no coding experience can go and
edit the level. This means that they would not be able to go into the source code and edit the
parameters of the constructor. This new feature (which is summed up in section 2 of this `README.md`)
was implemented by parsing the input from the text file and creating objects base on what was parsed.
