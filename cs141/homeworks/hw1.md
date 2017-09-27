# HW 1: Song

## Topics
Your first program will require the use of static methods and println statements.  

## Details
This assignment is worth 10 points instead of the normal 20 points.  You are going to write a Java program that produces as output a cumulative song in which successive verses build on previous verses (as described in [http://en.wikipedia.org/wiki/Cumulative_song](http://en.wikipedia.org/wiki/Cumulative_song).  

## Instructions
Your program should produce as output the following song:

```
There was an old woman who swallowed a fly.
I don't know why she swallowed that fly,
Perhaps she'll die.

There was an old woman who swallowed a spider,
That wriggled and iggled and jiggled inside her.
She swallowed the spider to catch the fly,
I don't know why she swallowed that fly,
Perhaps she'll die.

There was an old woman who swallowed a bird,
How absurd to swallow a bird.
She swallowed the bird to catch the spider,
She swallowed the spider to catch the fly,
I don't know why she swallowed that fly,
Perhaps she'll die.

There was an old woman who swallowed a cat,
Imagine that to swallow a cat.
She swallowed the cat to catch the bird,
She swallowed the bird to catch the spider,
She swallowed the spider to catch the fly,
I don't know why she swallowed that fly,
Perhaps she'll die.

There was an old woman who swallowed a dog,
What a hog to swallow a dog.
She swallowed the dog to catch the cat,
She swallowed the cat to catch the bird,
She swallowed the bird to catch the spider,
She swallowed the spider to catch the fly,
I don't know why she swallowed that fly,
Perhaps she'll die.

<< Your custom sixth verse goes here >>

There was an old woman who swallowed a horse,
She died of course.
```

As indicated above, you should include a custom sixth verse that matches the pattern of the first five verses.  You must exactly reproduce the format of this output.

Most of our assignments will have a creative aspect where you have more flexibility than normal to come up with your own solution.  For this assignment, it involves writing a sixth verse that fits the pattern of the first five.  For example, some versions of the song have a sixth verse for swallowing a goat (“Just opened her throat to swallow a goat”).  Notice that the first two lines should either end in the same word (fly/fly, bird/bird, cat/cat, etc) or should end with rhyming words (spider/inside her).  You are not allowed to simply copy one of the previous animals or to use the verses you’ll find on the web (e.g., goat and cow).  You have to write your own verse.  _The text of the verse should not include hateful, offensive, or otherwise inappropriate speech._

You are to make use of static methods to avoid the “simple” redundancy.  In particular, you are to make sure that you use only one println statement for each distinct line of the song.  For example, this line:

```
Perhaps she'll die.
```

appears several times in the output.  You are to have only one println statement in your program for producing this line.  The more complex redundancy has to do with pairs of lines like these:

```
There was an old woman who swallowed a horse,
There was an old woman who swallowed a dog,
```

and like these:

```
She swallowed the dog to eat the cat,
She swallowed the cat to eat the bird,
```

It is not possible to avoid this redundancy using just methods and simple println statements, so you are not expected to do so.  There is, however, a structural redundancy that you can eliminate with static methods.  The key question to ask yourself is whether or not you have repeated lines of code that could be eliminated if you structured your static methods differently.

You should also be using static methods to capture the structure of the song.  You must, for example, have a different method for each of the seven verses of the song (verses are separated by blank lines in the output).  As a result, you will not have any println statements in main except perhaps a println that produces a blank line.

You should include a comment at the beginning of your program with some basic information and a description of the program in your own words, as in:

```
// <Your name here>
// <date>
// CS 141
// HW #1
//
// This program will...
```
