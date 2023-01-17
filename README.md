# What is the Josephus Problem? 
# https://en.wikipedia.org/wiki/Josephus_problem
"In computer science and mathematics, the Josephus problem (or Josephus permutation) is a theoretical problem related to a certain counting-out game.

A drawing for the Josephus problem sequence for 500 people and skipping value of 6. The horizontal axis is the number of the person. The vertical axis (top to bottom) is time (the number of cycle). A live person is drawn as green, a dead one is drawn as black.[1]
A number of people are standing in a circle waiting to be executed. Counting begins at a specified point in the circle and proceeds around the circle in a specified direction. After a specified number of people are skipped, the next person is executed. The procedure is repeated with the remaining people, starting with the next person, going in the same direction and skipping the same number of people, until only one person remains, and is freed.

The problem—given the number of people, starting point, direction, and number to be skipped—is to choose the position in the initial circle to avoid execution."

![image](https://user-images.githubusercontent.com/49254129/212791106-a52d8302-135c-4713-82a1-82ae3c9a689a.png)


# What is Josephus-Problem-Power-2 
It is an algorithm I developed to confirm that the last person standing in a circle of 2<sup>n</sup> people where every 2nd person is elimanated will always be the first person who was counted.
