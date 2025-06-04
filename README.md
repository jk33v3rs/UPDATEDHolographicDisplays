1.21 initial update taken from https://github.com/DmitryRendov under the terms of the open source licence - not forked from there for visibility's sake, and as I do not intend to maintain that code in perpetuity.
It is nonetheless with many thanks it is used and full attribution and recognition of authorship belong with that author. 

Further changes are pending, and an updated readme will be provided soon. 

If you see this and its been more than 3 months (ie. on or after 4 Sep 2025) and this line is still here - I didnt do that updated readme yet so I probably forgot, please do me the courtesy of sending a DM saying "Yo, Keevers, your Holographic Displays fork says to say 'Oi Dickhead, Its Keevers From The Past. Fix Holographic Displays Already- You Had 90 Whole Days Do It This Week!!. Yours Sincerely, You'"
Thanks In Advance. 


Holographic Displays
===================

Bukkit Dev Page: http://dev.bukkit.org/bukkit-plugins/holographic-displays

API tutorial: https://github.com/filoghost/HolographicDisplays/wiki

Development Builds: https://ci.codemc.io/job/filoghost/job/HolographicDisplays

## Maven
```xml
<repository>
    <id>codemc-repo</id>
    <url>https://repo.codemc.io/repository/maven-public/</url>
</repository>
```

```xml
<dependency>
    <groupId>me.filoghost.holographicdisplays</groupId>
    <artifactId>holographicdisplays-api</artifactId>
    <version>3.0.0</version>
    <scope>provided</scope>
</dependency>
```

## Gradle
```groovy
maven {
  url "https://repo.codemc.io/repository/maven-public/"
}
```

```groovy
compileOnly 'me.filoghost.holographicdisplays:holographicdisplays-api:3.0.0'
```

## License
Holographic Displays is free software/open source, and is distributed under the [GPL 3.0 License](https://opensource.org/licenses/GPL-3.0). It contains third-party code, see the included THIRD-PARTY.txt file for the license information on third-party code.
