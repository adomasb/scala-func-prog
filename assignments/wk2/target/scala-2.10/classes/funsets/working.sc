type Set = Int => Boolean

def contains(s: Set, elem: Int): Boolean = s(elem)

def singletonSet(elem: Int): Set = (x: Int) => x == elem

// characteristic function example
(x: Int) => x < 0

contains(singletonSet(2), 2)

// union
def union(s: Set, t: Set): Set = (x: Int) => contains(s, x) | contains(t, x)

val s = singletonSet(1)
val t = singletonSet(1)
contains(union(s, t), 3)

// intersect

def intersect(s: Set, t: Set): Set = (x: Int) => contains(s, x) & contains(t, x)

contains(intersect(s, t), 1)

