### Stack

#### What is a Stack?

Stack is a one-ended linear data structure which models a real world stack by having two primary operations,
namely **push** and **pop**.

**push** - put one element into the top.

**pop** - remove the top from the top.

#### When and where is a stack used ?
* Used by undo mechanisms in text editors.
* Used in compiler syntax checking for matching brackets and braces.
* Can be used to model a pile of books or plates.
* Used behind the scenes to support recursion by keeping track of previous function calls.
* Can be used to do Depth First Search (DFS) on a graph.

#### Complexity

| Pushing       | O(1) |
|---------------|------|
| **Popping**   | O(1) |
| **Searching** | O(n) |
| **Size**      | O(1) |

---

### Queues

#### What is a Queue ?
A queue is a linear data structure witch models real world queues by having two 
primary operations, namely **enqueue** and **dequeue**.

**enqueue** - put one element into the queue back.

**dequeue** - remove one element from queue front.

#### Queue Terminology
There does not seem to be consistent terminology for inserting and removing elements
from queues.

**Enqueue** = **Adding** = **Offering**

**Dequeue** = **Polling**

#### When and where is a Queue used?
* Any waiting line models a queue, for example a lineup at a movie theatre.
* Can be used to efficiently keep track of the x most recently added elements.
* Web server request management where you want first come first serve.
* Breadth First Search (BFS) graph traversal.
 
| Enqueue      | O(1)     |
|--------------|----------|
| **Dequeue**  | **O(1)** |
| **Peeking**  | **O(1)** |
| **Contains** | **O(n)** |
| **Removal**  | **O(n)** |
| **Is Empty** | **O(1)** |

---




