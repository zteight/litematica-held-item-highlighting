This fork is of version 0.17.5-rc.1 for 1.20.4

It adds the feature of highlighting the currently held block in the schematic.
The colors don't automatically update when you switch what item you're holding,
they only update when a block update happens in a chunk, or if you toggle schematic rendering off and then back on again.

Litematica
==============
Litematica is a client-side Minecraft mod using LiteLoader.
It is more or less a re-creation of or a substitute for [Schematica](https://minecraft.curseforge.com/projects/schematica),
for players who don't want to have Forge installed.
For compiled builds (= downloads), see http://minecraft.curseforge.com/projects/litematica

Compiling
=========
* Clone the repository
* Open a command prompt/terminal to the repository directory
* run 'gradlew build'
* The built jar file will be in build/libs/
