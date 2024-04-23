# Project Queue
The next program explains the use of queues in programming with the implementation of a game, 
where you write a word and the program checks that this word is correct or incorrect, 
and gives point for every correct word and subtracts point if you make a mistake . 
Also, you choose the level of difficulty and depending on the level, you get certain words. 
If, to finish the game with fewer than 0 points, you lose; if not, then you win.
## Recommends
- Use java 17 
- Please write words in the result
## Question
### Technical Difference between ArrayList and Queue in Java Collections
Similar to the previous question, both ArrayList and Queue in Java are data structures used for storing collections of elements. However, there are key technical differences between them:

### Order of Access to Elements:

**ArrayList:** Does not impose a specific order for accessing elements. You can access any element in the list by its index.

**Queue:** Follows FIFO (First-In-First-Out) order. The first element added to the queue (front) is the first to be removed. Basic operations include offer (adding an element) and poll (removing and returning the first added element). It also allows peek (getting the first element without removing it).

### Insertion and Removal of Elements:

**ArrayList:** Allows inserting elements at any position in the list. Removal can also be done from any position.

**Queue:** Insertions are only made at the back of the queue using offer. Removals are also done from the front using poll.

### Implementation:

**ArrayList:** Internally implemented using an underlying array. The size of the array can be dynamically adjusted to accommodate new elements.

**Queue:** Can be implemented using various data structures such as ArrayList, linked lists, or specialized structures like circular queues or queue buffers. The choice of implementation depends on the desired performance and memory characteristics.

### Use Cases:

**ArrayList:** Used when random access to elements is needed, list sorting, or when inserting or removing elements at any position is required.

**Queue:** Used when FIFO order needs to be followed, such as in managing wait queues, task processing, or buffer systems.
## From Jar.File
- Write this command in the terminal: 
- >java-jar + Name of jar file